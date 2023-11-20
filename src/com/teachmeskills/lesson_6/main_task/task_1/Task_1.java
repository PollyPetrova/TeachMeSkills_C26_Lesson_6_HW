package com.teachmeskills.lesson_6.main_task.task_1;

import java.util.Scanner;

/**
 * Создать класс CreditCard c полями номер счета, текущая сумма на счету.
 * Создайте один конструктор с двумя параметрами.
 * Добавьте метод, который позволяет начислять сумму на кредитную карточку. Метод принимает на вход сумму и добавляет эту сумму к текущей.
 * Подуймайте, как стоит задать входные и выходные параметры метода.
 * Добавьте метод, который позволяет снимать с карточки некоторую сумму. Метод принимает на вход сумму и отнимает эту сумму от текущей.
 * Подуймайте, как стоит задать входные и выходные параметры метода.
 * Добавьте метод, который выводит текущую информацию о карточке.
 * Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
 * Тестовый сценарий для проверки:
 * Положите деньги на первые две карточки и снимите с третьей.
 * Выведите на экран текущее состояние всех трех карточек.
 */

public class Task_1 {

    public static void main(String[] args) {

        CreditCard creditCard1 = new CreditCard(34789587, 456.5);
        CreditCard creditCard2 = new CreditCard(22104720, 12.4);
        CreditCard creditCard3 = new CreditCard(12578001, 789);

        Scanner scanner=new Scanner(System.in);
        System.out.println("What card do you want to chose 1, 2 or 3:");
        int num= scanner.nextInt();
        switch (num){
            case(1):
                System.out.println("Balance of the first card: "+creditCard1.getBalance());
                CreditCard.chargeSum(creditCard1);
                break;
            case(2):
                System.out.println("Balance of the second card: "+creditCard2.getBalance());
                CreditCard.chargeSum(creditCard2);
                break;
            case(3):
                System.out.println("Balance of the third card: "+creditCard3.getBalance());
                CreditCard.takeOffSum(creditCard3);
                break;
            default:
                System.out.println("Wrong number!");
        }

    }

}
