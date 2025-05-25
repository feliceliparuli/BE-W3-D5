import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Utente {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private String numeroTessera;
    // Getters e Setters
}
