package org.nix.love.authorization.controller;

import org.nix.love.authorization.entity.RegisterURL;
import org.nix.love.authorization.entity.Resources;
import org.nix.love.authorization.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangpei
 * @version 1.0
 * @description 资源控制器
 * @date 2019/2/17
 */
@RestController
@RequestMapping(value = "/resources")
public class ResourcesController {

    private Map<User, Set<Resources>> resources = new ConcurrentHashMap<>();
    private Set<User> users = new HashSet<>();

    @PostMapping(value = "/url")
    public ResultDTO resources(@RequestBody RegisterURL registerURL) {
        User user = registerURL.getUser();
        if (users.contains(user)){
            this.resources.put(user,registerURL.getResources());
            return new ResultDTO(200,"注册用户添加资源成功",resources);
        }else {
            return new ResultDTO(400,"用户未注册"+user);
        }
    }

    @PostMapping(value = "/user")
    public ResultDTO registerApplication(@ModelAttribute User user) {
        for (User sonUser : users) {
            if (sonUser.getName().equals(user.getName())){
                return new ResultDTO(400,"用户已经存在");
            }
        }
        users.add(user);
        return new ResultDTO(200,"注册用户成功"+user);
    }

    @GetMapping(value = "/url")
    public ResultDTO resources(@ModelAttribute User user){
        if (resources.containsKey(user)){
            return new ResultDTO(200,"查询资源成功",resources.get(user));
        }
        return new ResultDTO(400,"该用户没有资源");
    }
}
