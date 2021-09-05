package com.dimo.work.prep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(Application.class, args);
		System.out.println("App Running...");
		System.out.println("Hello");
		Thread.sleep(10000);
		System.out.println("App shutting down in 10 seconds...");
		Thread.sleep(5000);
		for(int i = 5; i > 0; i--)
		{
			System.out.println("App shutting down in " + i);
			Thread.sleep(1000);
		}
		System.out.println("Goodbye");
	}

}
