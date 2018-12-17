package com.jp.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jp.poc"} )
@EnableJpaRepositories(basePackages = {"com.jp.poc.repository" } )
@PropertySource(value = { "classpath:/db.properties"})
public class HibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}
}
