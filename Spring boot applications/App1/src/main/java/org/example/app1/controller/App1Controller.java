package org.example.app1.controller;

import org.example.app1.model.Post;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class App1Controller {
    private RestClient restClient;
    public App1Controller(
                             RestClient.Builder restClient) {

        this.restClient = restClient
                .baseUrl("https://jsonplaceholder.typicode.com")
                .build();
    }

    @GetMapping("/request")
    public String makeRequest() {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://app2-service:8080/data", String.class);
        return response;
    }
    @GetMapping("/posts")
    public List<Post> allPosts(){
        return restClient.get()
                .uri("/posts")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Post>>() {});
    }

}
