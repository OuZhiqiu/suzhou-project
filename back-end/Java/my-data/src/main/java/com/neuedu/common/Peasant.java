package com.neuedu.common;

public class Peasant extends ManKind {
    private int yearsOld;
    private static Peasant someKid = new Peasant();

    public static void main(String[] args) {
        someKid.setSalary(9999);
        someKid.setYearsOld(35);
        someKid.employeed();
        someKid.printAge();
    }

    @Override
    public void employeed() {
        if (someKid.getSalary() >= 10000) {
            System.out.println("小康水平");
        } else if (someKid.getSalary() < 10000) {
            System.out.println("贫困水平");
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
