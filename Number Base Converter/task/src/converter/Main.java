package converter;

import converter.systems.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in decimal system: ");
        long num = sc.nextLong();
        System.out.print("Enter target base: ");
        int toSystemNum = sc.nextInt();
//        int conversionResult = sc.nextInt();
        System.out.println("Conversion result: " + ConvertTo.system(num, 10, toSystemNum));
    }
}
