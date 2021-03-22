package com.example.demo.web;

import com.example.demo.pojo.PayInfo;
import com.example.demo.service.PayService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hanpengfei
 * @Date 2021/3/22 22:38
 */
@RestController
@RequestMapping("pay")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PayController {

    final PayService payService;

    @PostMapping("start")
    Object start(@RequestBody PayInfo info) {
        payService.start(info);
        return null;
    }
}
