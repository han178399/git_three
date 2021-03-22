package com.example.demo.pojo;

import lombok.Data;

/**
 * @Author hpf
 * @Date 2021/3/22 18:43
 */
@Data
public class Card{

    private Long id;

    private String name;

    private Long ownerId;

    private Long quota;

    private Long used;

    private Long last;

    private String giveDay;

    private String creatDate;

    private String status;

}
