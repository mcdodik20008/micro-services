package mcitoservice.rabbitservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RabbitServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitServiceApplication.class, args);
    }

}
