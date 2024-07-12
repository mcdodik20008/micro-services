package mcitoservice.webapi.domain.chill.controller;

import mcitoservice.webapi.domain.chill.model.view.BeerViewReadOne;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/chill")
public class ChillController {

    @GetMapping
    public BeerViewReadOne chill() {
        return new BeerViewReadOne();
    }

}
