package main.java.day2;

public class Task2 {
    public static void main(String[] args) {
        int x=tt(5);
        System.out.println(x);
    }

    private static int tt(int a) {
        if (a==1){
            return 1;
        }
        return tt(a-1)*a;
    }
}
