package org.nix.love.authorization.config.extractor;

import org.junit.Test;
import org.nix.love.authorization.core.extractor.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.function.Consumer;

import static org.junit.Assert.*;

public class SpringMvcExtractorTest {


    SpringMvcExtractor springMvcExtractor = new SpringMvcExtractor();

    @Test
    public void test(){
        List<Resources> resources = springMvcExtractor.extractorResources(TestController.class);
        resources.forEach(new Consumer<Resources>() {
            @Override
            public void accept(Resources resources) {
                System.out.println(resources);
            }
        });
    }

    @RequestMapping(value = "/hello")
    static class TestController{

        @RequestMapping(value = "/get")
        public String helloGet(){
            return "hello";
        }
    }

    @Test
    public void annotation(){
        Class<GetMapping> getMappingClass = GetMapping.class;
        Annotation[] annotations = getMappingClass.getAnnotations();
        RequestMapping annotation = getMappingClass.getAnnotation(RequestMapping.class);
        System.out.println();
    }
}