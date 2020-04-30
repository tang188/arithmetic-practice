package com.example.Others;

import com.sun.javafx.collections.ImmutableObservableList;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.*;
import java.util.stream.Stream;

/**
 * @ClassName StreamTest
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/23 17:50
 * @Version 1.0
 **/
public class StreamTest {

    @Test
    public void test(){
        System.out.println(UUID.randomUUID().toString());
    }



    @Test
    public void test1(){
        String[] arrays = {"a", "2", "3"};
        List<String> list = new ArrayList<>(Arrays.asList(arrays));
        for (String str : list) {
            if (str.equals("a")) {
                list.remove(str);
            }
        }
    }
    @Test
    public void test2(){
        String[] arrays = {"1", "2", "3", "4"};
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000 * 5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        List<String> list = new ArrayList<>(Arrays.asList(arrays));
        for (String str : list) {
            if (str.equals("2")) {
                list.remove(str);
            }
        }
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(() -> {
            System.out.println("hello");
        });
    }

    class THR extends FutureTask<Integer> {

        public THR(Runnable runnable, Integer result) {
            super(runnable, result);
        }

    }
}
