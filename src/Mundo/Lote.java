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
public class Lote {
    
   private int numero; 
   private int hectareas;
   private float distanciaCasa;
   private String razaLote;
   private String calidadPasto;
   private String agua; 
   
   public Lote(int nNumero, int nHectareas, float nDistanciaCasa, String nRazaLote, String nCalidadPasto, String nAgua){
        numero=nNumero;
        hectareas=nHectareas;
        distanciaCasa=nDistanciaCasa;
        razaLote=nRazaLote;
        calidadPasto=nCalidadPasto;
        agua=nAgua;
   }
   public int darNumero(){
       return numero;
   }
   
    public int darHectareas(){
       return hectareas;
   }
    
    public float darDistanciaCasa(){
       return distanciaCasa;
   }
   public String darRazaLote(){
       return razaLote;
   }
   public String darCalidad(){
       return calidadPasto;
   }
    public String darAgua(){
       return agua;
   }
   

   
}
