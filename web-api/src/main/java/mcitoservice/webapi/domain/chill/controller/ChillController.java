package mcitoservice.webapi.domain.chill.controller;

import lombok.RequiredArgsConstructor;
import mcitoservice.webapi.domain.chill.model.view.BeerViewReadOne;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping(value = "/chill", produces = "application/json")
@RequiredArgsConstructor
public class ChillController {

    private final WebClient webClient;

    @GetMapping
    public BeerViewReadOne chill() {
        String service = "beer-service";
        String url = "http://" + service + "/beer";
        return webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(BeerViewReadOne.class)
                .block();
    }

}
