package org.example.app1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class App1Controller {

    @GetMapping("/request")
    public String makeRequest() {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://app2-service:8080/data", String.class);
        return response;
    }

}
