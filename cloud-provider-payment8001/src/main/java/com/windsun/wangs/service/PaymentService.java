package com.windsun.wangs.service;

import com.windsun.wangs.entry.Payment;

import java.util.List;

/**
 * 项目名称：springcloud
 * 类 名 称：PaymentService
 * 类 描 述：
 * 创建时间：2021/6/7 22:44
 * 创 建 人：wangsheng
 */
public interface PaymentService {

    /**
     * 创建新的payment
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据ID查询payment
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);

    /**
     * 查询所有
     * @return
     */
    List<Payment> paymentList();
}
