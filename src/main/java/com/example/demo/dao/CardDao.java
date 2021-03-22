package com.example.demo.dao;

import com.example.demo.pojo.Card;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author hpf
 * @Date 2021/3/22 18:51
 */
public interface CardDao extends JpaRepository<Card,Long> {
}
