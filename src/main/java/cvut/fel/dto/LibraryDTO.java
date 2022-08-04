package cvut.fel.dto;

import cvut.fel.entity.Adress;
import cvut.fel.entity.Book;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class LibraryDTO extends AbstractDTO{


    @Schema(description = "name of the library", nullable = false, example = "Albert", type = "string", name = "name")
    private String name;
    @Schema(description = "phone number of the library", nullable = false, example = "0614378501", type = "string", name = "phoneNumber")
    private String phoneNumber;
    @Schema(description = "email adress of the library", nullable = false, example = "library@gmail.com", type = "string", name = "emailAdress")
    private String emailAdress;
    @Schema(description = "adress of the library", nullable = false, example = "15 av Girond", type = "string", name = "adressDTO")
    private AdressDTO adressDTO;
    @ArraySchema(schema = @Schema(name = "bookDTO", implementation = BookDTO.class), uniqueItems = true)
    private List<BookDTO> bookDTO;

    @Override
    protected AbstractDTO clone() {
        return null;
    }
}
