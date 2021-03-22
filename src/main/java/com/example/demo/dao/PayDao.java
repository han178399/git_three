package com.example.demo.dao;

import com.example.demo.pojo.PayInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author hanpengfei
 * @Date 2021/3/22 22:42
 */
@Repository
public interface PayDao extends JpaRepository<PayInfo, Long> {
}
