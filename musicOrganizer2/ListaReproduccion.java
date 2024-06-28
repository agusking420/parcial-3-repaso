package musicOrganizer2;

import java.util.ArrayList;

/**
 * Clase que mantiene los detalles de una lista de reproduccion de música.
 * Una lista de música consta de pistas. 
 * 
 * @author N. Aguirre
 * @version 0.1
 */
public class ListaReproduccion
{
    /**
     * Lista que almacena las pistas del album
     */
    private ArrayList<Pista> pistas;
    
    /**
     * Crea una lista de musica vacía
     */
    public ListaReproduccion()
    {
        pistas = new ArrayList<Pista>();
    }
    
    /**
     * Agrega una pista al final de la lista de música. 
     * @param Pista es la pista a agregar a la lista de música.
     */
    public void agregarPista(Pista pista)
    {
        if (pista == null) {
            throw new IllegalArgumentException("pista nula");
        }
        pistas.add(pista);
    }
    
    
    /**
     * Retorna la cantidad de pistas de la lista de música
     * @return número de pistas en la lista de música
     */
    public int cantidadPistas()
    {
        return pistas.size();
    }
    
    /**
     * Retorna los artistas de las pistas de la lista de msica.
     * @return un arreglo conteniendo los artistas de las pistas
     */
    public String[] obtenerArtistas()
    {
        //método no implementado (no requerido)
        return null;
    }
    
    /**
     * Imprime por consola las pistas de la lista de musica 
     */
    public void imprimirPistas()
    {
        //TODO: implementar funcionalidad de este método
    }
    
    /**
     * Comprueba si un artista participa de la lista de música 
     * @param artista es el artista a buscar
     */
    public boolean pertenece(String artista)
    {
        //TODO: implementar funcionalidad de este método
        return false;
    }
    
    /**
     * Calcula la duración total de la lista de música.
     * La duración de la lista es la suma de las duraciones de
     * las pistas que la conforman
     * @return duración total de la lista de reproducción
     */
    public int duracionLista()
    {
        //método no implementado (no requerido)
        return 0;
    }
    
    /**
     * Invariante de clase para ListaReproduccion. Chequea que la colección de 
     * pistas no es nula, que no tiene pistas nulas, y cada pista satisface el 
     * invariante de pista correspondiente 
     */
    public boolean repOK() {
        //método no implementado (no requerido)
        return false;
    }
}
