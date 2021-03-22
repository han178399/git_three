package com.example.demo.pojo;

import lombok.Data;

/**
 * @Author hpf
 * @Date 2021/3/22 18:46
 */
@Data
public class PayInfo {

    private Long id;

    private Long cardId;

    private String payDate;

    private Long payMoney;

    private Long handingFee;



}
