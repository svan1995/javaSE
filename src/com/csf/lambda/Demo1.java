package com.csf.lambda;

public class Demo1 {

    static class Like2 implements ILike{

        @Override
        public void func() {
            System.out.println("love2");
        }
    }

    public static void main(String[] args) {
//      方式一：最原始的方法
        ILike way1 = new Like();
        way1.func();

//      方式二：静态内部类
        new Like2().func();

//      方式三：局部内部类
        class Like3 implements ILike{
            @Override
            public void func() {
                System.out.println("love3");
            }
        }
        new Like3().func();

//      方式四：匿名内部类
        ILike way4 = new ILike() {
            @Override
            public void func() {
                System.out.println("love4");
            }
        };
        way4.func();

//      方式五：lambda表达式
        ILike way5 = () -> {
            System.out.println("love lambda");
        };
        way5.func();

    }


}

interface ILike{
    void func();
}

class Like implements ILike{

    @Override
    public void func() {
        System.out.println("love");
    }
}
