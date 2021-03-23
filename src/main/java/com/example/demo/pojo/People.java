package com.example.demo.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author hpf
 * @Date 2021/3/22 18:41
 */
@Data
@Entity
@Table
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long cardNum;

    private Long money;

    private String createDate;
}
