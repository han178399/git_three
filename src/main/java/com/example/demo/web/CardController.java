package com.example.demo.web;

import com.example.demo.pojo.Card;
import com.example.demo.service.CardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hpf
 * @Date 2021/3/22 18:48
 */
@Slf4j
@RestController
@RequestMapping("card")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CardController {

    final CardService cardService;


    @GetMapping("findOne/{id}")
    Card findOne(@PathVariable Long id){
        return cardService.findOne(id);
    }



}
