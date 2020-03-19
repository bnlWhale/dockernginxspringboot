package com.neo.dao;

import com.neo.entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class StudentImpl implements StudentDao {

    private SqlSessionFactory sqlSessionFactory;

    public StudentImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public List<Student> findAllStudent(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Student> allStudent = sqlSession.selectList("school.findAllStudent");
        sqlSession.close();
        return allStudent;
    }

}
