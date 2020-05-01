package com.csf.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo1 {
    public static void main(String[] args) {
        try {
            InetAddress ip1 = InetAddress.getByName("127.0.0.1");
            System.out.println(ip1);
            System.out.println(ip1.getHostName());

            InetAddress ip2 = InetAddress.getByName("www.baidu.com");
            System.out.println(ip2);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
