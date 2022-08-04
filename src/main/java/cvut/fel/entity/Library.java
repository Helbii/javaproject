package cvut.fel.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Libraies")


@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Library extends AbstractEntity{
    private String name;
    private String phoneNumber;
    private String emailAdress;

    @OneToOne
    private Adress adress;

    @OneToMany
    private List<Book> book;


    @Override
    public String toString(){
        return "Libraries{" +
                "id="+id+
                ", name="+name+'\''+
                ", phone="+phoneNumber+'\''+
                ", email="+emailAdress+'\''+"}";

    }
}
