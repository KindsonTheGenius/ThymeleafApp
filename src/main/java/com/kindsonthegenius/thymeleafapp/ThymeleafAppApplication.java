package com.kindsonthegenius.thymeleafapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafAppApplication.class, args);

	}

}
