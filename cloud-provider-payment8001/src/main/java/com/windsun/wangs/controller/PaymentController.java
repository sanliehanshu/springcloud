package com.windsun.wangs.controller;

import com.windsun.wangs.entry.Payment;
import com.windsun.wangs.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 项目名称：springcloud
 * 类 名 称：PaymentController
 * 类 描 述：
 * 创建时间：2021/6/7 23:13
 * 创 建 人：wangsheng
 */
@RestController
@Slf4j
@RequestMapping("/api/payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @RequestMapping("/insert")
    public Integer insertPayment(){
        return paymentService.create(new Payment());
    }

    @RequestMapping("/list")
    public List<Payment> listPayment(){
        return paymentService.paymentList();
    }
}
