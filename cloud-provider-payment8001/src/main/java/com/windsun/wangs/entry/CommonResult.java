package com.windsun.wangs.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 项目名称：springcloud
 * 类 名 称：CommonResult
 * 类 描 述：
 * 创建时间：2021/5/16 21:58
 * 创 建 人：wangsheng
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String  message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

}
