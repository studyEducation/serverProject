package com.seungjun.studyedu;

import java.nio.charset.Charset;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;


@SpringBootApplication
public class StudyEducProjectServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyEducProjectServerApplication.class, args);
	}
	
	@Bean
	public HttpMessageConverter<String> responseBodyConverter() {
		return new StringHttpMessageConverter(Charset.forName("UTF-8"));
	}
	
	/**    * SqlSessionFactory ����     */  
	@Bean   
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource)throws Exception{      
	   SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();     
	   sessionFactory.setDataSource(dataSource);    
	   Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*Mapper.xml");           
	   sessionFactory.setMapperLocations(res);   
	   
	   	return sessionFactory.getObject();   
	}
}
