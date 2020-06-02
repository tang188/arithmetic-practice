package com.example.arithmeticPractice.sorted;

import java.util.Comparator;
import java.util.List;

/**
 * 归并排序
 * @ClassName MergeSorter
 * @Description
 * @Author tangzhihong
 * @Date 2020/5/22 14:51
 * @Version 1.0
 **/
public class MergeSorter implements Sorter {

    @Override
    public <T extends Comparable<T>> void sort(T[] list) {
        T[] temp = (T[]) new Comparable[list.length];
        mSort(list, temp, 0, list.length- 1);
    }

    @Override
    public <T> void sort(T[] list, Comparator<T> comparable) {

    }


    private <T extends Comparable<T>> void mSort(T[] list, T[] temp, int low, int high) {
        if(low == high) {
            return ;
        }
        else {
            int mid = low + ((high -low) >> 1);
            mSort(list,temp, low, mid);
            mSort(list,temp, mid + 1, high);
            merge(list,temp, low, mid + 1, high);
        }
    }

    private <T extends Comparable<T>> void merge(T[] list, T[] temp, int low, int mid1, int high){
        int j = 0;
        int lowIndex = low;
        int mid = mid1 - 1;
        int n = high - lowIndex + 1;
        while (low <= mid && mid <= high){
            if (list[low].compareTo(list[mid]) < 0){
                temp[j++] = list[low++];
            } else {
                temp[j++] = list[mid++];
            }
        }
        while (low <= mid) {
            temp[j++] = list[low++];
        }
        while (mid <= high) {
            temp[j++] = list[mid++];
        }
        for (j = 0; j < n; j++) {
            list[lowIndex + j] = temp[j];
        }
    }
    /**
     * {2, 1, 5, 6, 4, 3, 7, 9, 8}
     * {2, 1, 5, 6} {4, 3, 7, 9, 8}
     * {2, 1} {5, 6} {4, 3} {7} {9, 8}
     * @param args
     */
    public static void main(String[] args) {
        Integer[] list = {2, 1, 5, 6, 4, 3, 7, 9, 8};
        Sorter sorter = new MergeSorter();
        sorter.sort(list);
        System.out.println("0");
    }
}
