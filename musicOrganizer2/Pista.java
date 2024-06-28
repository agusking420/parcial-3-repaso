package musicOrganizer2;

/**
 * Almacena los detalles de una pista de música, 
 * en particular artista y título.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
public class Pista
{
    /**
     * el artista
     */ 
    private String artista;
    
    /**
     * el título de la pista
     */
    private String titulo;
    
    /**
     * duración de la pista (en segundos)
     */
    private int duracion;
    
    /**
     * Constructor de objetos de la clase Pista.
     * Ni el artista ni el título deben ser nulos o vacíos.
     * La duración debe ser un número positivo.
     * @param artista es el artista de la pista
     * @param titulo es el titulo de la pista
     */
    public Pista(String artista, String titulo, int duracion)
    {
        //TODO: implementar chequeo de precondición
        this.artista = artista;
        this.titulo = titulo;
        this.duracion = duracion;
    }
    
    /**
     * Retorna el artista de la pista.
     * @return el artista de la pista.
     */
    public String obtenerArtista()
    {
        return artista;
    }
    
    /**
     * Retorna el título de la pista.
     * @return el título de la pista.
     */
    public String obtenerTitulo()
    {
        return titulo;
    }
    
    /**
     * Retorna la duración de la pista.
     * @return la duración de la pista.
     */
    public int obtenerDuracion()
    {
        return duracion;
    }
        
    /**
     * Retorna los detalles de la pista, título, artista y duracion, 
     * como cadena de caracteres.
     * @return detalles de la pista en una cadena de caracteres,
     * usando el formato "<titulo> (<artista>), <duracion>s." 
     */
    public String toString()
    {
        String detalles = this.titulo;
        detalles = detalles + " (" + artista + "), ";
        detalles = detalles + duracion + "s.";
        return detalles;
    }
    
    /**
     * Invariante de clase para Pista.
     * Chequea que tanto titulo como artista no sean null ni vacías,
     * y que duracion sea positivo.
     */
    public boolean repOK() {
        //TODO: implementar funcionalidad de este método
        return false;
    }
}
