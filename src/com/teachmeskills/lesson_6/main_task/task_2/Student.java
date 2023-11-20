package com.teachmeskills.lesson_6.main_task.task_2;

import java.util.Arrays;
import java.util.Scanner;

public class Student {

    public String name;
    public String surname;
    public int passportNum;
    public String groupName;

    public Student(String name,String surname,int passportNum,String groupName){
        this.name=name;
        this.surname=surname;
        this.passportNum=passportNum;
        this.groupName=groupName;
    }

    public static void enterInf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of the student " +(i+1)+": ");
            String name = scanner.nextLine();
            System.out.println("Enter surname of the student " +(i+1)+": ");
            String surname = scanner.nextLine();
            System.out.println("Enter passport number of the student " +(i+1)+": ");
            int passportNum = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter group name of the student " +(i+1)+": ");
            String groupName = scanner.nextLine();

            students[i]=new Student(name, surname, passportNum, groupName);

        }
        showStudents(students);
    }

    public static void showStudents(Student[] students) {
        int k=1;
        for (Student student : students) {
            System.out.println("Information of the "+k+" student:");
            System.out.println("Name: " + student.name);
            System.out.println("Surname: " + student.surname);
            System.out.println("Passport number: " + student.passportNum);
            System.out.println("Group name: " + student.groupName);
            System.out.println();
            k++;
        }
    }

}
