package com.csf.design_pattern.prototype_pattern.deep_copy;

import java.io.*;

public class DeepCopyBySerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        AgeOne a=new AgeOne(20);
        StudentOne stu1=new StudentOne("person1",a,175);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oops = new ObjectOutputStream(bos);
        oops.writeObject(stu1);
        oops.flush();
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        StudentOne stu2 = (StudentOne) ois.readObject();
        System.out.println(stu1);
        System.out.println(stu2);

        stu1.setName("gg");
        stu1.setLength(111);
        a.setAge(55);
        System.out.println("---------------");
        System.out.println(stu1);
        System.out.println(stu2);
    }
}

/*
 * 创建年龄类
 */
class AgeOne implements Serializable {
    //年龄类的成员变量（属性）
    private int age;
    //构造方法
    public AgeOne(int age) {
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return this.age+"";
    }
}

class StudentOne implements Serializable{
    //学生类的成员变量（属性）,其中一个属性为类的对象
    private String name;
    private AgeOne aage;
    private int length;
    //构造方法,其中一个参数为另一个类的对象
    public StudentOne(String name,AgeOne a,int length) {
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

    public AgeOne getaAge() {
        return this.aage;
    }

    public void setaAge(AgeOne age) {
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
}