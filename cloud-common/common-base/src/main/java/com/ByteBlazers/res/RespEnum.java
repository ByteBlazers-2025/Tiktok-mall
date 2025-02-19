package com.ByteBlazers.res;

/**
 * 状态码
 * @author zhangjk
 * @version 1.0
 * @date 2025/2/17 17:41
 */
public enum RespEnum {
    /* 基础状态码 */
    SUCCESS(200, "请求成功"),
    SERVER_ERROR(500, "系统繁忙，请稍后重试"),

    /* 用户模块 1000~1999 */
    USER_NOT_LOGIN(1000, "用户未登录"),
    USER_AUTH_FAIL(1001, "账号或密码错误"),
    USER_FROZEN(1002, "账号已被冻结"),

    /* 商品模块 2000~2999 */
    GOODS_OFF_SHELF(2000, "商品已下架"),
    GOODS_STOCK_ZERO(2001, "商品库存不足"),

    /* 订单模块 3000~3999 */
    ORDER_NOT_EXIST(3000, "订单不存在"),
    ORDER_STATUS_ERROR(3001, "订单状态异常");

    /* 购物车模块 4000~4999 */

    /* 支付模块 5000~5999 */

    private final int code;
    private final String msg;

    RespEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    // Getter方法保持字段只读
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
