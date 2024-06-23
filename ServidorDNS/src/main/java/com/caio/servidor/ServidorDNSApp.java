package com.caio.servidor;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class ServidorDNSApp {

	public static void main(String[] args) {
		SpringApplication.run(ServidorDNSApp.class, args);

	}

}
