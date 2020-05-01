package com.csf.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo2 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            System.out.println("server is running");
            serverSocket = new ServerSocket(9998);
            socket = serverSocket.accept();
            is = socket.getInputStream();

            fos = new FileOutputStream(new File("receive.png"));
            byte[] buffer = new byte[1024];
            int len;
            while ((len=is.read(buffer)) != -1){
                fos.write(buffer, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
