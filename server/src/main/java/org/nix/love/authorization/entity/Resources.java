package org.nix.love.authorization.entity;


import lombok.Data;

import java.util.Set;

/**
 * @author zhangpei
 * @version 1.0
 * @description 资源信息
 * @date 2019/2/17
 */
@Data
public class Resources extends BaseEntity{

    /**
     * 资源请求方法
     */
    private Set<RequestMethod> httpMethods;
    /**
     * 资源url
     */
    private String url;
    /**
     * 资源名字
     */
    private String name;
    /**
     * 资源描述
     */
    private String description;
    /**
     * 资源是否开放
     */
    private Boolean open;

}
