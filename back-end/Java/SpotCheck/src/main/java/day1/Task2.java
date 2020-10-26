package main.java.day1;

public class Task2 {
    public static void main(String[] args){
        tt();
    }

    private static void tt() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"X"+j+"="+i*j+"  ");
            }
            System.out.println();
        }
    }
}
