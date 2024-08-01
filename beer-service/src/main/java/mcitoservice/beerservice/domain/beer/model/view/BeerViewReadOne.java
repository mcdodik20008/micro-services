package mcitoservice.beerservice.domain.beer.model.view;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("id")
    private Long id = 0L;

    @JsonProperty("name")
    private String name = "Чекушка темного не фильтрованного";

    @JsonProperty("volume")
    private String volume = "Пока хочется";

    @JsonProperty("app_name")
    private String appName;
}
