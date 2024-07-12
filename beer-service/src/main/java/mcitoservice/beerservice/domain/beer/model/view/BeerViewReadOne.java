package mcitoservice.beerservice.domain.beer.model.view;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BeerViewReadOne {

    public BeerViewReadOne(String appName) {
        this.appName = appName;
    }

    private Long id = 0L;

    private String name = "Чекушка темного не фильтрованного";

    private String volume = "Пока хочется";

    private String appName;
}
