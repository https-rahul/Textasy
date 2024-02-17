package com.rahul.javaJotter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaJotterApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaJotterApplication.class, args);

		// disabling headless property before JFrame starts
		System.setProperty("java.awt.headless", "false");
		new TextEditor();
	}

}
