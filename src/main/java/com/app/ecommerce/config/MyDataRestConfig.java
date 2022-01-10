package com.app.ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.app.ecommerce.Entities.Product;
import com.app.ecommerce.Entities.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		// TODO Auto-generated method stub
		

		HttpMethod[] theUnsupportedActions= {HttpMethod.PUT,HttpMethod.POST,HttpMethod.DELETE};
		
		//disable HTTP Method For Product.Class: PUT POST and DELETE
				config.getExposureConfiguration()
				.forDomainType(Product.class)
				.withItemExposure((metdata,httpMethods)->httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,HttpMethods)->HttpMethods.disable(theUnsupportedActions));
				
				
	   //disable HTTP Method For ProductCategory.Class: PUT POST and DELETE
				config.getExposureConfiguration()
				.forDomainType(ProductCategory.class)
				.withItemExposure((metdata,httpMethods)->httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,HttpMethods)->HttpMethods.disable(theUnsupportedActions));
				
				
				
	}


	

}
