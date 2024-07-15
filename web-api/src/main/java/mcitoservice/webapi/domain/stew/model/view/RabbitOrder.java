package mcitoservice.webapi.domain.stew.model.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RabbitOrder {

    private String consumer;

    private Integer count;

}
