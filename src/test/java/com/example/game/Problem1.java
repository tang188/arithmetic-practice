package com.example.game;

import org.apache.tomcat.util.buf.HexUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName Problem1
 * @Description
 * @Author tangzhihong
 * @Date 2019/10/23 16:04
 * @Version 1.0
 **/
public class Problem1 {

    @Test
    public  void test(){
        String a = "3232235777";
        System.out.println(calc(a));
    }
    private static final char[] hex = "0123456789ABCDEF".toCharArray();
    public String calc(String a){
//        String rs;
        Long c = Long.parseLong(a);
        double SIXTEEN = 16;
        double d = 0;
        char[] res = new char[8];
        int[] ip = new int[4];
        int ipIdex = 0;
        for (int i = 7;i>=0;i--){
            long dou = (long)Math.pow(SIXTEEN,i);
            int init = 0;
            if (dou > c){
                res[7- i] = '0';
                continue;
            }else {
                init = (int)(c / dou);
                if (dou == 1){
                    init = (int) (c%16);
                }
            }
            int cc = init%16;

            if (i%2 == 0){
                char f = res[7 - i - 1];
                int index = 0;
                for (int j = 0; j < hex.length; j++) {
                    if (hex[j] == f){
                        index = j;
                        break;
                    }
                }
                int ipInt = cc + index*16;
                ip[ipIdex] = ipInt;
                ipIdex ++;
            }
            res[7 - i] =hex[cc];
        }
        boolean f = isInner(ip);
        return  "0x" + String.valueOf(res) + " " + f;
    }

    public boolean isInner(int[] ip)
    {
        if (ip[0] == 10){
            if (ip[1] <= 255){
                if (ip[2] <= 255){
                    if (ip[3] <= 255){
                        return true;
                    }
                }
            }
        }
        if (ip[0] == 172){
            if (ip[1] <= 31 && ip[1] >= 16){
                if (ip[2] <= 255){
                    if (ip[3] <= 255){
                        return true;
                    }
                }
            }
        }
        if (ip[0] == 192){
            if (ip[1] == 168){
                if (ip[2] <= 255){
                    if (ip[3] <= 255){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
