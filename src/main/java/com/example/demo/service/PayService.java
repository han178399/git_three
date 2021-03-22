package com.example.demo.service;

import com.example.demo.dao.PayDao;
import com.example.demo.pojo.PayInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author hanpengfei
 * @Date 2021/3/22 22:42
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PayService {

    final PayDao payDao;

    public void start(PayInfo info) {



    }
}
