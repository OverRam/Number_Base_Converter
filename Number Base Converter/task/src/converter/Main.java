package converter;

import converter.systems.Decimal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean isContinue = true;

        while (isContinue) {
            isContinue = run();
        }
    }


    static boolean run() {
        Scanner sc = new Scanner(System.in);
        String num;
        int toSystemNum;
        String toFromDec;

        System.out.println("Do you want to convert /from decimal or /to decimal? (To quit type /exit) ");
        toFromDec = sc.nextLine();

        if (!"/exit".equals(toFromDec)) {
            System.out.print("Enter " + ("/to".equals(toFromDec) ? "source number" : "a number in decimal system"));
            num = sc.nextLine().toUpperCase();

            System.out.print("Enter " + ("/to".equals(toFromDec) ? "source" : "target") + " base: ");
            toSystemNum = sc.nextInt();

            System.out.println("Conversion " + ("/to".equals(toFromDec) ? "to decimal " : "") + "result: " +
                    Decimal.convertSwitch(num, toSystemNum, toFromDec) + "\n");
        }

        return !"/exit".equals(toFromDec);
    }

}
