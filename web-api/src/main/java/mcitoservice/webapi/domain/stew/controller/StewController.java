package mcitoservice.webapi.domain.stew.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import mcitoservice.webapi.domain.stew.model.view.RabbitOrder;
import mcitoservice.webapi.domain.stew.model.view.StewSettingsView;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/stew", produces = "application/json")
@RequiredArgsConstructor
public class StewController {

    @Value("spring.application.name")
    private String appName;

    private final ObjectMapper objectMapper;

    private final KafkaTemplate<String, String> kafkaTemplate;

    @SneakyThrows
    @PostMapping("/order")
    public String sendMessage(@RequestBody StewSettingsView settings) {

        RabbitOrder order = new RabbitOrder(appName, settings.getCountRabbits());
        kafkaTemplate.send("create-rabbits", objectMapper.writeValueAsString(order));

        settings.setExternalRabbits(true);
        kafkaTemplate.send("make-stew", objectMapper.writeValueAsString(settings));
        return "Отправили заказ ...";
    }

}
