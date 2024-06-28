package musicOrganizer3;

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
     * Constructor de objetos de la clase Pista.
     * Ni el artista ni el título deben ser nulos o vacíos.
     * @param artista es el artista de la pista
     * @param titulo es el titulo de la pista
     */
    public Pista(String artista, String titulo)
    {
        //TODO: implementar chequeo de precondición
        this.artista = artista;
        this.titulo = titulo;
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
     * Retorna los detalles de la pista, título y artista, como
     * cadena de caracteres.
     * @return detalles de la pista en una cadena de caracteres,
     * usando el formato "<titulo> (por <artista>)" o
     * "<titulo> (artista desconocido)", si no se conoce el artista.
     */
    public String toString()
    {
        String detalles = this.titulo;
        if (this.artista.equals("desconocido")) {
            detalles = detalles + " (artista desconocido)";
        }
        else {
            detalles = detalles + " (por " + this.artista + ")";
        }
        return detalles;
    }
    
    /**
     * Invariante de clase para Pista.
     * Chequea que tanto titulo como artista no sean null ni vacías.
     */
    public boolean repOK() {
        //TODO: implementar funcionalidad de este método
        return false;
    }
}
