package com.kxg.stresstest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
/**
 * @Author: Niu Lilu
 * @Date: 2020/7/26 16:16
 * @Description:牛立露你写点注释吧！
 */
@Configuration
public class Swagger2 {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo( apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.keg.stresstest.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("使用swagger 生成rest文档")
                .description("生成rest接口")
                .termsOfServiceUrl("http://ssb.com")
                .version("1.0.1")
                .build();
    }
}
