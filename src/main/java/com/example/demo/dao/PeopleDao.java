package com.example.demo.dao;

import com.example.demo.pojo.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author hanpengfei
 * @Date 2021/3/22 22:31
 */
@Repository
public interface PeopleDao extends JpaRepository<People, Long> {
}
