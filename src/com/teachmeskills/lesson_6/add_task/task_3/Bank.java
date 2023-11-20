package com.teachmeskills.lesson_6.add_task.task_3;

public class Bank {

    public int a;
    public int years;

    public Bank(int a,int years){
        this.a=a;
        this.years=years;
    }

    public static void makeContribution(int a, int years){
        double sum=a;
        double percent=0.1;
        for (int i = 0; i < years; i++) {
            sum+=sum*percent;
        }
        System.out.println("Sum of money in " +years+" years= "+sum);
    }

}
