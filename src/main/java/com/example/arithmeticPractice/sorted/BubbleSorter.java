package com.example.arithmeticPractice.sorted;

import java.util.Comparator;

/**
 * 冒泡排序
 * @ClassName BubbleSorter
 * @Description
 * @Author tangzhihong
 * @Date 2020/5/19 14:54
 * @Version 1.0
 **/
public class BubbleSorter implements Sorter {
    @Override
    public <T extends Comparable<T>> void sort(T[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int i1 = i + 1; i1 < list.length; i1++) {
                if (list[i].compareTo(list[i1]) >= 0){
                    T temp = list[i];
                    list[i] = list[i1];
                    list[i1] = temp;
                }
            }
        }
    }

    @Override
    public <T> void sort(T[] list, Comparator<T> comparable) {
        boolean swapped = true;
        for(int i = 1; i < list.length && swapped; i++) {
            swapped = false;
            for(int j = 0; j < list.length - i; j++) {
                if(comparable.compare(list[j], list[j + 1]) > 0 ) {
                    T temp = list[j];
                    list[j]= list[j + 1];
                    list[j+ 1] = temp;
                    swapped= true;
                }
            }
        }
    }

    /**
     * 冒泡：小-大
     * {1, 2, 5, 4, 3, 6, 7, 8, 9}
     * {1, 2, 4, 3, 5, 6, 7, 8, 9}
     * {1, 2, 3, 4, 5, 6, 7, 8, 9}
     * @param args
     */
    public static void main(String[] args) {
        int[] list = {2, 1, 5, 6, 4, 3, 7, 9, 8};
        for (int i = 0; i < list.length; i++) {
            for (int i1 = i + 1; i1 < list.length; i1++) {
                if (list[i] > list[i1]){
                    int temp = list[i];
                    list[i] = list[i1];
                    list[i1] = temp;
                }
            }
        }
        for (int i : list) {
            System.out.print(i + "  ");
        }
    }
}
