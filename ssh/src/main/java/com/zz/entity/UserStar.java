package com.zz.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class UserStar {
    @Id
    @GeneratedValue
    private Long id;
    private Long userId;
    private Long starId;
}
