package com.byndr.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static springfox.documentation.builders.PathSelectors.regex;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
 class SwaggerConfig {

//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2); 
//	}
	
	@Bean
	public Docket myApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(basePackage("com.byndr.boot.resource"))  //static imports
				.paths(regex("/rest.*"))
				.build()
				;
	}
}
