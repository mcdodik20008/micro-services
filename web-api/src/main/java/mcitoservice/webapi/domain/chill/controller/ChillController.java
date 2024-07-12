package mcitoservice.webapi.domain.chill.controller;

import lombok.RequiredArgsConstructor;
import mcitoservice.webapi.domain.chill.model.view.BeerViewReadOne;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/chill", produces = "application/json")
@RequiredArgsConstructor
public class ChillController {

    private final RestTemplate restTemplate;

    @GetMapping
    public BeerViewReadOne chill() {
        String service = "beer-service";
        String url = "http://" + service +"/beer";
        return restTemplate.getForObject(url, BeerViewReadOne.class);
    }

}
