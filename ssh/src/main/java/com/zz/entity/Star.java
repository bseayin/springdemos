package com.zz.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
@Entity
public class Star {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String type;

}
