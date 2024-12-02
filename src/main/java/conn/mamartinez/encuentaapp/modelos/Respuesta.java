package conn.mamartinez.encuentaapp.modelos;

import java.util.Scanner;
import java.time.LocalDate;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFeha() {
		return feha;
	}

	public void setFeha(LocalDate feha) {
		this.feha = feha;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Pregunta getPregunta() {
		return pregunta;
	}

	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}

	public Leyenda getLeyenda() {
		return leyenda;
	}

	public void setLeyenda(Leyenda leyenda) {
		this.leyenda = leyenda;
	}
}