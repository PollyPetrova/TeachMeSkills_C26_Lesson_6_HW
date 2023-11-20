package com.teachmeskills.lesson_6.add_task.task_3;

import java.util.Scanner;

/**
 * Пользователь делает вклад в размере a рублей сроком на years лет под 10% годовых
 * (каждый год размер его вклада увеличивается на 10%.Эти деньги прибавляются к
 * сумме вклада, и на них в следующем году тоже будут проценты).
 * Написать программу bank, принимающая аргументы a и years, и возвращающую
 * сумму, которая будет на счету пользователя.
 */

public class Task_3 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter sum of contribution: ");
        int a= scanner.nextInt();

        System.out.println("Enter for how many years will you contribute: ");
        int years= scanner.nextInt();

        Bank.makeContribution(a, years);

    }

}

