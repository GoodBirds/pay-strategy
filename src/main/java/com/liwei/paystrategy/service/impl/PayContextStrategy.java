package com.liwei.paystrategy.service.impl;

import com.liwei.paystrategy.common.BaseReturnInfo;
import com.liwei.paystrategy.domain.PaymentChannel;
import com.liwei.paystrategy.mapper.PaymentChannelMapper;
import com.liwei.paystrategy.service.PayStrategy;
import com.liwei.paystrategy.utils.SpringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 策略模式，有共同的抽象行为，具体不同的行为称作为不同的策略，最终可以使用Context上下文获取对应策略。
 * @author liwei
 * @create: 2020/3/17 1:39 下午
 */
@Component
public class PayContextStrategy {

    @Autowired
    private PaymentChannelMapper paymentChannelMapper;

    public String toPayHtml(String payCode) {
        // 1: 使用payCode查询数据库获取beanId
        PaymentChannel paymentChannel = paymentChannelMapper.selectOne(
                PaymentChannel.builder()
                        .channelId(payCode)
                        .build()
        );
        if (paymentChannel == null) {
            return BaseReturnInfo.PAYMENT_CHANNEL_IS_NULL;
        }
        //2: 获取到beanId后，获取Spring实例对象
        String strategyBeanId = paymentChannel.getStrategyBeanId();
        if (StringUtils.isEmpty(strategyBeanId)) {
            return BaseReturnInfo.STRATEGY_BEAN_ID_IS_BLANK;
        }
        //3: 执行该实现的方法即可.... aliPayStrategy
        PayStrategy payStrategy = SpringUtils.getBean(strategyBeanId, PayStrategy.class);
        //4: 执行具体策略方法
        return payStrategy.toPayHtml();
    }
}
