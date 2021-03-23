package com.example.demo.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * @Author hpf
 * @Date 2021/3/23 17:30
 */
@Getter
@Setter
public class AddCardEvent extends ApplicationEvent {

    /**
     * 用户id
     */
    private Long id;


    private Long money;


    public AddCardEvent(Object source) {
        super(source);
    }

    public AddCardEvent(Long id, Long money) {
        super(new Object());
        this.id = id;
        this.money = money;
    }
}
