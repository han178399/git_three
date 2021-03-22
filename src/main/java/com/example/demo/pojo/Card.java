package com.example.demo.pojo;

import lombok.Data;

/**
 * @Author hpf
 * @Date 2021/3/22 18:43
 */
@Data
public class Card {

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
