package com.example.arithmeticPractice.clone;

/**
 * @ClassName Mainclass
 * @Description
 * @Author tangzhihong
 * @Date 2020/7/31 10:05
 * @Version 1.0
 **/
public class Mainclass {

    public static void main(String[] args) {
        Professor p = new Professor("陈教授", 55);
        Student stu1 = new Student("李白", 15, p);
        Student stu2 = (Student) stu1.clone();

        System.out.println("first copy begin");
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println("first copy end");

        stu2.getP().setName("李教授");
        stu2.getP().setAge(45);

        System.out.println("second copy begin");
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println("second copy end");

        stu2.setName("李黑");

        System.out.println("third copy begin");
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println("third copy end");


        Professor p1 = new Professor("fbb", 60);
        Student stu3 = new Student("gp", 40, p);
        Student stu4 = (Student) stu3.clone1();
        System.out.println("first copy begin");
        System.out.println(stu3);
        System.out.println(stu4);
        System.out.println("first copy end");

        stu4.getP().setName("tfn");
        stu4.getP().setAge(90);

        System.out.println("second copy begin");
        System.out.println(stu3);
        System.out.println(stu4);
        System.out.println("second copy end");

        stu4.setName("gpbb");

        System.out.println("third copy begin");
        System.out.println(stu3);
        System.out.println(stu4);
        System.out.println("third copy end");
    }
}
