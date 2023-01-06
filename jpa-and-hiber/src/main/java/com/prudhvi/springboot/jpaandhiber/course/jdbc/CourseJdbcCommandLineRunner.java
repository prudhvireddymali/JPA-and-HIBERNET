package com.prudhvi.springboot.jpaandhiber.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
	private CourseJdbcRepositiry repository;
	@Override
	public void run(String... args) throws Exception {
		repository.insert();
		
		}
	

}
