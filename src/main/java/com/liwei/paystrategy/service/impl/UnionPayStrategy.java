package com.liwei.paystrategy.service.impl;

import com.liwei.paystrategy.service.PayStrategy;
import org.springframework.stereotype.Component;

/**
 * @author liwei
 * @create: 2020/3/17 12:45 下午
 */
@Component
public class UnionPayStrategy implements PayStrategy {
    @Override
    public String toPayHtml() {
        return "调用银联支付接口...";
    }
}
