package main.java.day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        tt();
    }

    private static void tt() {
        Scanner scanner = new Scanner(System.in);
        int[][] studentGrade = new int[2][5];
        int[] B = new int[2];
        for (int i = 0; i < studentGrade.length; i++) {
            System.out.println("输入学生" + (i + 1) + "的成绩");
            int sum = 0;
            for (int j = 0; j < studentGrade[i].length; j++) {
                System.out.print("科目"+(j+1)+"为：");
                studentGrade[i][j] = scanner.nextInt();
                sum += studentGrade[i][j];
            }
            B[i]=sum/5;
        }
        for (int i = 0; i < B.length; i++) {
            System.out.println("学生"+(i+1)+"的平均成绩为"+B[i]);
        }
    }
}
