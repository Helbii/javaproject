package cvut.fel.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "authors")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author extends AbstractEntity {
    private String name;
    private String surname;
    private String email;


    @ManyToMany
    private List<Book> book;

    @ManyToMany
    private List<PublishingHouse> publishingHouses;

    @OneToMany
    private List<AuthorsContracts>  authorsContracts;

    @Override
    public String toString(){
        return "Authors{" +
                "id=" + id + '\'' +
                "name=" + name + '\'' +
                "surname=" + surname + '\'' +
                "email=" + email + '\'' + "}";
    }

}
