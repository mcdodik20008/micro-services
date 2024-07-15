package mcitoservice.stewservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StewServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StewServiceApplication.class, args);
    }

}
