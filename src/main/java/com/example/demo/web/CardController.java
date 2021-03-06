package com.example.demo.web;

import com.example.demo.pojo.Card;
import com.example.demo.service.CardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 查询详情
     *
     * @param id
     * @return
     */
    @GetMapping("findOne/{id}")
    Card findOne(@PathVariable Long id) {
        return cardService.findOne(id);
    }

    /**
     * 修改/保存
     *
     * @param card
     * @return
     */
    @PostMapping("save")
    Object save(@RequestBody Card card) {
        cardService.save(card);
        return null;
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @GetMapping("del/{id}")
    Object del(@PathVariable Long id) {
        cardService.del(id);
        return null;
    }

    /**
     * 分页查询
     *
     * @param id
     * @return
     */
    @PostMapping("page")
    Object page(@RequestBody Long id) {
        //cardService.del(id);
        return null;
    }

}
