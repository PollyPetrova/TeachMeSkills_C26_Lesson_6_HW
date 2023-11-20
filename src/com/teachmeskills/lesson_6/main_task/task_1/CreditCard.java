package com.teachmeskills.lesson_6.main_task.task_1;

import java.util.Scanner;

class CreditCard {
    private int cardNumber;
    private double balance;

    public CreditCard(int cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void chargeSum(CreditCard creditCard) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want to put on the card:");
        double sumToPut = scanner.nextDouble();
        creditCard.setBalance(creditCard.getBalance() + sumToPut);
        System.out.println("The new balance is: " + creditCard.getBalance());
    }

    public static void takeOffSum(CreditCard creditCard) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want to take off from the card:");
        double sumToOutput = scanner.nextDouble();
        creditCard.setBalance(creditCard.getBalance() - sumToOutput);
        System.out.println("The new balance is: " + creditCard.getBalance());
    }

}
