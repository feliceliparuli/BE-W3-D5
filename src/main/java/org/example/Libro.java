import jakarta.persistence.*;

@Entity
@DiscriminatorValue("LIBRO")
public class Libro extends ElementoCatalogo {
    private String autore;
    private String genere;
    // Getters e Setters
}
