package cvut.fel.dto;

import cvut.fel.entity.Library;
import cvut.fel.entity.PublishingHouse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class AdressDTO extends AbstractDTO {

    @Schema(description = "state of the adress", nullable = false, example = "France", type = "string", name = "state")
    private String state;
    @Schema(description = "street of the adress", nullable = false, example = "Buissons ardent", type = "string", name = "street")
    private String street;
    @Schema(description = "city of the adress", nullable = false, example = "Cannes", type = "string", name = "city")
    private String city;
    @Schema(description = "postalCode of the adress", nullable = false, example = "06400", type = "string", name = "postal code")
    private String postalCode;
    @Schema(description = "country of the adress", nullable = false, example = "Alpes Maritime", type = "string", name = "country")
    private String country;

    @Schema(description = "", nullable = false, example = "Bibliothéque la frayere", implementation = LibraryDTO.class, name = "Library")
    private LibraryDTO librariesDTO;

    @ArraySchema(schema = @Schema(name = "Publishing houses", implementation = PublishingHouseDTO.class), uniqueItems = true)
    private List<PublishingHouseDTO> pbHouseDTO;

    @Override
    protected AbstractDTO clone() {
        return null;
    }
}
