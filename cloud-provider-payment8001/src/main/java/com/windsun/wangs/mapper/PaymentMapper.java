package com.windsun.wangs.mapper;

import com.windsun.wangs.entry.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 项目名称：springcloud
 * 类 名 称：PaymentMapper
 * 类 描 述：
 * 创建时间：2021/5/17 12:59
 * 创 建 人：wangsheng
 */
@Mapper
public interface PaymentMapper {

     int create(Payment payment);

     Payment getPaymentById(@Param("id") Long id);

     List<Payment> paymentList();

}
