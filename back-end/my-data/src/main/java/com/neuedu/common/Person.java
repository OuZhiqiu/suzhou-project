package com.neuedu.common;

public class Person {
    private String name;
    private Integer age;
    private String school;
    private String major;

    public Person() {
    }

    public Person(Integer age) {
        this.age = age;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, Integer age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Person(String name, Integer age, String school, String major) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.major = major;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age>=0&&age<=130){
        this.age = age;
        }else {
            throw new RuntimeException("给定的年龄不合法,必须在0~130之间");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "com.neuedu.common.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
