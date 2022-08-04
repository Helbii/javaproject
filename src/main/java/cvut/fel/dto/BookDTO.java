package cvut.fel.dto;

import cvut.fel.entity.Author;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class BookDTO extends AbstractDTO{

    private String ISBN;
    private Date published;


    @ArraySchema(schema = @Schema(name = "Authors Contracts", implementation = AuthorsContractsDTO.class), uniqueItems = true)
    private List<AuthorDTO> authorsDTO;
    @Schema(description = "DTO of the library", nullable = false, example = "Bibliothéque la frayere", implementation = LibraryDTO.class, name = "libraryDTO")
    private LibraryDTO libraryDTO;

    @Override
    public AbstractDTO clone() {
        return new BookDTO();
    }

}
