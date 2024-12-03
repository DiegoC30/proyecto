package conn.mamartinez.encuentaapp.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity

public class Docente {

    @Id
    private int id;
    @Column(length = 60)
    private String nombres;
    private String apellidos;

    private String email;
    private String titulo;

	public Docente() {
	}

	public Docente(int id, String nombres, String apellidos, String email, String titulo) {
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.email = email;
		this.titulo = titulo;
	}

}//end Docente