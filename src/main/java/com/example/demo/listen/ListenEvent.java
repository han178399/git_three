package com.example.demo.listen;

import com.example.demo.event.AddCardEvent;
import com.example.demo.service.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author hpf
 * @Date 2021/3/23 17:40
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ListenEvent {

    final PeopleService peopleService;

    @EventListener
    public void cardListen(AddCardEvent event){
        peopleService.addMon(event.getId(),event.getMoney());
    }

}
