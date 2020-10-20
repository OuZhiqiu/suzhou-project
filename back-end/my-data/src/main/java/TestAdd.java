import java.util.Scanner;

public class TestAdd {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        test1();
//        text2();
        text3();
    }

    private static void test1() {
        int grade = sc.nextInt();
        if (grade == 100) {
            System.out.println("奖励一台BMW");
        } else if (grade > 80 && grade < 100) {
            System.out.println("奖励一台iphone5s");
        } else if (grade >= 60 && grade <= 80) {
            System.out.println("奖励一本参考书");
        } else {
            System.out.println("无奖励");
        }
    }

    private static void text2() {
        System.out.println("请输入月份");
        int a = sc.nextInt();
        switch (a) {
            case 1:
            case 2:
            case 3:
                System.out.println("春暖花开");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏日炎炎");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋高气爽");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬雪皑皑");
                break;
            default:
                System.out.println("输入月份无效");
                break;
        }
    }

    //break是终止本层循环，continue是终止本次循环
    private static void text3() {
        for (int i = 0; i <10; i++) {
            if (i==3){
            break;
            }
            System.out.println("break-->"+i);
        }
        for (int i = 0; i <10; i++) {
            if (i==3){
                continue;
            }
            System.out.println("continue-->"+i);
        }
    }
}
