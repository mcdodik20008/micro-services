package mcitoservice.beerservice.domain.beer.model.view;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BeerViewReadOne {

    private Long id = 0L;

    private String name = "Чекушка темного не фильтрованного";

    private String volume = "Пока хочется";

}
