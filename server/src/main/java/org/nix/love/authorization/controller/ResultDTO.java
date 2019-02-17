package org.nix.love.authorization.controller;

import lombok.Data;

/**
 * @author zhangpei
 * @version 1.0
 * @description
 * @date 2019/2/17
 */
@Data
public class ResultDTO {

    private Integer code;

    private String message;

    private Object data;

    public ResultDTO(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultDTO(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
