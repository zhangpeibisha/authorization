package org.nix.love.authorization.controller;

import org.nix.love.authorization.core.extractor.Resources;
import org.nix.love.authorization.core.extractor.ResourcesExtractorExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @author zhangpei
 * @version 1.0
 * @description 测试控制器
 * @date 2019/2/17
 */
@RestController
public class TestController {

    @Resource
    private ResourcesExtractorExecutor resourcesExtractorExecutor;

    @GetMapping(value = "test")
    public Set<Resources> tset(){
        return resourcesExtractorExecutor.extractor();
    }


}
