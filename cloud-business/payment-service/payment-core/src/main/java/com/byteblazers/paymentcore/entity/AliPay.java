package com.byteblazers.paymentcore.entity;

import lombok.Data;

/**
 * @author zhangjk
 * @version 1.0
 * @date 2025/2/10 11:28
 */
@Data
public class AliPay {
    private String traceNo;
    private double totalAmount;
    private String subject;
    private String alipayTraceNo;
}
