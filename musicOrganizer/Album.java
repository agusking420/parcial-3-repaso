 package musicOrganizer;

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
        assert repOK() : "Estado inválido al inicio del constructor";
        pistas = new ArrayList<Pista>();
        artista = "desconocido";               
    }
    
    /**
     * Crea un album vacío, con artista definido
     */
    public Album(String artista)
    {
        assert repOK() : "Estado inválido al inicio del constructor";
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
     * precondicion la pista no pued ser invalida
     * @param Pista es la pista a agregar al album.
     */
    public void agregarPista(Pista pista)
    {
        if(pista == null){
            throw new IllegalArgumentException("la pista es invalida");
        }
        if (pistas.size() == 0) {
            artista = pista.obtenerArtista();
        }
        pistas.add(pista);
        assert repOK() : "Estado inválido al final de método";
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
    public String[] obtenerTitulos() {
        String[] titulos = new String[pistas.size()]; /*
        *creo una varible titulos que almacena un arreglo de strings que son los titulos de las pistas
        *new String[pistas.size()]; crea el arreglo y en el tamaños del arreglo pone el tamaño de array pistas
        */
        int i = 0; //declaro iterador
        for (Pista varPista : pistas) { /*declaro la varPistas que es del tipo del arraylist del campo que va 
            *iterrar e el album
            */
            titulos[i++] = varPista.obtenerTitulo(); //el i que rellena el alegro aumenta en uno por cada asignacion
        }
        assert repOK() : "Estado inválido al final de método";
        return titulos;
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
     * el titulo no debe ser nulo ni vacio.
     * @param titulo es el título a buscar en el album
     */
    public boolean pertenece(String titulo)
    {
        if (titulo == null || titulo.trim().isEmpty()) {
        throw new IllegalArgumentException("El título no puede ser nulo o vacío");
        }
        for (Pista varPista : pistas) { //declaro varPista para recorrer el album
            String currTitulo = varPista.obtenerTitulo(); //declaro una var que almacena el titulo de la pista actual
            if(currTitulo.equals(titulo)){ //comparo el titulo de la pista actual con el ingresdo por el ususario
                return true; //si es igual retorno true
            }
        }
        assert repOK() : "Estado inválido al final de método";
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
        if(titulo == null || titulo.trim().isEmpty()){
            throw new IllegalArgumentException("titulo invalido");
        }
        for (int i=0 ; i<pistas.size() ; i++) {
            Pista currPista = pistas.get(i); //declaro una variable para guardar la pista del album que se esta iterando
            String currTitulo = currPista.obtenerTitulo(); //obtengo el titulo de esa pista
            if (currTitulo.equals(titulo)){ //lo comparo con el que pasa el ususario
                pistas.remove(i); //si es igual elimino esa pista
            }
        } 
        assert repOK() : "Estado inválido al final de método";
    }
    
    /**
     * Invariante de clase para Album. Chequea que la colección de pistas no
     * es nula, el artista no es nulo ni vacío, y todas las pistas tienen por 
     * artista al artista del album
     */
    public boolean repOK() {
        if (pistas == null){
            return false; 
        }
        if (artista == null || artista.trim().isEmpty()){
            return false;
        } 
        // Verifica que todas las pistas tengan por artista al artista del álbum
        for (Pista pista : pistas) {
            if (!pista.obtenerArtista().equals(artista)) {
                return false;
            }
        }
        return true;
        }
}

