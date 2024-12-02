package conn.mamartinez.encuentaapp.interfaces;

import conn.mamartinez.encuentaapp.modelos.Pregunta;
import conn.mamartinez.encuentaapp.modelos.Respuesta;
import java.util.List;

public interface ICuestionario {

    // Método para responder una pregunta en el cuestionario
    void responderPregunta(Respuesta respuesta);

    // Método para obtener todas las preguntas del cuestionario
    List<Pregunta> obtenerPreguntas();

    // Método para obtener todas las respuestas del cuestionario
    List<Respuesta> obtenerRespuestas();

    // Método para obtener las respuestas de una pregunta específica
    List<Respuesta> obtenerRespuestasPorPregunta(Pregunta pregunta);

    // Método para mostrar los resultados del cuestionario
    void mostrarResultados();

    // Método para mostrar las preguntas y respuestas en formato adecuado
    void mostrarCuestionario();
}
