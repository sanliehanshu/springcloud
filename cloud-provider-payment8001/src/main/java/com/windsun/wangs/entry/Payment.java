package com.windsun.wangs.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 项目名称：springcloud
 * 类 名 称：Payment
 * 类 描 述：
 * 创建时间：2021/5/16 21:56
 * 创 建 人：wangsheng
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private static final long serialVersionUID = 2983573803618188267L;
    private long id;
    private String serial;
}
