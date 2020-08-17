package com.csf.design_pattern.prototype_pattern.shallow_copy;

public class CopyDemo02 {
    public static void main(String[] args) {
        Age a=new Age(20);
        Student stu1=new Student("person1",a,175);
        Student stu2 = (Student) stu1.clone();
        System.out.println(stu1);
        System.out.println(stu2);
        stu1.setLength(199);
        stu1.setName("hello");
        a.setAge(28);
        System.out.println("---------------");
        System.out.println(stu1);
        System.out.println(stu2);
    }
}

/*
 * 创建学生类
 */
class Student implements Cloneable{
    //学生类的成员变量（属性）,其中一个属性为类的对象
    private String name;
    private Age aage;
    private int length;
    //构造方法,其中一个参数为另一个类的对象
    public Student(String name,Age a,int length) {
        this.name=name;
        this.aage=a;
        this.length=length;
    }
    //eclipe中alt+shift+s自动添加所有的set和get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Age getaAge() {
        return this.aage;
    }

    public void setaAge(Age age) {
        this.aage=age;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length=length;
    }
    //设置输出的字符串形式
    public String toString() {
        return "姓名是： "+this.getName()+"， 年龄为： "+this.getaAge().toString()+", 长度是： "+this.getLength();
    }
    //重写Object类的clone方法
    @Override
    public Object clone() {
        Object obj=null;
        //调用Object类的clone方法，返回一个Object实例
        try {
            obj= super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}