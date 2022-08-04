package cvut.fel.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "adress")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Adress extends AbstractEntity{
    private String state;
    private String street;
    private String city;
    private String postalCode;
    private String country;
    @OneToOne
    private Library libraries;

    @OneToMany
    private List<PublishingHouse> pbHouse;

    @Override
    public String toString(){
        return "Adress{" +
                "id="+id+
                "state=" + state + '\''+
                ", street="+ street + '\''+
                ", city=" + city + '\''+
                ", postalCode" + postalCode +'\'' +
                ", country" + country +'\''+ '}';

    }

}
