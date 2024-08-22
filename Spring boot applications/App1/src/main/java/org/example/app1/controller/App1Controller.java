package org.example.app1.controller;

import org.example.app1.model.Data;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class App1Controller {
    private RestClient restClient;
    public App1Controller(RestClient.Builder restClient) {

        this.restClient = restClient
                .baseUrl("http://app2-service:8080")
                .build();
    }

    
    @GetMapping("/request")
    public List<Data> makeRequest(){
        return restClient.get()
                .uri("/data")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Data>>() {});
    }


}
