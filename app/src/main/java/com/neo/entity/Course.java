package com.neo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Course implements Serializable {

    private String c_id;
    private String c_name;
    private String t_id;


}
