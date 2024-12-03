package conn.mamartinez.encuentaapp.DAO;

import conn.mamartinez.encuentaapp.modelos.Respuesta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RespuestaDAO {
    private EntityManagerFactory emf;

    public RespuestaDAO() {
        this.emf = Persistence.createEntityManagerFactory("EncuestaAppPU");
    }

    // Método para guardar una respuesta específica
    public void guardarRespuesta(Respuesta respuesta) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(respuesta);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }

    // Método genérico para guardar cualquier entidad
    public void guardarEntidad(Object entidad) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entidad);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }

    // Método para cerrar el EntityManagerFactory
    public void cerrar() {
        if (emf.isOpen()) {
            emf.close();
        }
    }
}
