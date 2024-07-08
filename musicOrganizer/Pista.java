package musicOrganizer;

/**
 * Almacena los detalles de una pista de música, 
 * en particular artista y título.
 * 
 * @author R. Morosi
 * @version 0.2
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
        if(artista==null || artista.trim().isEmpty()){
            throw new IllegalArgumentException("el artista es invalido");

        }
        
        if(titulo==null || titulo.trim().isEmpty()){
            throw new IllegalArgumentException("el titulo es invalido");
        }
        /*
         * trim es para sacar los espacios vacios al principio y al final y 
         * isEmpty es para ver si una cadena esta vacia. si alguien pusiera " "
         * el null no saltaria, pero el trim te lo recortaria a "" y ahi el isEmpty
         * dirira que esta vacia, nash
         */
        this.artista = artista;
        this.titulo = titulo;
    }
    
    /**
     * Constructor de objetos de la clase Pista.
     * Si el artista no se provee, se define como
     * "desconocido".
     * @param titulo es el titulo de la pista
     */
    public Pista(String titulo)
    {
        if(titulo==null || titulo.trim().isEmpty()){
            throw new IllegalArgumentException("el titulo es invalido");
        }
        this.artista = "desconocido";
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
     * precondicion: la pista no puede ser vacia o invalida. si el artista es null
     * retornara artista desconocido
     * @return detalles de la pista en una cadena de caracteres,
     * usando el formato "<titulo> (por <artista>)" o
     * "<titulo> (artista desconocido)", si no se conoce el artista.
     * @throws IllegalArgumentException si la pista es invalida o vacia
     */
    public String toString()
    {
        if (titulo == null || titulo.trim().isEmpty()){
            throw new IllegalArgumentException("pista invalida");
            /*
             * esto revisa que la pista no sea invalida ni una cadena vacia
             */
        }else{
            if (artista == null){
            return titulo + " por artista desconocido";
            }
            return titulo + " (por " + artista + ")";
        }
    }
    
    /**
     * Invariante de clase para Pista.
     * Chequea que tanto titulo como artista no sean null ni vacías.
     */
    public boolean repOK() {
        if(titulo==null || titulo.trim().isEmpty()){
            return false;
        }
        if(artista==null || artista.trim().isEmpty()){
            return false;
        }
        return true;
    }
}
