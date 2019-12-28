package com.lry.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import sun.dc.pr.PRError;

/**
 * @author liurenyi
 * @create 2019--12--27--11:26
 */
@Configuration
public class SwaggerConfig {
    //扫描api配置 需要让哪些包下的接口或类生成文档
    private static final String BASS_PACKAGE="com.lry.handler";
    @Bean  //这个接口文档的配置内容
    public Docket createApi(){
        return  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASS_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("SpringBoot 前后端分离")
                .termsOfServiceUrl("")
                .version("1.0.0")
                .description("API的描述")
                .build();
    }
}
