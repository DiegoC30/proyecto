package conn.mamartinez.encuentaapp.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Respuesta {

    // Getters y Setters
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // Generación automática de la clave primaria
	private Long id;  // Clave primaria de la entidad Respuesta

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "docente_id")
	private Docente docente;

	@ManyToOne
	@JoinColumn(name = "curso_id")
	private Curso curso;

	// Otros campos
	private String fecha;
	private Integer leyendaId;
	private String periodo;
	private Integer preguntaId;

}
