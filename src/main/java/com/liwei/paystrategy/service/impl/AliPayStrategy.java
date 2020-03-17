package com.liwei.paystrategy.service.impl;

import com.liwei.paystrategy.service.PayStrategy;
import org.springframework.stereotype.Component;

/**
 * @author liwei
 * @create: 2020/3/17 12:43 下午
 */
@Component
public class AliPayStrategy implements PayStrategy {
    @Override
    public String toPayHtml() {
        return "调用支付宝支付接口。。。。";
    }
}
