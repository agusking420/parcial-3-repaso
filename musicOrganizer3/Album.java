package musicOrganizer3;

import java.util.ArrayList;

/**
 * Clase que mantiene los detalles de un album de música.
 * Un album de música consta de pistas, con todas las pistas
 * correspondiendo a un mismo artista.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
public class Album
{
    /**
     * Lista que almacena las pistas del album
     */
    private ArrayList<Pista> pistas;
    
    /**
     * Artista del album
     */
    private String artista;
    
    /**
     * Crea un album vacío, con artista desconocido
     */
    public Album()
    {
        pistas = new ArrayList<Pista>();
        artista = "desconocido";               
    }
    
    /**
     * Crea un album vacío, con artista definido
     */
    public Album(String artista)
    {
        if (artista == null || artista.length() == 0) {
            throw new IllegalArgumentException("artista inválido");
        }
        pistas = new ArrayList<Pista>();
        this.artista = artista;               
    }
    
    
    /**
     * Agrega una pista al album. Si el album está vacío y el 
     * artista es desconocido, se cambia el artista por el 
     * artista de la pista
     * @param Pista es la pista a agregar al album.
     */
    public void agregarPista(Pista pista)
    {
        //TODO: implementar chequeo de precondición
        if (this.pistas.size() == 0) {
            this.artista = pista.obtenerArtista();
        }
        pistas.add(pista);
    }
    
    
    /**
     * Retorna la cantidad de pistas del album
     * @return número de pistas en el album
     */
    public int cantidadPistas()
    {
        return pistas.size();
    }
    
    /**
     * Retorna los títulos de las pistas
     * @return un arreglo conteniendo los títulos de las pistas
     */
    public String[] obtenerTitulos()
    {
        //método no implementado (no requerido)
        return null;
    }
    
    /**
     * Imprime las pistas del album
     */
    public void imprimirPistas()
    {
        for (Pista p: pistas) {
            System.out.println(p.toString());
        }
    }
    
    /**
     * Comprueba si un título pertenece al album
     * @param titulo es el título a buscar en el album
     */
    public boolean pertenece(String titulo)
    {
        //TODO: implementar funcionalidad de este método
        return false;
    }
    
    /**
     * Elimina la primera pista del album con un título determinado.
     * Si no hay en el album ninguna pista con ese título, deja al
     * album en el mismo estado.
     * @param titulo es el título de la pista a eliminar.
     */
    public void eliminarPista(String titulo)
    {
        //método no implementado (no requerido)
    }
    
    /**
     * Invariante de clase para Album. Chequea que la colección de pistas no
     * es nula, el artista no es nulo ni vacío, y todas las pistas tienen por 
     * artista al artista del album
     */
    public boolean repOK() {
        //método no implementado (no requerido)
        return false;
    }
}
