package org.nix.love.authorization.config.extractor;

import org.nix.love.authorization.config.properties.ResourcesPartiesProperties;
import org.nix.love.authorization.core.extractor.ResourcesExtractor;
import org.nix.love.authorization.core.extractor.ResourcesExtractorExecutor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author zhangpei
 * @version 1.0
 * @description 提取资源配置类
 * @date 2019/2/17
 */
@Configuration
public class ExtractorResource {

    /**
     * @return org.nix.love.authorization.core.extractor.ResourcesExtractor
     * @description 资源提取器
     * @author zhangpe0312@qq.com
     * @date 2019/2/17
     */
    @Bean
    public ResourcesExtractor springMvcExtractor() {
        return new SpringMvcExtractor();
    }

    /**
     * @param
     * @return org.nix.love.authorization.core.extractor.ResourcesExtractorExecutor
     * @description 具体执行的扫描提取的操作
     * @author zhangpe0312@qq.com
     * @date 2019/2/17
     */
    @Bean
    public ResourcesExtractorExecutor resourcesExtractorExecutor() {
        return new ResourcesExtractorExecutor(springMvcExtractor(), resourcesPartiesProperties().getResourcesPath());
    }

    /**
     * @return org.nix.love.authorization.config.properties.ResourcesPartiesProperties
     * @description 资源处理配置参数
     * @author zhangpe0312@qq.com
     * @date 2019/2/17
     */
    @Bean
    public ResourcesPartiesProperties resourcesPartiesProperties() {
        return new ResourcesPartiesProperties();
    }

}
