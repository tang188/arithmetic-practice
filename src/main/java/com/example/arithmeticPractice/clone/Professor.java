package com.example.arithmeticPractice.clone;

/**
 * @ClassName Professor
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/31 10:03
 * @Version 1.0
 **/
public class Professor implements Cloneable {

    private String name;

    private int age;

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

    public Professor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() {
        Professor p = null;
        try {
            p = (Professor) super.clone();
        }catch (Exception e){

        }
        return p;
    }
}
