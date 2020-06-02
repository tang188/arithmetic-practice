package com.example.arithmeticPractice.sorted;

import java.util.Comparator;

/**
 * @InterfaceName Sorter
 * @Description
 * @Author tangzhihong
 * @Date 2020/5/19 14:52
 * @Version 1.0
 **/
public interface Sorter {

    public <T extends Comparable<T>> void sort(T[] list);

    public <T> void sort(T[] list, Comparator<T> comparable);

}
