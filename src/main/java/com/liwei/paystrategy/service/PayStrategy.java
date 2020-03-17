package com.liwei.paystrategy.service;

/**
 * @author liwei
 * @create: 2020/3/17 12:42 下午
 */
public interface PayStrategy {

    /**
     *  策略模式共同算法的骨架
     * @return
     */
    String toPayHtml();
}
