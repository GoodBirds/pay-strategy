package com.liwei.paystrategy.service.impl;

import com.liwei.paystrategy.service.PayStrategy;
import org.springframework.stereotype.Component;

/**
 * @author liwei
 * @create: 2020/3/17 12:44 下午
 */
@Component
public class WeChatPayStrategy implements PayStrategy {
    @Override
    public String toPayHtml() {
        return "调用微信支付接口";
    }
}
