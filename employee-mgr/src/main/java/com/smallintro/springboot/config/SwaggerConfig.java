package com.smallintro.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(getApiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.smallintro.springboot"))
				.paths(PathSelectors.any()).build();
	}
	//localhost:8081/swagger-ui/index.html
	
	private  ApiInfo getApiInfo() {
		return new ApiInfoBuilder()
				.title("Small Into to Spring Boot")
				.description("Demo Spring Boot Application's API")
				.version("v2.0")
				.contact(new Contact("Sushil Prasad","https://smallintro.github.io",""))
				.license("License 2.0")
				.licenseUrl("https://github.com/smallintro/spring-microservice/LICENSE")
				.build();
	}

}
