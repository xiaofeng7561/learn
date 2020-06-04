package com.example.demo;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author AFeng
 */
@SpringBootApplication
@ConfigurationPropertiesScan(basePackages = "com.example.demo")
@MapperScan("com.example.demo.dao")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Component
	class Test implements ApplicationContextAware {

		private  ApplicationContext applicationContext;

		@Override
		public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
			this.applicationContext=applicationContext;
		}

		@PostConstruct
		public void test(){
			DataSourceProperties moduleComponent = (DataSourceProperties)applicationContext.getBean(DataSourceProperties.class);
		}

	}

}
