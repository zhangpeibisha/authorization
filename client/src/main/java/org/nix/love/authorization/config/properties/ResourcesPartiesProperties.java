package org.nix.love.authorization.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhangpei
 * @version 1.0
 * @description 资源配置类
 * @date 2019/2/17
 */
@ConfigurationProperties(prefix = "permission.resources")
@Data
public class ResourcesPartiesProperties {

    /**
     * 指定资源的位置
     */
    private String resourcesPath = "";

}
