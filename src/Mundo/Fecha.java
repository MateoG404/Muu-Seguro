
package Mundo;

/**
 *
 * @author John Silva , MateoG404 and Laura Ardila
 */
public class Fecha {
    //Parametros
    /*
    *Día
    */
    private int dia;
    /*
    *Mes
    */
    private int mes;
    /*
    *Año
    */
    private int año;
    //CONTRUCTOR
    /*
    *
    */
    public Fecha(String fechaFormateada){
        String [] numerosFecha=fechaFormateada.split("/");
        convertirFecha(numerosFecha);
    }
    /*
    *Asigna los valores a los parametros de la fecha
    */
    private void convertirFecha(String[] numeros){
        dia=Integer.parseInt(numeros[0]);
        mes=Integer.parseInt(numeros[1]);
        año=Integer.parseInt(numeros[2]);
    }
    
    public String toString(){
        return dia+"/"+mes+"/"+año;
    }
    
}
