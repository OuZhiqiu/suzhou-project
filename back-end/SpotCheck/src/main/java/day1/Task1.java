package main.java.day1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println();
        tt();
    }

    private static void tt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入年份");
        int y = scanner.nextInt();
        System.out.println("输入月份");
        int m = scanner.nextInt();
        System.out.println("输入日份");
        int d = scanner.nextInt();
        int[] monDay = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        for (int i = 0; i < m - 1; i++) {
            sum += monDay[i];
        }
        sum += d;
        if (y%4==0&&(y%100!=0||y%400==0)&&y>2){
            sum++;
        }
        System.out.println(y+"年"+m+"月"+d+"日,是"+y+"年的第"+sum+"天");
    }
}
