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

    /**
     * 刷卡日期
     */
    private String payDate;

    /**
     * 刷钱数量
     */
    private Long payMoney;

    /**
     * 手续费
     */
    private Long handingFee;

    /**
     * pay+handingFee
     */
    private Long allMoney;


}
