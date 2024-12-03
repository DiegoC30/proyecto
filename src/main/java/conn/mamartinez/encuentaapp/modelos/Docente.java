package conn.mamartinez.encuentaapp.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Docente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;

	private String apellido;

	private String correo;

	private String titulo;

	public Docente() {}

	public Docente(Long id, String nombre, String apellido, String correo, String titulo) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.titulo = titulo;
	}
}
