package com.neo.dao;

import com.neo.entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class ScoreImpl implements ScoreDao {


    private SqlSessionFactory sqlSessionFactory;

    public ScoreImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public List<Student> findAllScore() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Student> allStudent = sqlSession.selectList("school.gradeScoreCompare");
        sqlSession.close();
        return allStudent;
    }
}
