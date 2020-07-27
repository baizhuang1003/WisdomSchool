package com.tianyuan.WisdomTeacherServer;

import com.github.pagehelper.PageHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.Properties;

//@EnableAutoConfiguration
@EnableSwagger2//开启Swagger2
@SpringBootApplication
@MapperScan("com.tianyuan.WisdomTeacherServer.mapper")
public class WisdomTeacherServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WisdomTeacherServerApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<HiddenHttpMethodFilter> testFilterRegistration3() {
		FilterRegistrationBean<HiddenHttpMethodFilter> registration = new FilterRegistrationBean<HiddenHttpMethodFilter>();
		registration.setFilter(new HiddenHttpMethodFilter());//添加过滤器
		registration.addUrlPatterns("/*");//设置过滤路径，/*所有路径
		registration.setName("HiddenHttpMethodFilter");//设置优先级
		registration.setOrder(2);//设置优先级
		return registration;
	}

	@Bean
	public PageHelper pageHelper() {
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("offsetAsPageNum","true");
		properties.setProperty("rowBoundsWithCount","true");
		properties.setProperty("reasonable","true");
		properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
		pageHelper.setProperties(properties);
		return pageHelper;
	}
}
