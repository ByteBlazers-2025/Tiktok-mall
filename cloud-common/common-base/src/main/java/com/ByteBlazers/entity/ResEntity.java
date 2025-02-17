package com.ByteBlazers.entity;

import lombok.Data;

/**
 * 统一响应对象
 * @author zhangjk
 * @version 1.0
 * @date 2025/2/17 17:32
 */
@Data
public class ResEntity<T> {
    // 业务状态码
    private int code;
    // 提示信息
    private String message;
    // 响应数据
    private T data;

    /**
     * 快速构建成功响应
     * @author zhangjk
     * @date 2025/2/17 17:46
     * @param data
     */
    public static <T> ResEntity<T> success(T data) {
        ResEntity<T> entity = new ResEntity<>();
        entity.setCode(RespEnum.SUCCESS.getCode());
        entity.setMessage(RespEnum.SUCCESS.getMsg());
        entity.setData(data);
        return entity;
    }

    /**
     * 快速构建失败响应（预定义错误码）
     * @author zhangjk
     * @date 2025/2/17 17:45
     * @param resp 状态码枚举
     */
    public static <T> ResEntity<T> error(RespEnum resp) {
        ResEntity<T> entity = new ResEntity<>();
        entity.setCode(resp.getCode());
        entity.setMessage(resp.getMsg());
        return entity;
    }

    /**
     * 自定义错误响应（谨慎使用）
     * @author zhangjk
     * @date 2025/2/17 17:50
     * @param code 错误码
     * @param message 错误信息
     */
    public static <T> ResEntity<T> error(int code, String message) {
        ResEntity<T> entity = new ResEntity<>();
        entity.setCode(code);
        entity.setMessage(message);
        return entity;
    }

}
