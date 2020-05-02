package com.csf.reflect;

import java.lang.annotation.*;

public class Demo5 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<Student> studentClass = Student.class;

        Annotation[] annotations = studentClass.getAnnotations();
        for (Annotation annotation: annotations){
            System.out.println(annotation);
        }

        Table table = studentClass.getAnnotation(Table.class);
        System.out.println(table.value());

        java.lang.reflect.Field id = studentClass.getDeclaredField("id");
        Field annotation = id.getAnnotation(Field.class);
        System.out.println(annotation.column());
        System.out.println(annotation.length());
        System.out.println(annotation.type());
    }
}

@Table("db_student")
class Student{
    @Field(column = "db_id", type = "int", length = 10)
    private int id;

    @Field(column = "db_age", type = "int", length = 10)
    private int age;

    @Field(column = "db_name", type = "varchar", length = 3)
    private String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Table{
    String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Field{
    String column();
    String type();
    int length();
}
