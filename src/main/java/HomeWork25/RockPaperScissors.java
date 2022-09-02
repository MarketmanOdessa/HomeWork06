package HomeWork25;



import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




public class RockPaperScissors {
    private final User user;
    private final Computer computer;
    private String userName;
    private int userScore;
    private int computerScore;
    private int numberOfGames;
    private int maxNumberOfGames;

    private static final Logger LoggerDebug = LoggerFactory.getLogger("result");

    static ResourceBundle rb;

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
         //   System.out.println("Сделайте ваш ход " + userName + ": (К, Н, Б). " + " Или остановите игру: (Х).");
            System.out.println(rb.getString("move"));
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
          //  LoggerDebug.info("Пользователь вошел в игру");
          //  LoggerDebug.info(rb.getString("gameEntry"));
            System.out.println(rb.getString("gameEntry"));
           System.out.println(rb.getString("name"));
        //    LoggerDebug.info(rb.getString("name"));
            userName = inputScanner.nextLine();
         //   System.out.println(userName + ", какое количество игр вы хотите сыграть?");
         //   LoggerDebug.info(rb.getString("numberOfGames"));
            System.out.println(rb.getString("numberOfGames"));
            maxNumberOfGames = Integer.parseInt(inputScanner.nextLine());
            LoggerDebug.info("Пользователь выбрал количество игр: " + maxNumberOfGames);
        }
        Move userMove = user.getMove();
        Move computerMove = computer.getMove();
      //  System.out.println("\nВаш ход " + userMove + ".");
     //   System.out.println("Ход компьютера " + computerMove + ".\n");
      //  LoggerDebug.info("\nВаш ход " + userMove + ".");
     //   LoggerDebug.info("Ход компьютера " + computerMove + ".\n");
        LoggerDebug.info(rb.getString("userMove") + userMove + ".");
        LoggerDebug.info(rb.getString("computerMove") + computerMove + ".\n");
        System.out.println(rb.getString("userMove") + userMove + ".");
        System.out.println(rb.getString("computerMove") + computerMove + ".\n");

        int compareMoves = userMove.compareMoves(computerMove);
        switch (compareMoves) {
            case 0 -> System.out.println(rb.getString("draw"));
            case 1 -> {
                System.out.println(userMove + " beats " + computerMove + rb.getString("win"));
                userScore++;
            }
            case -1 -> {
                System.out.println(computerMove + " beats " + userMove + rb.getString("lose"));
                computerScore++;
            }
        }
        numberOfGames++;
        int leftGames = maxNumberOfGames - numberOfGames;
        LoggerDebug.info("Пользователь сыграл " + numberOfGames + " игр. Осталось сыграть: " + leftGames + " игр.");

        if (numberOfGames < maxNumberOfGames) {
            System.out.println();
            startGame();
        } else {
            printGameStats();
            System.out.println();
        //    System.out.print("Игра окончена. По итогам " + numberOfGames + " игр победитель: ");
            System.out.println(rb.getString("gameOver"));
         //   System.out.println(userScore<computerScore ? "Компьютер" : userName);
            LoggerDebug.info("Пользователь вышел из игры");
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
        rb = ResourceBundle.getBundle("langu", new Locale(args[0]));
        RockPaperScissors game = new RockPaperScissors();
        game.startGame();

    }
}
