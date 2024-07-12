package mcitoservice.beerservice.domain.beer.controller;

import mcitoservice.beerservice.domain.beer.model.view.BeerViewReadOne;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/beer")
public class BeerController {

    @GetMapping
    public BeerViewReadOne chill() {
        return new BeerViewReadOne();
    }

}
