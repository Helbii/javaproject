package cvut.fel.dto;

import cvut.fel.entity.Author;
import cvut.fel.entity.AuthorsContracts;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.ManyToMany;
import java.util.List;
@Setter
@Getter
@AllArgsConstructor
public class PublishingHouseDTO extends AbstractDTO{

    private String name;
    private List<AuthorDTO> authorsDTO;
    private List<AuthorsContractsDTO> authorsContractsDTO;

    @Override
    protected AbstractDTO clone() {
        return null;
    }
}
