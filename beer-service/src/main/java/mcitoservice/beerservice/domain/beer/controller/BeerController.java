package mcitoservice.beerservice.domain.beer.controller;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.discovery.EurekaClient;
import lombok.RequiredArgsConstructor;
import mcitoservice.beerservice.domain.beer.model.view.BeerViewReadOne;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/beer", produces = "application/json")
@RequiredArgsConstructor
public class BeerController {

    private final EurekaClient eurekaClient;

    @GetMapping
    public BeerViewReadOne chill() {
        ApplicationInfoManager appManager = eurekaClient.getApplicationInfoManager();
        String appName = appManager.getInfo().getAppName() + "-" + appManager.getInfo().getId();
        return new BeerViewReadOne(appName);
    }

}
