package com.neo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Score implements Serializable {

    private String s_id;
    private String c_id;
    private int s_score;

}
