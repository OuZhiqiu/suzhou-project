package com.neuedu.common;

public class Teacher extends ManKind {
    private int yearsOld;
    private static Teacher someKid = new Teacher();

    public static void main(String[] args) {
        someKid.setSex(1);
        someKid.setYearsOld(35);
        someKid.manOrWorman();
        someKid.printAge();
    }

    @Override
    public void manOrWorman() {
//        super.manOrWorman();
        if (someKid.getSex()==1){
            System.out.println("男老师");
        }else if (someKid.getSex()==0){
            System.out.println("女老师");
        }
    }

    void m1() {

    }

    public void printAge() {
        System.out.println(yearsOld);
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
