package com.example.game.huawei;

import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Problem1
 * @Description
 * @Author tangzhihong
 * @Date 2019/11/28 16:20
 * @Version 1.0
 **/
public class Problem1 {

//    判断输入天数为当年的第几天初级限制语言C、C++、Java、Python
//            题目介绍
//    输入一个日期，格式为xxxx-xx-xx，判断这一天为当年的第几天？
//    示例
//    输入：2019-1-2
//    输出：2

    private int month;
    private int day;
    private static int[] daysWithOut2;
    private static int[] sumDaysWithOut2;

    static {
        daysWithOut2 = new int[]{31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        sumDaysWithOut2 = new int[daysWithOut2.length];
        init();
    }

    static void init(){
        int sum = 0;
        for (int i = 0; i < daysWithOut2.length; i++) {
            sum += daysWithOut2[i];
            sumDaysWithOut2[i] = sum;
        }
    }


    static int month2Day(String yearString){
        Integer year = new Integer(yearString);
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)){
            return 29;
        }
        return 28;
    }

    static int calcDay(String date){
        List<String> dateSplit = Arrays.asList(date.split("-"));
        int month2Days = month2Day(dateSplit.get(0));
        int month = new Integer(dateSplit.get(1));
        int day = new Integer(dateSplit.get(2));
        int sum = 0;
        if (month - 2 < 0){
            return day;
        }else {
            sum = sumDaysWithOut2[month - 2];
        }
        if (month > 2){
            sum += month2Days;
        }
        return sum + day;
    }

    public static void main(String[] args) {
        String input = "2019-1-10";
        String input2 = "2019-02-10";
        String input3 = "2019-05-15";
        String input4 = "2020-05-15";
        int sum = calcDay(input);
        int sum2 = calcDay(input2);
        int sum3 = calcDay(input3);
        int sum4 = calcDay(input4);
        Assert.assertEquals(10,sum);
        Assert.assertEquals(41,sum2);
        Assert.assertEquals(135,sum3);
        Assert.assertEquals(136,sum4);
    }
}
