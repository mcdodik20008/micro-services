package mcitoservice.beerservice.domain.beer.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table("beer")
public class Beer {

    @Id
    @Column(value = "id")
    private Long id = 0L;

    private String name = "Чекушка темного не фильтрованного";

    private String volume = "Пока хочется";

}
