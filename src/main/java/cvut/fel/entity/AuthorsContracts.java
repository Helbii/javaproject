package cvut.fel.entity;

import cvut.fel.dto.AuthorsContractsDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "authorscontracts")

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorsContracts extends AbstractEntity{

    private String name;

    @ManyToOne
    private Author author;

    @ManyToOne
    private PublishingHouse publishingHouse;

    @Override
    public String toString(){
        return "authorscontracts{"+
                "id="+id+
                ", name="+name+'\''+"}";
    }
}