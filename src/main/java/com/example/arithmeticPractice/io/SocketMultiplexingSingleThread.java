package com.example.arithmeticPractice.io;

import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName SocketMultiplexingSingleThread
 * @Description
 * @Author tangzhihong
 * @Date 2020/9/28 14:40
 * @Version 1.0
 **/
public class SocketMultiplexingSingleThread {

    private ServerSocketChannel server = null;

    private Selector selector = null;

    int port = 9000;

    public void init(){
        try {
            server = ServerSocketChannel.open();
            server.configureBlocking(false);
            server.bind(new InetSocketAddress(port));

            selector = Selector.open();

            server.register(selector, SelectionKey.OP_ACCEPT);

        }catch (Exception e){

        }
    }

    public void start(){
        init();
        System.out.println("server is on ！");
        try {

            while (true){
                Set<SelectionKey> keys = selector.keys();
                System.out.println("selection key size:" + keys.size());

                //select()
                while (selector.select(300) > 0){
                    Set<SelectionKey> keys1 = selector.selectedKeys();
                    Iterator<SelectionKey> itr = keys1.iterator();
                    while (itr.hasNext()){
                        SelectionKey key = itr.next();
                        itr.remove();
                        if (key.isAcceptable()){
//                            accept
                        }else if (key.isReadable()){
//                            read
                        }
                    }
                }
            }
        }catch (Exception e){

        }
    }
}
