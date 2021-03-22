package com.example.demo.service;

import com.example.demo.dao.PeopleDao;
import com.example.demo.pojo.Card;
import com.example.demo.pojo.People;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author hanpengfei
 * @Date 2021/3/22 22:31
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PeopleService {

    final PeopleDao peopleDao;

    public People findOne(Long id) {
        return peopleDao.findById(id).orElse(null);
    }

    public void save(People people) {
        peopleDao.save(people);
    }

    public void del(Long id) {
        peopleDao.deleteById(id);
    }
}
