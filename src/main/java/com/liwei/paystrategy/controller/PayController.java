package com.liwei.paystrategy.controller;

import com.liwei.paystrategy.common.BaseReturnInfo;
import com.liwei.paystrategy.service.impl.PayContextStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author liwei
 * @create: 2020/3/17 2:17 下午
 */
@RestController
public class PayController {

    @Autowired
    private PayContextStrategy payContextStrategy;

    @GetMapping("/toPayHtml")
    public String toPayHtml(String payCode) {
        if (StringUtils.isEmpty(payCode)) {
            return BaseReturnInfo.PAY_CODE_IS_BLANK;
        }
        return payContextStrategy.toPayHtml(payCode);
    }
}
