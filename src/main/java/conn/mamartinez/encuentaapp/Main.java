package conn.mamartinez.encuentaapp;

import conn.mamartinez.encuentaapp.modelos.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear leyendas (opciones de respuesta)
        Leyenda siempre = new Leyenda(1, "S", "Siempre");
        Leyenda casiSiempre = new Leyenda(2, "CS", "Casi siempre");
        Leyenda algunasVeces = new Leyenda(3, "AV", "Algunas veces");
        Leyenda nunca = new Leyenda(4, "N", "Nunca");

        // Crear preguntas
        Pregunta pregunta1 = new Pregunta(1, "¿Asistí a las sesiones presenciales y/o sincrónicas de esta asignatura?", List.of(siempre, casiSiempre, algunasVeces, nunca));
        Pregunta pregunta2 = new Pregunta(2, "Realicé las actividades evaluativas propuestas por el docente en esta asignatura", List.of(siempre, casiSiempre, algunasVeces, nunca));
        Pregunta pregunta3 = new Pregunta(3, "¿Me siento satisfecho con lo aprendido?", List.of(siempre, casiSiempre, algunasVeces, nunca));
        Pregunta pregunta4 = new Pregunta(4, "¿Comunicó y explicó detalladamente el programa o syllabus y las formas de evaluación?", List.of(siempre, casiSiempre, algunasVeces, nunca));

// Evaluación del Docente
        Pregunta pregunta5 = new Pregunta(5, "Planifica y desarrolla las actividades de acuerdo al contenido y competencias establecidas en el syllabus", List.of(siempre, casiSiempre, algunasVeces, nunca));
        Pregunta pregunta6 = new Pregunta(6, "Utiliza diferentes recursos tecnológicos para el desarrollo de las estrategias de aprendizaje", List.of(siempre, casiSiempre, algunasVeces, nunca));
        Pregunta pregunta7 = new Pregunta(7, "Promueve el aprendizaje en equipo con apoyo de las TIC (Tecnologías de la información y la comunicación)", List.of(siempre, casiSiempre, algunasVeces, nunca));
        Pregunta pregunta8 = new Pregunta(8, "Utiliza la bibliografía recomendada y otras fuentes de información actualizadas en el contexto que sirven para consolidar y profundizar los conocimientos.", List.of(siempre, casiSiempre, algunasVeces, nunca));
        Pregunta pregunta9 = new Pregunta(9, "Proporciona material de estudio (Documentos, diapositivas, videos, infografías, páginas web, entre otros) para el desarrollo del aprendizaje autónomo", List.of(siempre, casiSiempre, algunasVeces, nunca));
        Pregunta pregunta10 = new Pregunta(10, "Motiva al estudiante durante el aprendizaje", List.of(siempre, casiSiempre, algunasVeces, nunca));
        Pregunta pregunta11 = new Pregunta(11, "Asesora oportunamente a los estudiantes sobre las dudas que surgen en la clase.", List.of(siempre, casiSiempre, algunasVeces, nunca));
        Pregunta pregunta12 = new Pregunta(12, "Las evaluaciones que realiza son orientadas con claridad y presenta los criterios y formas de evaluación", List.of(siempre, casiSiempre, algunasVeces, nunca));
        Pregunta pregunta13 = new Pregunta(13, "Retroalimenta adecuadamente los resultados de las actividades de aprendizaje asignadas en la plataforma virtual o en el aula de clases.", List.of(siempre, casiSiempre, algunasVeces, nunca));
        Pregunta pregunta14 = new Pregunta(14, "Atiende las dificultades de los estudiantes cuando estas surgen.", List.of(siempre, casiSiempre, algunasVeces, nunca));
        Pregunta pregunta15 = new Pregunta(15, "Trata a todos con equidad, respeto y cordialidad", List.of(siempre, casiSiempre, algunasVeces, nunca));
        Pregunta pregunta16 = new Pregunta(16, "Mantiene una relación cordial y respetuosa", List.of(siempre, casiSiempre, algunasVeces, nunca));

// Competencias Tecnológicas
        Pregunta pregunta17 = new Pregunta(17, "Demuestra dominio de los recursos tecnológicos", List.of(siempre, casiSiempre, algunasVeces, nunca));
        Pregunta pregunta18 = new Pregunta(18, "Hace uso adecuado de las TIC para la construcción del conocimiento", List.of(siempre, casiSiempre, algunasVeces, nunca));
        Pregunta pregunta19 = new Pregunta(19, "Dominio y uso de la plataforma UAM virtual", List.of(siempre, casiSiempre, algunasVeces, nunca));



        // Crear Curso
        Curso curso = new Curso(1, "Matemáticas 101", "Curso básico de matemáticas");

        // Crear Docente
        Docente docente = new Docente(1, "Juan", "Pérez", "juan.perez@example.com", "Licenciado en Matemáticas");

        // Crear respuestas
        Respuesta respuesta1 = new Respuesta(1, LocalDate.now(), "2024-1", curso, docente, pregunta1, siempre);
        Respuesta respuesta2 = new Respuesta(2, LocalDate.now(), "2024-1", curso, docente, pregunta2, casiSiempre);
        Respuesta respuesta3 = new Respuesta(3, LocalDate.now(), "2024-1", curso, docente, pregunta3, algunasVeces);

        // Imprimir respuestas para verificar
        System.out.println("Respuesta 1: " + respuesta1.getPregunta().getNombre() + " - " + respuesta1.getLeyenda().getDescripcion());
        System.out.println("Respuesta 2: " + respuesta2.getPregunta().getNombre() + " - " + respuesta2.getLeyenda().getDescripcion());
        System.out.println("Respuesta 3: " + respuesta3.getPregunta().getNombre() + " - " + respuesta3.getLeyenda().getDescripcion());
    }
}
