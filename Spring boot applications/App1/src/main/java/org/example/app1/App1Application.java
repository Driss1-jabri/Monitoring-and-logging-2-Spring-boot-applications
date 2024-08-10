package org.example.app1;

import co.elastic.apm.attach.ElasticApmAttacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication

public class App1Application {

	public static void main(String[] args) {
		Map<String, String> configuration = new HashMap<>();
		configuration.put("server_urls", "http://fleet-service:8200");
		configuration.put("service_name", "App1");
		ElasticApmAttacher.attach(configuration);
		SpringApplication.run(App1Application.class, args);
	}

}
