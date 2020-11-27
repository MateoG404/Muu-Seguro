
package Mundo;

/**
 *
 * @author John Silva
 */
public class Lote {
    
   private int numero; 
   private String razaLote;
   private String calidadPasto;
   private String agua; 
   private int X;
   private int Y;
   
   public Lote(int nNumero, String nRazaLote, String nCalidadPasto, String nAgua, int x, int y){
        numero=nNumero;
    
        razaLote=nRazaLote;
        calidadPasto=nCalidadPasto;
        agua=nAgua;
   }
   public int darNumero(){
       return numero;
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
