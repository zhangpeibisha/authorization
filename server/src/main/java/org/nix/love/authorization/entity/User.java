package org.nix.love.authorization.entity;

import cn.hutool.json.JSONUtil;
import lombok.Data;

import java.util.Set;

/**
 * @author zhangpei
 * @version 1.0
 * @description 应用账户信息
 * @date 2019/2/17
 */
@Data
public class User extends BaseEntity {

    private String name;

    private String password;

}
