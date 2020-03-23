package com.neo.entity;

import lombok.Data;


import java.io.Serializable;
import java.util.List;

@Data
public class Student implements Serializable {

    private String s_id;
    private String s_name;
    private String s_sex;
    private String s_birth;
    private List<Score> listOfScore;
    private List<Course> listOfCourse;

}
