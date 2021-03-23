package com.example.demo.service;

import cn.hutool.core.date.DateUtil;
import com.example.demo.dao.CardDao;
import com.example.demo.event.AddCardEvent;
import com.example.demo.pojo.Card;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Author hpf
 * @Date 2021/3/22 18:49
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CardService {

    final CardDao cardDao;

    final PeopleService peopleService;

    final ApplicationEventPublisher applicationEventPublisher;


    public Card findOne(Long id) {
        Optional<Card> byId = cardDao.findById(id);
        return byId.orElse(null);
    }

    public void save(Card card) {
        card.setCreatDate(DateUtil.now());
        cardDao.save(card);
        applicationEventPublisher.publishEvent(new AddCardEvent(card.getOwnerId(),card.getQuota()));

        //此时用户卡增加 额度发生变化
    }

    public void del(Long id) {
        //校验有无欠款 有欠款则不可删除该卡
        cardDao.deleteById(id);
    }
}
