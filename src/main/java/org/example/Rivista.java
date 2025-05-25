import jakarta.persistence.*;

@Entity
@DiscriminatorValue("RIVISTA")
public class Rivista extends ElementoCatalogo {
    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;
    // Getters e Setters
}
