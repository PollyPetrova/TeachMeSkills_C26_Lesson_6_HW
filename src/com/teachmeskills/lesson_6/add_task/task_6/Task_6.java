package com.teachmeskills.lesson_6.add_task.task_6;

import java.util.Scanner;

/**
 * Дан массив S из n целых чисел.
 * Существуют ли элементы a, b, c в S такие, что a + b + c = 0?
 * Найдите все уникальные триплеты в массиве, сумма которых равна нулю.
 * Примечание: элементы в тройке (a,b,c) должны быть в порядке неубывания. (т.е. а ≤ b
 * ≤ c).
 * В наборе решений не должно быть повторяющихся троек.
 */

public class Task_6 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= scanner.nextInt();

        int[] s=new int[n];

        System.out.println("Enter numbers of array:");
        for (int i = 0; i < n; i++) {
            s[i]=scanner.nextInt();
        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();

        twoSum(s,0);

    }

    public static void twoSum(int[] array, int aim){

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length-1 ; j++) {
                for (int k = array.length-1; k >j ; k--) {
                    if(array[i]+array[j]+array[k]==aim  && array[i]<=array[j]  && array[j]<=array[k]){
                        System.out.println("("+array[i]+") + ("+array[j]+") +("+array[k]+") = 0");
                    }
                }
            }
        }

    }

}
