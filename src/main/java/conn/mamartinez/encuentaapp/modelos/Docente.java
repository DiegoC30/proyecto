package conn.mamartinez.encuentaapp.modelos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Docente {

	@Id
	private int id;
	@Column(length=60)
	private String nombres;
	private String apellidos;

	private String email;
	private String titulo;




}//end Docente