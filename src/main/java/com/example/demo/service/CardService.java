package com.example.demo.service;

import com.example.demo.dao.CardDao;
import com.example.demo.pojo.Card;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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


    public Card findOne(Long id){
        Optional<Card> byId = cardDao.findById(id);
        return byId.orElse(null);
    }
}
