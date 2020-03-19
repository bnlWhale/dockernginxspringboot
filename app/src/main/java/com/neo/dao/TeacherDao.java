package com.neo.dao;

import com.neo.entity.Teacher;

import java.util.List;

public interface TeacherDao {

    public List<Teacher> findAllTeachers();
}
