package com.dimo.work.prep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jpdho
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
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
