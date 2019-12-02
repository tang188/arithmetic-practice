package com.example.game.huawei;

import org.junit.Test;

import java.time.LocalTime;

/**
 * @ClassName Problem3
 * @Description
 * @Author tangzhihong
 * @Date 2019/12/2 9:55
 * @Version 1.0
 **/
public class Problem3 {
    /*
        概率计算高级限制语言C、C++、Java、Python
        题目介绍
        一辆客车行驶路线为从A站-B站-C站，小明每天要在B站乘坐客车去C站上学。 客车从A站到达B站的时间服从均值20分钟、标准差2分钟的正态随机分布。
        请计算小明每天准时赶上客车的概率。
        示例
        客车早上从A站发车的时刻和概率为：
        出发时刻  8:00  8:03  8:05
        概率  0.5  0.3  0.2
        小明早上到达B站的时刻和概率为：
        到站时刻  8:18  8:20  8:22  8:24
        概率  0.4  0.3  0.1  0.2
     */
    @Test
    public void test(){
        LocalTime[] beginTime = new LocalTime[10];
        beginTime[0] = LocalTime.of(8, 0,0);
        beginTime[1] = LocalTime.of(8, 3,0);
        beginTime[2] = LocalTime.of(8, 5,0);
        float[] beginRate = new float[10];
        beginRate[0] = 0.5f;
        beginRate[1] = 0.3f;
        beginRate[2] = 0.2f;
        LocalTime[] endTime = new LocalTime[10];
        endTime[0] = LocalTime.of(8,18,0);
        endTime[1] = LocalTime.of(8,20,0);
        endTime[2] = LocalTime.of(8,22,0);
        endTime[3] = LocalTime.of(8,24,0);
        float[] endRate = new float[10];
        endRate[0] = 0.4f;
        endRate[1] = 0.3f;
        endRate[2] = 0.1f;
        endRate[3] = 0.2f;
        float rate = calculateOnTimeRate(beginTime, beginRate, endTime, endRate);
        System.out.println(rate);
    }

    private float calculateOnTimeRate(LocalTime[] beginTime, float[] beginRate, LocalTime[] endTime, float[] endRate) {
        float result = 0;
        for (int i = 0; i < beginTime.length; i++) {
            LocalTime beginT = beginTime[i];
            if (beginT == null) break;
            beginT = beginT.plusMinutes(20);
            for (int j = 0; j < endTime.length; j++) {
                if (endTime[j] == null) break;
                if (beginT.compareTo(endTime[j]) < 0){
                    break;
                }
                result += beginRate[i] * endRate[j];
            }
        }
        return result;
    }
}
