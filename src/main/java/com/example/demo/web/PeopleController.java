package com.example.demo.web;

import com.example.demo.pojo.Card;
import com.example.demo.pojo.People;
import com.example.demo.service.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author hanpengfei
 * @Date 2021/3/22 22:29
 */
@RestController
@RequestMapping("people")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PeopleController {

    final PeopleService peopleService;

    /**
     * 查询详情
     *
     * @param id
     * @return
     */
    @GetMapping("findOne/{id}")
    People findOne(@PathVariable Long id) {
        return peopleService.findOne(id);
    }

    /**
     * 修改/保存
     *
     * @param people
     * @return
     */
    @PostMapping("save")
    Object save(@RequestBody People people) {
        peopleService.save(people);
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
        peopleService.del(id);
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
