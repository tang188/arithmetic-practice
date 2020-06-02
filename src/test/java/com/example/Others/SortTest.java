package com.example.Others;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName SortTes
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/30 16:21
 * @Version 1.0
 **/
public class SortTest {
//    public static void main(String[] args) {
//        List<A> aList = new ArrayList<>();
//        aList.add(new A(1));
////        aList.add(new A(1));
//        aList.add(new A(2));
//        aList.add(new A(3));
//        aList.add(new A(4));
//        aList.sort(A::compareTo);
//        System.out.println(aList);
//        aList.sort((a1, a2) -> {
//            return a1.a > a2.a ? -1 : 1;
//        });
//        System.out.println(aList);
//    }

    public static void main(String[] args) {
        List<A> aList = new ArrayList<>();
        A a = new A(2);
        A a1 = new A(1);
        A a2 = new A(-3);
        A a3 = new A(1);
        aList.add(a);
        aList.add(a1);
        aList.add(a2);
        aList.add(a3);
        aList.sort(Comparator.comparing(A::getA).reversed());
        System.out.println(aList);
    }
}
