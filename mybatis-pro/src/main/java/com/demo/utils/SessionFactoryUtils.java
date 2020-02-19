package com.demo.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SessionFactoryUtils {
    private static String RESOURCE="mybatis-config.xml";
    private static SqlSessionFactory sqlSessionFactory;
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();

    //创建一个初始化SqlSessionFactory的方法
    public static void initSqlSessionFactory(){
        try {
            InputStream is= Resources.getResourceAsStream(RESOURCE);
            //SqlSessionFactoryBuilder在创建SqlSessionFactory后就没有用了
            //SqlSessionFactory一般只创建一次，会一直在运行过程中始终存在
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //获取工厂对象方法
    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }

    //关闭SqlSession的方法
    public static void close(){

        SqlSession session=threadLocal.get();
        if(session!=null){
            session.close();
            threadLocal.set(null);
        }

    }

}
