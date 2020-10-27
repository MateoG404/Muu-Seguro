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
public class Toro {
    //PARAMETROS
    /*
    *Numero de id del toro(039)
    */
    private String numeroSerie; 
    /*
    *Nombre del toro, en caso de no tener 
    *se rellena como ---------
    */
    private String nombre;
    /*
    *Raza del toro
    */
    private String raza;
    /*
    *Edad del toro
    */
    private int edad;
    /*
    *Peso del toro en kg
    */
    private float peso;
    /*
    *Numero de crias del toro
    */
    private int numCrias;
    /*
    *
    */  
    private float cantidadCarne;
    
    //CONTRUCTOR
    /*
    *Crea un toro
    */
    public Toro(String nNumeroSerie,String nNombre,String nRaza, int nEdad,float nPeso,int nNumCrias,float nCantidadCarne){
        numeroSerie=nNumeroSerie;
        nombre=nNombre;
        raza=nRaza;
        edad=nEdad;
        peso=nPeso;
        numCrias=nNumCrias;
        cantidadCarne=nCantidadCarne;
    }
    public String darNumeroSerie(){
        return numeroSerie;
    }
    
    public String darNombre(){
        return nombre;
    }
    
    public String darRaza(){
        return raza;
    }
    
    public int darEdad(){
        return edad;
    }
    
    public float darpeso(){
        return peso;
    }

    public int darNumeroCrias(){
        return numCrias;
    }
    
    public float darCantidadCarne(){
        return cantidadCarne;
    }
}