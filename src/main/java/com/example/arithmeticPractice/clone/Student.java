package com.example.arithmeticPractice.clone;

/**
 * @ClassName Student
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/31 10:02
 * @Version 1.0
 **/
public class Student implements Cloneable{

    private String name;

    private int age;

    private Professor p;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Professor getP() {
        return p;
    }

    public void setP(Professor p) {
        this.p = p;
    }

    public Student(String name, int age, Professor p) {
        this.name = name;
        this.age = age;
        this.p = p;
    }

    @Override
    public Object clone() {
        Student o = null;
        try {
            //Object中的clone()识别出你要复制的是哪一个对象。
            o = (Student) super.clone();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return o;
    }

    public Object clone1() {
        Student o = null;
        try {
            //Object中的clone()识别出你要复制的是哪一个对象。
            o = (Student) super.clone();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        o.p = (Professor) p.clone();
        return o;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", p=" + p +
                '}';
    }
}
