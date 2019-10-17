package com.example.arithmeticPractice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @ClassName HuaweiMaxScore
 * @Description
 * @Author tangzhihong
 * @Date 2019/10/15 15:41
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class HuaweiMaxScore {

    @Test
    public void testScore(){
        String a = "5 7";
        byte[] b = a.getBytes();
        System.setIn(new ByteArrayInputStream(b));
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(scanner.next());
        }while (scanner.hasNext());
        scanner.close();

    }
}
