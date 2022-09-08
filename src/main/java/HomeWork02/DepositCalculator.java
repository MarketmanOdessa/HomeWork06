package HomeWork02;

public class DepositCalculator {
    public static void main(String[] args) {
        double UAH = Double.parseDouble(args[0]);
        double percent = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);
        calc(UAH, percent,years);
    }
    public static void calc (double money, double p, int y) {
        for (int i = 1; i <= y; i++) {
            System.out.println("Накопленная сумма денег за " + i + " год(а): " + String.format("%.2f",money*(Math.pow(1+(p/100),i))));
            System.out.println("Начислено за " + i + "й год: " + String.format("%.2f",(money*(Math.pow(1+(p/100),i)))-(money*(Math.pow(1+(p/100),i-1)))));
        }
    }
}
