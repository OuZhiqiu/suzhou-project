package com.neuedu.common;

public class Kids extends ManKind{
    private int yearsOld;

    public static void main(String[] args) {
        //  try / catch快捷键Ctrl+Alt+T
        try {
            Kids someKid=new Kids();
            someKid.setSex(1);
            someKid.setSalary(0);
            someKid.setYearsOld(35);
            someKid.manOrWorman();
            someKid.employeed();
            someKid.printAge();
            someKid.m1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void employeed() {
        System.out.println("kids should study and no job");
    }

    @Override
    void m1() {
        System.out.println("重写父类ManKind的抽象方法");
    }

    public void printAge(){
        System.out.println(yearsOld);
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
