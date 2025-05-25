import jakarta.persistence.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("catalogoPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Utente u = new Utente();
        u.setNome("Mario");
        u.setCognome("Rossi");
        u.setDataNascita(LocalDate.of(1990, 5, 15));
        u.setNumeroTessera("ABC123");
        em.persist(u);

        Libro l = new Libro();
        l.setIsbn("978-1234567890");
        l.setTitolo("Programmazione in Java");
        l.setAnnoPubblicazione(2022);
        l.setNumeroPagine(500);
        l.setAutore("Giuseppe Verdi");
        l.setGenere("Tecnico");
        em.persist(l);

        Prestito p = new Prestito();
        p.setUtente(u);
        p.setElemento(l);
        p.setDataInizio(LocalDate.now());
        em.persist(p);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
