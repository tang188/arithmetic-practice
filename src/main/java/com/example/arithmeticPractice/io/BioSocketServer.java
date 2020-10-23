package com.example.arithmeticPractice.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName BIOSocketServer
 * @Description
 * @Author tangzhihong
 * @Date 2020/9/28 0:15
 * @Version 1.0
 **/
public class BioSocketServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8090);
        System.out.println("server socket start:8090");
        while (true){
            //可能阻塞
            Socket client = server.accept();
            System.out.println("step2: client \t" + client.getPort());

            new Thread(new Runnable() {
                Socket ss;
                public Runnable setSocket(Socket ss){
                    this.ss = ss;
                    return this;
                }
                @Override
                public void run() {

                    try {
                        InputStream inputStream = ss.getInputStream();
                        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                        while (true){
                            //可能阻塞
                            System.out.println(reader.readLine());
                        }
                    }catch (Exception e){

                    }
                }
            }.setSocket(client)).start();
        }
    }
}
