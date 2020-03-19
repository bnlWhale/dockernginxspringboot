package com.neo;

import com.neo.dao.*;
import com.neo.entity.Baby;
import com.neo.entity.Student;
import com.neo.entity.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComposeApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("Hello Spring Boot Docker Compose!");
	}


	private SqlSessionFactory factory;
	private TeacherDao teacherDao;
	private InputStream in;
	// 作用：在测试方法前执行这个方法
	@Before
	public void setUp() throws Exception{
		//1.读取配置文件
		in = Resources.getResourceAsStream("SqlMapConfig.xml");
		//2.创建SqlSessionFactory工厂
		factory = new SqlSessionFactoryBuilder().build(in);
	}

	@After//在测试方法执行完成之后执行
	public void destroy() throws IOException {
		in.close();
	}

	//根据用户名模糊查询用户列表

	@Test
	public void testFindUserByUserName() throws Exception{
		TeacherDao userdao = new TeacherImpl(factory);
		List<Teacher> list = userdao.findAllTeachers();
		for (Teacher user:list) {
			System.out.println(user);
		}
	}

	@Test
	public void testShowAllStudent() throws Exception{
		StudentDao sDao = new StudentImpl(factory);
		List<Student> list = sDao.findAllStudent();
		for(Student student:list){
			System.out.println(student);
		}
	}

	/*
	@Test
	public void testInsertBaby() throws Exception{
		BabyDao babydao = new BabyImpl(factory);
		Baby baby = new Baby();
		baby.setDob(LocalDate.now());
		baby.setName("aa");
		int result = babydao.insertBaby(baby);
		System.out.println("after a baby was insert, his id is:"+result);
	}
    */
}
