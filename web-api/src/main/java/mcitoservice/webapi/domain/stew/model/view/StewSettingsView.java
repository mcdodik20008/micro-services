package mcitoservice.webapi.domain.stew.model.view;

import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@Validated
public class StewSettingsView {

    @Min(value = 0, message = "Укажите не отрицательное количество крольчатины")
    private Integer countRabbits;

    private Boolean externalRabbits;

    @Min(value = 0, message = "Укажите не отрицательное количество морквы")
    private Integer countCarrots;

    @Min(value = 0, message = "Укажите не отрицательное количество клубней картофеля")
    private Integer countPotato;

}
