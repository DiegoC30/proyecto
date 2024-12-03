package conn.mamartinez.encuentaapp.modelos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Respuesta {
	private int id;
	private LocalDate feha;
	private String periodo;
	private Curso curso;
	private Docente docente;
	private Pregunta pregunta;
	private Leyenda leyenda;

	public Respuesta(int id, LocalDate feha, String periodo, Curso curso,
					 Docente docente, Pregunta pregunta, Leyenda leyenda) {
		this.id = id;
		this.feha = feha;
		this.periodo = periodo;
		this.curso = curso;
		this.docente = docente;
		this.pregunta = pregunta;
		this.leyenda = leyenda;
	}

}