package com.liwei.paystrategy.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

/**
 * @author liwei
 * @create: 2020/3/17 2:01 下午
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payment_channel")
public class PaymentChannel {
    /**
     * ID
     */
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty(value = "ID")
    private Integer id;

    /**
     * 渠道ID
     */
    @Column(name = "channel_id")
    @ApiModelProperty(value = "渠道ID")
    private String channelId;

    /**
     * 渠道名称
     */
    @Column(name = "channel_name")
    @ApiModelProperty(value = "渠道名称")
    private String channelName;

    /**
     * 策略执行beanid
     */
    @Column(name = "strategy_bean_id")
    @ApiModelProperty(value = "策略执行beanid")
    private String strategyBeanId;

}