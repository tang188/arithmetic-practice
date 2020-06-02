package com.example.Others;

import java.util.List;

/**
 * @ClassName A
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/30 16:22
 * @Version 1.0
 **/
public class A implements  Comparable<A>{

    Integer a;
    List<String> b;

    public A(Integer a, List<String> b) {
        this.a = a;
        this.b = b;
    }

    public List<String> getB() {
        return b;
    }

    public void setB(List<String> b) {
        this.b = b;
    }

    public A() {
    }

    public A(Integer a) {
        this.a = a;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }


    @Override
    public int compareTo(A o) {
        return o.getA().compareTo(a);
    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                '}';
    }
}
