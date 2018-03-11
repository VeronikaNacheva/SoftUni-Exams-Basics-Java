package Exam17December2017;

import java.util.Scanner;

public class P02_IvanovisFamily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scanner.nextLine());
        double priceFirst = Double.parseDouble(scanner.nextLine());
        double priceSecind = Double.parseDouble(scanner.nextLine());
        double priceThird = Double.parseDouble(scanner.nextLine());

        double allPresent = priceFirst + priceSecind + priceThird;

        double diff = Math.abs(amountMoney - allPresent);

        double plusTax = diff - (diff * 0.10);

        System.out.printf("%.2f", plusTax);
    }
}
