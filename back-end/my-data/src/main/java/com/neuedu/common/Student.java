package com.neuedu.common;

import java.util.Arrays;

public class Student {
    private String name;
    private Integer age;
    private String[] course;
    private String[] hobby;

    public Student() {
    }

    public Student(String name, Integer age, String[] course, String[] hobby) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getCourse() {
        return course;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "学生信息{" +
                "名字='" + name + '\'' +
                ", 年龄=" + age +
                ", 参加的课程=" + Arrays.toString(course) +
                ", 兴趣=" + Arrays.toString(hobby) +
                '}';
    }

    public static void main(String[] args) {
        String[] courseArray={"书法","外语"};
        String[] hobbyArray={"音乐","舞蹈"};
        Student student=new Student("张三",18,courseArray,hobbyArray);
        System.out.println(student.toString());
    }
}
