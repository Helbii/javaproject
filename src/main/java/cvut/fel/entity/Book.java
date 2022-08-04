package cvut.fel.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "books")
@NamedQueries({
        @NamedQuery(name = "Book.findByName", query = "SELECT u FROM Book u WHERE u.title = :name"),
})
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book extends AbstractEntity{

    @Column(unique = true)
    @NotNull
    private String title;
    @ManyToOne
    private Library library;

    @ManyToMany
    private List<Author> authors;
    private Date published;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", ISBN='" + title + '\'' +
                ", published='" + published + '\'' +
                '}';
    }

}
