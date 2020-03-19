package com.neo.dao;

import com.neo.entity.Baby;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class BabyImpl implements BabyDao {

    private SqlSessionFactory sqlSessionFactory;

    // 通过构造方法注入
    public BabyImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public int insertBaby(Baby baby){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int res = sqlSession.insert("family.insertBaby", baby);
        sqlSession.commit();
        sqlSession.close();
        return res;
    }
}
