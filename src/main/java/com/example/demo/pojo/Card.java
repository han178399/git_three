package com.example.demo.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author hpf
 * @Date 2021/3/22 18:43
 */
@Data
@Entity
@Table
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long ownerId;

    /**
     * 总额
     */
    private Long quota;

    /**
     * 已用额度
     */
    private Long used;

    /**
     * 剩余额度
     */
    private Long last;

    /**
     * 账单日
     */
    private String giveDay;

    private String creatDate;

    private String status;

}
