package cvut.fel.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "pbhouse")

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class PublishingHouse extends AbstractEntity {
    private String name;

    @ManyToMany
    private List<Author> authors;

    @OneToMany
    private List<AuthorsContracts> authorsContracts;

    @Override
    public String toString(){
        return "PbHouse{" +
                "id="+id+
                ", name= "+name+'\''+"}";
    }
}
