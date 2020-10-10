package main.java.day2;

public class Task3 {
    public static void main(String[] args) {
        tt();
    }

    private static void tt() {
        double a=2.0,b=1.0;
        double c=a/b;
        double sum=0.0;
        for (int i = 0; i < 20; i++) {
            sum+=c;
            c=a;
            a=a+b;
            b=c;
            c=a/b;
        }
        System.out.println(sum);
    }
}
