package org.nix.love.authorization.entity;

import cn.hutool.json.JSONUtil;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhangpei
 * @version 1.0
 * @description
 * @date 2019/2/17
 */
@Data
public class RegisterURL {

    private User user;

    private Set<Resources> resources;

    public static void main(String[] args) {
        User user = new User();
        user.setName("test");
        user.setPassword("test");
        System.out.println(JSONUtil.toJsonStr(user));

        Set<Resources> resources = new HashSet<>();
        Resources e = new Resources();
        e.setDescription("test");
        HashSet<RequestMethod> httpMethods = new HashSet<>();
        httpMethods.add(RequestMethod.GET);
        e.setHttpMethods(httpMethods);
        e.setName("test");
        e.setOpen(true);
        e.setUrl("/url");
        resources.add(e);

        RegisterURL resigterUrl = new RegisterURL();
        resigterUrl.setUser(user);
        resigterUrl.setResources(resources);

        System.out.println(JSONUtil.toJsonStr(resigterUrl));
    }

}
