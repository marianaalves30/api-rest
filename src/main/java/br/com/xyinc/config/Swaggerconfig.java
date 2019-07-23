package br.com.xyinc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.VendorExtension;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class Swaggerconfig {
	
	@Bean
	public Docket productApi(){
		
		return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.apis(RequestHandlerSelectors.basePackage("br.com.xyinc"))
		.paths(regex("/api.*"))
		.build()
		.apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"API Produtos.", 
				"Teste", "Teste", "Teste",
				new Contact("Mariana Alves da Silva",
						"mahhry@gmail.com", "https://github.com/marianaalves30"),
						"Apache License Version 2.0",
						"https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
						);
		return apiInfo;	
						
		
	}

}
