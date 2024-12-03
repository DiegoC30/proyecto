package conn.mamartinez.encuentaapp.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Respuesta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "curso_id")
	private Curso curso;

	@ManyToOne
	@JoinColumn(name = "docente_id")
	private Docente docente;

	@ManyToOne
	@JoinColumn(name = "pregunta_id")
	private Pregunta pregunta;

	@ManyToOne
	@JoinColumn(name = "leyenda_id")
	private Leyenda leyenda;

	private String periodo;

	public Respuesta() {}

	public Respuesta(String periodo, Curso curso, Docente docente, Pregunta pregunta, Leyenda leyenda) {
		this.periodo = periodo;
		this.curso = curso;
		this.docente = docente;
		this.pregunta = pregunta;
		this.leyenda = leyenda;
	}
}
