package com.teachmeskills.lesson_6.add_task.task_4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Повернуть массив из n элементов вправо на k шагов.
 * Например, с n = 7 и k = 3 массив [1,2,3,4,5,6,7] вращается до [5,6,7,1,2,3,4].
 */

public class Task_4 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n= scanner.nextInt();

        System.out.println("Enter the number to move the array: ");
        int k=scanner.nextInt();
        if(k>=n){
            System.out.println("Enter another number!");
            return;
        }

        int[] array1=new int[n];
        int[] array2=new int[n];

        System.out.println("Enter numbers of array:");
        for (int i = 0; i < n; i++) {
            array1[i]=scanner.nextInt();
        }

        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.println();

        System.out.println("Changed array:");
        for (int i = 0; i < n; i++) {
            if(i<=k){
                array2[i+k]=array1[i];
            }
            else{
                array2[i-k-1]=array1[i];
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array2));

    }

}
