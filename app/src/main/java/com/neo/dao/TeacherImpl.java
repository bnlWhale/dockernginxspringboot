package com.neo.dao;

import com.neo.entity.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class TeacherImpl implements TeacherDao {

    private SqlSessionFactory sqlSessionFactory;

    // 通过构造方法注入
    public TeacherImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public List<Teacher> findAllTeachers(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Teacher> teachers = sqlSession.selectList("school.findAllTeachers");
        sqlSession.close();
        return teachers;
    }

}
