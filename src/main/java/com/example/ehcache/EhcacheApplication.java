package com.example.ehcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EhcacheApplication implements CommandLineRunner {

	@Autowired
	private CacheExample cacheExample;

	public static void main(String[] args) {
		SpringApplication.run(EhcacheApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(cacheExample.findStudent(1l));
		System.out.println(cacheExample.findStudent(1l));
		System.out.println(cacheExample.findStudent(1l));
	}
}
