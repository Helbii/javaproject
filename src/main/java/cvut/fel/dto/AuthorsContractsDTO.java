package cvut.fel.dto;

import cvut.fel.entity.Author;
import cvut.fel.entity.PublishingHouse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
public class AuthorsContractsDTO extends AbstractDTO{
    @Schema(description = "name of the author contracts", nullable = false, example = "Glenat", type = "string", name = "authors contract")
    private String name;
    @Schema(description = "name of the author", nullable = false, example = "Albert", type = "string", name = "authors")
    private Author author;
    @Schema(description = "DTO of the publishing house", nullable = false, example = "Glenat", implementation = PublishingHouseDTO.class, name = "publishingHouseDTO")
    private PublishingHouseDTO publishingHouseDTO;

    @Override
    protected AbstractDTO clone() {
        return null;
    }
}
