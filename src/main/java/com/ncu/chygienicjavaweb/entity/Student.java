package com.ncu.chygienicjavaweb.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author nogra
 */
@Data
public class Student implements Serializable {
    private String name;
    private int sex;
    private int id;
}
