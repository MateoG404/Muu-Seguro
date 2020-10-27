/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

/**
 *
 * @author John Silva
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
