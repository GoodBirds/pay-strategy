package com.liwei.paystrategy.common;

/**
 * @author liwei
 * @create: 2020/3/17 2:07 下午
 */
public interface BaseReturnInfo {
    String PAYMENT_CHANNEL_IS_NULL = "没有该渠道信息";

    String STRATEGY_BEAN_ID_IS_BLANK = "该渠道没有配置beanid";

    String PAY_CODE_IS_BLANK = "渠道code不能为空";
}
