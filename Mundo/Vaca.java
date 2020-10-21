package Mundo;
/**
 *
 * @author John Silva
 */
public class Vaca {
    //PARAMETROS
    /*
    *Numero de id de la vaca(089)
    */
    private String numeroSerie; 
    /*
    *Nombre de la vaca, en caso de no tener 
    *se rellena como ---------
    */
    private String nombre;
    /*
    *Raza de la vaca
    */
    private String raza;
    /*
    *Edad de la vaca
    */
    private int edad;
    /*
    *Peso de la vaca en kg
    */
    private float peso;
    /*
    *Numero de crias de la vaca
    */
    private int numCrias;
    /*
    *Cantidad de carne producida(KG)
    */  
    private float cantidadCarne;
    /*
    *Cantidad de leche producida(L)
    */ 
    private float cantidadLeche;

    //CONSTRUCTOR
    /*
    *Crea una vaca
    */
    public Vaca(String nNumeroSerie,String nNombre,String nRaza, int nEdad,float nPeso,int nNumCrias,float nCantidadCarne, float nCantidadLeche){
        numeroSerie=nNumeroSerie;
        if(nNombre==""){
            nombre="NULL";
        }else{
            nombre=nNombre;
        }
        raza=nRaza;
        edad=nEdad;
        peso=nPeso;
        numCrias=nNumCrias;
        cantidadCarne=nCantidadCarne;
        cantidadLeche=nCantidadLeche;
    }
}
