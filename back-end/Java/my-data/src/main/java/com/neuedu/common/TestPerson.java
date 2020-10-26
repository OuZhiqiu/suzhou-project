package com.neuedu.common;

import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入年龄");
        int age=sc.nextInt();
        Person b=new Person();
        b.setAge(age);
        System.out.println(b.getAge());
        Person c=new Person("张三",12);
        System.out.println(c.toString());
        Person d=new Person("李四",12,"湖南科技职业学院");
        System.out.println(d.toString());
        Person e=new Person("王二",12,"湖南科技职业学院","移动应用开发");
        System.out.println(e.toString());
    }
}
