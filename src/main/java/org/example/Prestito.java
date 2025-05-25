import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Prestito {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Utente utente;

    @ManyToOne
    private ElementoCatalogo elemento;

    private LocalDate dataInizio;
    private LocalDate dataRestituzionePrevista;
    private LocalDate dataRestituzioneEffettiva;

    @PrePersist
    public void calcolaDataPrevista() {
        this.dataRestituzionePrevista = dataInizio.plusDays(30);
    }
    // Getters e Setters
}
