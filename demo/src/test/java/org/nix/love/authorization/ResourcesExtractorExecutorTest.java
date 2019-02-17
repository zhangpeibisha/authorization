package org.nix.love.authorization;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import org.junit.Test;
import org.nix.love.authorization.config.extractor.SpringMvcExtractor;
import org.nix.love.authorization.core.extractor.Resources;
import org.nix.love.authorization.core.extractor.ResourcesExtractorExecutor;

import java.util.HashMap;
import java.util.Set;
import java.util.function.Consumer;

/**
 * @author zhangpei
 * @version 1.0
 * @description
 * @date 2019/2/17
 */
public class ResourcesExtractorExecutorTest {
    private String path = "org.nix.love.authorization";

    @Test
    public void extractor() {
        ResourcesExtractorExecutor resourcesExtractorExecutor
                = new ResourcesExtractorExecutor(new SpringMvcExtractor(), path);
        Set<Resources> extractor = resourcesExtractorExecutor.extractor();
        extractor.forEach(new Consumer<Resources>() {
            @Override
            public void accept(Resources resources) {
                System.out.println(resources);
            }
        });
        System.out.println(JSONUtil.toJsonStr(extractor));

    }

    @Test
    public void resgisterUser(){
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name","test");
        paramMap.put("password","test");
        String message = HttpUtil.post("localhost:8080/resources/user", paramMap);
        System.out.println(message);
    }
}
