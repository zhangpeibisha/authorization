package org.nix.love.authorization.config.extractor;

import org.nix.love.authorization.core.extractor.AbstractResourcesExtractor;
import org.nix.love.authorization.core.extractor.RequestMethod;
import org.nix.love.authorization.core.extractor.Resources;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangpei
 * @version 1.0
 * @description 基于spring mvc的资源提取
 * @date 2019/2/17
 */
public class SpringMvcExtractor extends AbstractResourcesExtractor {

    @Override
    protected boolean filterMethod(Method method) {
        return false;
    }

    @Override
    protected Annotation getAnnotation(Method method) {
        return null;
    }

    @Override
    protected Annotation getAnnotation(Class classzz) {
        return null;
    }

    @Override
    protected List<RequestMethod> getRequestMethods(Annotation annotation) {
        return null;
    }

    @Override
    protected String[] getRequestUrl(Annotation annotation) {
        return new String[0];
    }

    @Override
    protected void setInfo(Resources resources, Method method, Annotation methodAnnotation) {

    }
}
