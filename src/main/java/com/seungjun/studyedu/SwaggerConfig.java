package com.seungjun.studyedu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	 	@Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.seungjun.studyedu"))
	                .paths(PathSelectors.any())
	                .build()
	                .apiInfo(apiInfo());
	    }

	 	private ApiInfo apiInfo() {
	 	    ApiInfo apiInfo = new ApiInfo(
	 	      "Momento REST API",
	 	      "Momento description of API.",
	 	      "LeeSeungjun",
	 	      "Terms of service",
	 	      "6951004@naver.com",
	 	      "License of API",
	 	      "");
	 	    return apiInfo;
	 	}

}
