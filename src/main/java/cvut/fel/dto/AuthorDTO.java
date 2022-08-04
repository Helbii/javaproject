package cvut.fel.dto;

import cvut.fel.entity.AuthorsContracts;
import cvut.fel.entity.Book;
import cvut.fel.entity.PublishingHouse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class AuthorDTO extends AbstractDTO{

    @Schema(description = "name of the author", nullable = false, example = "Albert", type = "string", name = "name")
    private String name;
    @Schema(description = "surname of the author", nullable = false, example = "Camus", type = "string", name = "surname")
    private String surname;
    @Schema(description = "email of the author", nullable = false, example = "AlbertCamus@gmail.com", type = "string", name = "email")
    private String email;
    @ArraySchema(schema = @Schema(name = "Books", implementation = BookDTO.class), uniqueItems = true)
    private List<BookDTO> bookDTO;
    @ArraySchema(schema = @Schema(name = "Publishing Houses", implementation = PublishingHouseDTO.class), uniqueItems = true)
    private List<PublishingHouseDTO> publishingHousesDTO;
    @ArraySchema(schema = @Schema(name = "Authors Contracts", implementation = AuthorsContractsDTO.class), uniqueItems = true)
    private List<AuthorsContractsDTO>  authorsContractsDTO;
    @Override
    protected AbstractDTO clone() {
        return null;
    }
}
