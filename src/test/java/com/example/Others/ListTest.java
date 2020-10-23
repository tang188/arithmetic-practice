package com.example.Others;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ListTest
 * @Description
 * @Author tangzhihong
 * @Date 2020/8/6 19:48
 * @Version 1.0
 **/
public class ListTest {

//    @Test
    public static void testListRemove() {

    }
        public static void test2(){

            String[] arrays = new String[]{"1", "2", "3"};
            List<String> list = new ArrayList(Arrays.asList(arrays));
            Iterator var2 = list.iterator();

            while(var2.hasNext()) {
                String str = (String)var2.next();
                if (str.equals("1")) {
                    var2.remove();
                }
            }

    }

    public static void test1(){

        String[] arrays = {"1", "2", "3", "2", "4"};
        List<String> list = new ArrayList<>(Arrays.asList(arrays));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
            if("4".equals(list.get(i)))
                list.remove(i);
        }
    }

    public static void main(String[] args) {
        String[] arrays = {"a", "b", "c"};
        List<String> list = new ArrayList<>(Arrays.asList(arrays));
        for (String str : list) {
            if (str.equals("a")) {
                list.remove(str);
            }
        }
    }
}
