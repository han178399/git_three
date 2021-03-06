package com.example.demo.dao;

import com.example.demo.pojo.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author hpf
 * @Date 2021/3/22 18:51
 */
@Repository
public interface CardDao extends JpaRepository<Card, Long> {
}
