package com.windsun.wangs.service.impl;

import cn.hutool.core.util.RandomUtil;
import com.windsun.wangs.entry.Payment;
import com.windsun.wangs.mapper.PaymentMapper;
import com.windsun.wangs.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目名称：springcloud
 * 类 名 称：PaymentServiceImpl
 * 类 描 述：
 * 创建时间：2021/6/7 22:45
 * 创 建 人：wangsheng
 */
@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentMapper paymentMapper;


    /**
     * 创建新的payment
     *
     * @param payment
     * @return
     */
    @Override
    public int create(Payment payment) {
         payment = new Payment();
         payment.setSerial(RandomUtil.randomString(10));
        return paymentMapper.create(payment);
    }

    /**
     * 根据ID查询payment
     *
     * @param id
     * @return
     */
    @Override
    public Payment getPaymentById(Long id) {
        return null;
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<Payment> paymentList() {
        return paymentMapper.paymentList();
    }
}
