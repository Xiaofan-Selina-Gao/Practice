package com.example.pilotlecture;

import org.junit.jupiter.api.Test;
import org.springframework.context.event.SourceFilteringListener;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Inet {
    @Test
    public void client() throws Exception{
        //InetAddress will give the IP address of specified web site example
        InetAddress address1 = InetAddress.getByName("127.0.0.1");
        //SocketAdress is used to create the Socket at end point with InetAddress and port number
        Socket socket = new Socket(address1,8899);
        //The first argument – IP address of Server. ( 127.0.0.1  is the IP address of localhost, where code will run on the single stand-alone machine).
        //The second argument – TCP Port. (Just a number representing which application to run on a server. For example, HTTP runs on port 80. Port number can be from 0 to 65535)
        OutputStream os = socket.getOutputStream();
        os.write("hello world".getBytes());
        socket.close();
        os.close();
        System.out.println(address1);
    }
    @Test
    public void servers() throws Exception{
        ServerSocket serverSocket = new ServerSocket(8899);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[5];
        int len;
        while((len =inputStream.read(buffer))!= -1){
            byteArrayOutputStream.write(buffer, 0, len);
        }
        System.out.println("servers accepted: " + byteArrayOutputStream.toString());
        serverSocket.close();
        socket.close();
        inputStream.close();
    }
}
//网络通讯