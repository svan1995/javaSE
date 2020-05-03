package com.csf.thread;

import java.util.concurrent.*;

public class Demo5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建执行服务
        ExecutorService service = Executors.newFixedThreadPool(1);
        //提交执行
        Future<Boolean> future = service.submit(new ThreadTest3());
        //获取结果
        Boolean result = future.get();
        System.out.println(result);
        //关闭服务
        service.shutdownNow();

    }
}

class ThreadTest3 implements Callable<Boolean>{

    @Override
    public Boolean call() throws Exception {
        for(int i=0; i<100000;i++){

        }
        return true;
    }
}