package auction;

import java.util.ArrayList;

/**
 * Clase que mantiene los detalles de una subasta.
 * Una subasta consta de ofertas, y un monto mínimo.
 * Todas las ofertas deben ser por montos mayores o iguales
 * que el monto mínimo.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
public class Subasta
{
    /**
     * Lista que almacena las ofertas
     */
    private ArrayList<Oferta> ofertas;
    
    /**
     * Monto mínimo
     */
    private int montoMinimo;
    
    /**
     * Crea una subasta vacía, con un monto mínimo inicial
     */
    public Subasta(int montoMinimo)
    {
        if (montoMinimo <= 0)
            throw new IllegalArgumentException("Monto mínimo inválido");
        ofertas = new ArrayList<Oferta>();
        this.montoMinimo = montoMinimo;               
    }
    
    /**
     * Agrega una oferta a la subasta. Debe cumplir con la restricción
     * de monto mínimo
     * @param oferta es la oferta a agregar a la subasta.
     */
    public void agregarOferta(Oferta oferta)
    {
        if (oferta == null || oferta.obtenerOferente().trim().isEmpty() || 
        oferta.obtenerMonto() < montoMinimo) {
        throw new IllegalArgumentException("la oferta que se desea agregar es invalida");
        }
        ofertas.add(oferta);
    }
    
    
    /**
     * Retorna la cantidad de ofertas de la subasta
     * @return número de ofertas en la subasta
     */
    public int cantidadOfertas()
    {
        return ofertas.size();
    }
    
    /**
     * Retorna los montos de las ofertas
     * @return un arreglo conteniendo los montos de las ofertas
     */
    public int[] obtenerMontosOfertas()
    {
        int[] montos = new int [ofertas.size()];/*creo un arreglo de enteros, y 
        *como tamaño del arreglo pongo el tamaño del arraylis, es decir el campo
        */
        int indice = 0;
        while(indice < ofertas.size()){
            montos[indice] = ofertas.get(indice).obtenerMonto();/*itero sobre cada 
            *elemento del arraylist y obtengo su monto que es un valor int y 
            *lo asigno en el arreglo de enteros
            */
            indice++;
        }
        return montos;
    }
    
    /**
     * Imprime las ofertas de la subasta
     */
    public void imprimirOfertas()
    {
        for (Oferta p: ofertas) {
            System.out.println(p.toString());
        }
    }
    
    /**
     * Comprueba si existen ofertas superiores a cierto monto
     * en la subasta
     * @param monto es el monto a utilizar en la búsqueda
     * @return true ssi existe una oferta en la subasta con valor mayor
     * al monto pasado como parámetro
     */
    public boolean ofertasMayores(int monto)
    {
        //método no implementado (no requerido)
        return false;
    }
    
    /**
     * Calcula la oferta ganadora hasta el momento.
     * La oferta ganadora es la oferta de mayor monto. 
     * Si hay varias ofertas con igual máximo monto, retorna la
     * primera. 
     * Debe haber al menos una oferta para poder calcular oferta
     * ganadora
     * @return oferta ganadora, máxima oferta en la subasta.
     */
    public Oferta ofertaGanadora()
    {
        if (ofertas.isEmpty()) { //verifica si ofertas esta vacio
        throw new IllegalStateException("No hay ofertas disponibles para calcular la oferta ganadora");
        }
        Oferta ofertaGanadora = ofertas.get(0); //inicializo la oferta ganadora en la primera oferta
        int montoMaximo = ofertas.get(0).obtenerMonto(); //extraigo el monto de la primer oferta
        for(int i = 1 ; i < ofertas.size() ; i++){ 
            Oferta ofertaActual = ofertas.get(i); /*itero sobre las demas ofertas, 1 en adelante 
            *y lo guardo en una var ofertaActual
            */
           int montoActual = ofertas.get(i).obtenerMonto();//extraigo el monto
                if (montoActual > montoMaximo){ //actualizo la var con el valor maximo iterado
                    montoMaximo = montoActual;
                    ofertaGanadora = ofertaActual;
                }
            }
            return ofertaGanadora;
        }
    
    
    /**
     * Invariante de clase para Subasta. Chequea que la colección de ofertas no
     * es nula, el monto mínimo es positivo, cada oferta satisface su repOK, 
     * y todos los montos de ofertas son mayores o iguales al monto mínimo.
     */
    public boolean repOK() {
        //método no implementado (no requerido)
        return false;
    }
}
