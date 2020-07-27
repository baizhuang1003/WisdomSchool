package com.tianyuan.WisdomTeacherServer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(){
      return new Docket(DocumentationType.SWAGGER_2).
              apiInfo(apiInfo()).
              select().
              /*apis(RequestHandlerSelectors.any())*/
              //扫码类带RestController注解的
             /*apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))*/
                     //扫描包的
              apis(RequestHandlerSelectors.basePackage("com.tianyuan.WisdomTeacherServer.controller")).
              paths(PathSelectors.any())
             .build().enable(true);
    }

    private ApiInfo apiInfo() {

        Contact DEFAULT_CONTACT = new Contact("LiuBy","tianyuanaip.com","");
        return new ApiInfo(
                "智慧启航SwaggerAPI文档",
                "前后端交互",
                "v1.0",
                "http:192.168.216.1:8080",
                DEFAULT_CONTACT,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());

    }
}
