package auction;

/**
 * Almacena los detalles de una oferta, 
 * en particular nombre del oferente y monto ofertado.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
public class Oferta
{
    /**
     * el oferente
     */ 
    private String nombre;
    
    /**
     * el monto de la oferta
     */
    private int monto;
    
    /**
     * Constructor de objetos de la clase Oferta.
     * El oferente debe ser no nulo y no vacío. El monto
     * mayor a cero.
     * @param oferente es el oferente de la oferta
     * @param monto es el monto de la oferta
     */
    public Oferta(String oferente, int monto)
    {
        if (oferente == null || oferente.trim().isEmpty()){
            throw new IllegalArgumentException("el oferente es invalido");
        }
        if (monto <= 0){
            throw new IllegalArgumentException("el monto minimo es 1");
        }
        this.nombre = oferente;
        this.monto = monto;
        assert repOK():"el constructor creo objetos invalidos";
    }
    
    
    /**
     * Retorna el oferente de la oferta.
     * @return el ofente de la oferta.
     */
    public String obtenerOferente()
    {
        return nombre;
    }
    
    /**
     * Retorna el monto de la oferta.
     * @return el monto de la oferta.
     */
    public int obtenerMonto()
    {
        return monto;
    }
        
    /**
     * Retorna los detalles de la oferta, oferente y monto, como
     * cadena de caracteres.
     * @return detalles de la oferta en una cadena de caracteres,
     * usando el formato "<monto> (por <oferente>)".
     */
    public String toString()
    {
        String detalles = this.monto + "(por " + this.nombre + ")";
        return detalles;
    }
    
    /**
     * Invariante de clase para Oferta.
     * Chequea que el oferente no sea null ni vacío, y que el monto sea
     * positivo
     */
    public boolean repOK() {
        if (nombre == null || nombre.trim().isEmpty()){
            return false;
        }
        if (monto <= 0){
            return false;
        }        
        return true;
    }
}
