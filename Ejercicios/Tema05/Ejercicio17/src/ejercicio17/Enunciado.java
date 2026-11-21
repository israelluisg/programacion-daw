package ejercicio17;

/**
 *
 * Clase que representa una pregunta de examen y su respuesta.
 * Permite consultar y modificar sus datos.
 *
 * @author israel
 */
public class Enunciado {
    // Atributos
    private String pregunta;
    private String respuesta;
    
    /**
     * Constructor sin parámetros.
     */
    public Enunciado() {
        pregunta = "";
        respuesta = "";
    }
    
    /**
     * Constructor con parámetros.
     * @param pregunta valor que se asigna a pregunta.
     * @param respuesta valor que se asigna a respuesta.
     */
    public Enunciado(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    
    // Getters y Setters
    
    /**
     * Método que devuelve el valor de pregunta.
     * @return valor de pregunta.
     */
    public String getPregunta() {
        return pregunta;
    }
    
    /**
     * Método que devuelve el valor de respuesta.
     * @return valor de respuesta.
     */
    public String getRespuesta() {
        return respuesta;
    }
    
    /**
     * Método que establece un valor a pregunta.
     * @param pregunta nuevo valor de pregunta.
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    /**
     * Método que establece un valor a respuesta.
     * @param respuesta nuevo valor de respuesta.
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    /**
     * Método que devuelve los datos del enunciado.
     * @return cadena con los datos del enunciado.
     */
    @Override
    public String toString() {
        return "Pregunta: " + pregunta
                + ", Respuesta: " + respuesta;
    }
}