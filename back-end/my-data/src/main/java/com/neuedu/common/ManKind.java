package com.neuedu.common;

public class ManKind {
    private Integer sex;
    private Integer salary;

    public void manOrWorman(){
        if (sex==1){
            System.out.println("man");
        }else if (sex==0){
            System.out.println("women");
        }
    }

    public void employeed(){
        if (salary==0){
            System.out.println("nojob");
        }else if (salary!=0){
            System.out.println("job");
        }
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
