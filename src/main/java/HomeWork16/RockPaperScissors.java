package HomeWork16;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private final User user;
    private final Computer computer;
    private String userName;
    private int userScore;
    private int computerScore;
    private int numberOfGames;
    private int maxNumberOfGames;

    private enum Move {
        ROCK, PAPER, SCISSORS;
        public int compareMoves(Move otherMove) {
            if (this == otherMove)
                return 0;
            return switch (this) {
                case ROCK -> (otherMove == SCISSORS ? 1 : -1);
                case PAPER -> (otherMove == ROCK ? 1 : -1);
                case SCISSORS -> (otherMove == PAPER ? 1 : -1);
            };
        }
    }
    private class User {
        private final Scanner inputScanner;
        public User() {
            inputScanner = new Scanner(System.in);
        }
        public Move getMove() {
            System.out.println("Сделайте ваш ход " + userName + ": (К, Н, Б). " + " Или остановите игру: (Х).");
            String userInput = inputScanner.nextLine();
            userInput = userInput.toUpperCase();
            char firstLetter = userInput.charAt(0);
            if (firstLetter == 'К' || firstLetter == 'Н' || firstLetter == 'Б' || firstLetter == 'Х') {
                switch (firstLetter) {
                    case 'К':
                        return Move.ROCK;
                    case 'Н':
                        return Move.PAPER;
                    case 'Б':
                        return Move.SCISSORS;
                    case 'Х':
                        numberOfGames = maxNumberOfGames-1;
                        System.out.println("Сделайте последний ход, чтобы завершить игру и увидеть статистику.");
                        System.out.println("По всем не сыграным играм, будет засчитана ничья.");
                }
            }
            return getMove();
        }
    }

    private static class Computer {
        public Move getMove() {
            Move[] moves = Move.values();
            Random random = new Random();
            int index = random.nextInt(moves.length);
            return moves[index];
        }
    }

    public RockPaperScissors() {
        user = new User();
        computer = new Computer();
        userScore = 0;
        computerScore = 0;
        numberOfGames = 0;
    }

    public void startGame() throws IOException {
        if (numberOfGames==0) {
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("Введите ваше имя:");
            userName = inputScanner.nextLine();
            System.out.println(userName + ", какое количество игр вы хотите сыграть?");
            maxNumberOfGames = Integer.parseInt(inputScanner.nextLine());
        }
        Move userMove = user.getMove();
        Move computerMove = computer.getMove();
        System.out.println("\nВаш ход " + userMove + ".");
        System.out.println("Ход компьютера " + computerMove + ".\n");

        int compareMoves = userMove.compareMoves(computerMove);
        switch (compareMoves) {
            case 0 -> System.out.println("Ничья");
            case 1 -> {
                System.out.println(userMove + " beats " + computerMove + ". Вы победили!");
                userScore++;
            }
            case -1 -> {
                System.out.println(computerMove + " beats " + userMove + ". Вы проиграли.");
                computerScore++;
            }
        }
        numberOfGames++;

        if (numberOfGames < maxNumberOfGames) {
            System.out.println();
            startGame();
        } else {
            printGameStats();
            System.out.println();
            System.out.print("Игра окончена. По итогам " + numberOfGames + " игр победитель: ");
            System.out.println(userScore<computerScore ? "Компьютер" : userName);
        }
    }

    private void printGameStats() throws IOException {
        int wins = userScore;
        int losses = computerScore;
        int ties = numberOfGames - userScore - computerScore;
        double percentageWon = (wins + ((double) ties) / 2) / numberOfGames;

        String pgs = ( "\n" + "Всего игр: " + numberOfGames + "\n" + "Победы: " + wins + "\n" + "Поражения: " + losses + "\n" + "Ничьи :" + ties + "\n" + "-----" + "\n");

        System.out.print("+");
        printDashes(68);
        System.out.println("+");


        System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  |  %14s  |\n",
                "WINS", "LOSSES", "TIES", "GAMES PLAYED", "PERCENTAGE WON");


        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(18);
        System.out.println("|");


        System.out.printf("|  %6d  |  %6d  |  %6d  |  %12d  |  %13.2f%%  |\n",
                wins, losses, ties, numberOfGames, percentageWon * 100);


        System.out.print("+");
        printDashes(68);
        System.out.println("+");

        Path pathDir = FileSystems.getDefault().getPath("").toAbsolutePath();
        String fileName = "game.log";
        String s = pathDir.toAbsolutePath().toString();
        File file = new File(s, File.separator.concat(fileName));
        if (file.exists()) {
            Files.write(Path.of(s + File.separator.concat(fileName)), pgs.getBytes(), StandardOpenOption.APPEND);
        }
        else {
            file.createNewFile();
            Files.write(Path.of(s + File.separator.concat(fileName)), pgs.getBytes(), StandardOpenOption.APPEND);
        }
    }

    private void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }

    public static void main(String[] args) throws IOException {
        RockPaperScissors game = new RockPaperScissors();
        game.startGame();
    }


}
