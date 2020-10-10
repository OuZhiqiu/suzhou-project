package main.java.day1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        tt();
    }

    private static void tt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个三位数");
        int a = scanner.nextInt();
        if (a >= 100 && a < 1000) {
            double b1 = Math.pow((a % 10), 3);
            double b2 = Math.pow((a / 10 % 10), 3);
            double b3 = Math.pow((a / 100), 3);
            if (a == (b1 + b2 + b3)) {
                System.out.println(a + "是水仙花数");
            } else {
                System.out.println(a + "不是水仙花数");
            }
        } else {
            System.out.println("输入数字不符合");
        }
    }
}
