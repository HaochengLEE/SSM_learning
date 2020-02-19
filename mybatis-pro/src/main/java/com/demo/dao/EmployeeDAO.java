package com.demo.dao;

import com.demo.entity.Employee;
import com.demo.utils.SessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class EmployeeDAO {
    //SqlSession对应一次数据库对话，每次访问数据库都要创建他
    private static SqlSession sqlSession= SessionFactoryUtils.getSqlSessionFactory().openSession();
    private List<Employee> list;

    public List<Employee> findAll(){
        try {
            list=sqlSession.selectList("findAll");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭链接
            sqlSession.close();
        }

        return list;
    }


}
