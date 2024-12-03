package conn.mamartinez.encuentaapp.DAO;

import conn.mamartinez.encuentaapp.modelos.Respuesta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RespuestaDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    // Constructor que inicializa el EntityManagerFactory con el nombre de la unidad de persistencia
    public RespuestaDAO() {
        this.emf = Persistence.createEntityManagerFactory("EncuestaAppPU"); // Nombre de la unidad de persistencia
    }

    // Método para guardar una respuesta en la base de datos
    public void guardarRespuesta(Respuesta respuesta) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin(); // Inicia la transacción
            em.persist(respuesta); // Persiste la entidad
            em.getTransaction().commit(); // Realiza el commit de la transacción
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback(); // Hace rollback si ocurre un error
            }
            e.printStackTrace(); // Imprime la traza del error
        } finally {
            em.close(); // Cierra el EntityManager
        }
    }

    // Método para cerrar el EntityManagerFactory
    public void cerrar() {
        emf.close(); // Cierra la fábrica de EntityManager
    }
}
