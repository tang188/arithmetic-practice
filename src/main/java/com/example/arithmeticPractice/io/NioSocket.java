package com.example.arithmeticPractice.io;

import sun.nio.ch.sctp.SctpStdSocketOption;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.StandardSocketOptions;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName NioSocket
 * @Description
 * @Author tangzhihong
 * @Date 2020/9/28 11:23
 * @Version 1.0
 **/
public class NioSocket {

    public static void main(String[] args) {
        LinkedList<SocketChannel> clients = new LinkedList<>();

        try (ServerSocketChannel serverSocket = ServerSocketChannel.open()) {
            serverSocket.bind(new InetSocketAddress(8080));
            //设置是否阻塞
            serverSocket.configureBlocking(false);
            serverSocket.setOption(StandardSocketOptions.TCP_NODELAY, false);
            while (true){
                Thread.sleep(100);

                SocketChannel client = serverSocket.accept();
                //不会再阻塞，当没有客户端连接时，socketChannel = null,
                //如果客户端连接来了，accept返回的是客户端的fd（文件描述符），
                if (client == null){
                    System.out.println("没有连接进来。。。");
                }else {
                    //设置客户端读取也是非阻塞。
                    client.configureBlocking(false);
                    System.out.println("端口号为: " + client.socket().getPort());
                    clients.add(client);
                }
                ByteBuffer buffer = ByteBuffer.allocateDirect(4096);
                for (SocketChannel c : clients) {
                    int num = c.read(buffer);
                    if (num > 0){
                        buffer.flip();
                        byte[] aa = new byte[buffer.limit()];
                        buffer.get(aa);
                        String s = new String(aa);




                    }
                }

            }
        }catch (Exception e){

        }
    }
}
