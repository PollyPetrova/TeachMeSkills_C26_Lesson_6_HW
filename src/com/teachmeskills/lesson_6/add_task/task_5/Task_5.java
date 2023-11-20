package com.teachmeskills.lesson_6.add_task.task_5;

import java.util.Scanner;

/**
 * Дан массив целых чисел, найдите два числа, которые в сумме дают заданное число.
 * Функция twoSum должна возвращать индексы двух чисел так, чтобы они складывались
 * в целевое число.
 * Например:
 * Ввод: числа={2, 7, 11, 15}, цель=9.
 * Выход: индекс1=0, индекс2=1.
 */

public class Task_5 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= scanner.nextInt();

        int[] array=new int[n];

        System.out.println("Enter numbers of array:");
        for (int i = 0; i < n; i++) {
            array[i]=scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Enter your aim number:");
        int aim= scanner.nextInt();

        twoSum(array,aim);

    }

    public static void twoSum(int[] array, int aim){
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1; j >i ; j--) {
                if(array[i]+array[j]==aim){
                    System.out.println("index1= "+i+" index2= "+(j));
                }
            }
        }

    }

}
