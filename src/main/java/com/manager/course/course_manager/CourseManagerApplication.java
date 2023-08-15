package com.manager.course.course_manager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class CourseManagerApplication {


	public static void main(String[] args) {

		ApplicationContext run = SpringApplication.run(CourseManagerApplication.class, args);
		for (String beanDefinitionName : run.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}
	}
}
