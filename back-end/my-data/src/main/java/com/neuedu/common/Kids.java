package com.neuedu.common;

public class Kids extends ManKind{
    private int yearsOld;

    public static void main(String[] args) {
        Kids someKid=new Kids();
        someKid.setSex(1);
        someKid.setSalary(0);
        someKid.setYearsOld(35);
        someKid.manOrWorman();
        someKid.employeed();
        someKid.printAge();
    }

    @Override
    public void employeed() {
        System.out.println("kids should study and no job");
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
