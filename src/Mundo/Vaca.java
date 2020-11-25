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
public class Vaca extends Animal{
    //PARAMETROS
    /*
    *Numero de id de la vaca(089)
    */
    //private String numeroSerie; 
    /*
    *Nombre de la vaca, en caso de no tener 
    *se rellena como ---------
    */
   //private String nombre;
    /*
    *Raza de la vaca
    */
    //private String raza;
    /*
    *Edad de la vaca
    */
    //private int edad;
    /*
    *Peso de la vaca en kg
    */
    //private float peso;
    /*
    *Numero de crias de la vaca
    */
    //private int numCrias;
    /*
    *Cantidad de carne producida(KG)
    */  
    //private float cantidadCarne;
    /*
    *Cantidad de leche producida(L)
    */ 
    private float cantidadLeche;

    //CONSTRUCTOR
    /*
    *Crea una vaca
    */
    public Vaca(String nNumeroSerie,String nNombre,String nRaza, int nEdad,float nPeso,int nNumCrias,float nCantidadCarne, float nCantidadLeche, String cadenaEnfermedades){
        super( nNumeroSerie, nNombre,nRaza,  nEdad, nPeso, nNumCrias, nCantidadCarne,cadenaEnfermedades);
        cantidadLeche=nCantidadLeche;
    }
    public float darCantidadLeche(){
        return cantidadLeche;
    }
}

