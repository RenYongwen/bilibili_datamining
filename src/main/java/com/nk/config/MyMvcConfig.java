package com.nk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter  =new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                List<String> htmlNames = new ArrayList<String>();
                htmlNames.add("bar");
                htmlNames.add("calendar");
                htmlNames.add("index");
                htmlNames.add("label1");
                htmlNames.add("label2");
                htmlNames.add("label3");
                htmlNames.add("label4");
                htmlNames.add("label5");
                htmlNames.add("tag");
                htmlNames.add("user");
                htmlNames.add("opera");
                htmlNames.add("login");
                htmlNames.add("video");
                htmlNames.add("404");
                htmlNames.add("show");
                htmlNames.add("top");
                htmlNames.add("keyword");
                for (String htmlName:htmlNames) {
                    registry.addViewController("/"+htmlName+".html").setViewName(htmlName);
                };
                registry.addViewController("/").setViewName("/login");
            }

        };
        return  adapter;
    }
}
