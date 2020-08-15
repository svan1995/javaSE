package com.csf.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TableCreate {
    public static String createTableSql(String className) throws ClassNotFoundException {
        Class<?> aClass = Class.forName(className);
        DBTable dbTable = aClass.getAnnotation(DBTable.class);
        if (dbTable == null){
            System.out.println("NO DBTable annotations in class " + className);
            return null;
        }
        String tableName = dbTable.name();
        if(tableName.length() < 1)
            tableName = aClass.getName().toUpperCase();
        List<String> columnDefs = new ArrayList<>();
        for(Field field : aClass.getDeclaredFields()){
            String columnName = null;
            Annotation[] annotations = field.getDeclaredAnnotations();
            if (annotations.length < 1){
                continue;
            }
            //判断注解类型
            if(annotations[0] instanceof SQLInteger) {
                SQLInteger sInt = (SQLInteger) annotations[0];
                //获取字段对应列名称，如果没有就是使用字段名称替代
                if(sInt.name().length() < 1)
                    columnName = field.getName().toUpperCase();
                else
                    columnName = sInt.name();
                //构建语句
                columnDefs.add(columnName + " INT" +
                        getConstraints(sInt.constraint()));
            }
            //判断String类型
            if(annotations[0] instanceof SQLString) {
                SQLString sString = (SQLString) annotations[0];
                // Use field name if name not specified.
                if(sString.name().length() < 1)
                    columnName = field.getName().toUpperCase();
                else
                    columnName = sString.name();
                columnDefs.add(columnName + " VARCHAR(" +
                        sString.value() + ")" +
                        getConstraints(sString.constraint()));
            }
        }

        //数据库表构建语句
        StringBuilder createCommand = new StringBuilder(
                "CREATE TABLE " + tableName + "(");
        for(String columnDef : columnDefs)
            createCommand.append("\n    " + columnDef + ",");

        // Remove trailing comma
        String tableCreate = createCommand.substring(
                0, createCommand.length() - 1) + ");";
        return tableCreate;

    }

    private static String getConstraints(Constraints con) {
        String constraints = "";
        if(!con.allowNull())
            constraints += " NOT NULL";
        if(con.primaryKey())
            constraints += " PRIMARY KEY";
        if(con.unique())
            constraints += " UNIQUE";
        return constraints;
    }


    public static void main(String[] args) throws ClassNotFoundException {
        Class<Member> memberClass = Member.class;
        System.out.println(memberClass.getName());
        System.out.println(createTableSql(memberClass.getName()));
    }
}
