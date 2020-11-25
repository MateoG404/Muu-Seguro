package Mundo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;


/**
 *
 * @author John Silva
 */
public class Animal {
    /*
    *
    */
    protected String numeroSerie; 
    /*
    *Nombre del animal, en caso de no tener 
    *se rellena como ---------
    */
    private String nombre;
    /*
    *Raza del animal
    */
    private String raza;
    /*
    *Edad del animal
    */
    private  int edad;
    /*
    *Peso del animal en kg
    */
    private float peso;
    /*
    *Numero de crias del animal
    */
    private int numCrias;
    /*
    *Cantidad de carne producida(KG)
    */  
    private float cantidadCarne;
    /*
    *Arreglo de crias
    */
    ArrayList<Ternero> crias=new ArrayList<>();
    /*
    *Diccionario de enfermedades:medicamentos
    */
    private Hashtable<Enfermedad, Medicina> enfermedadesDic = new Hashtable<Enfermedad, Medicina>();
    
    public Animal(String nNumeroSerie,String nNombre,String nRaza, int nEdad,float nPeso,int nNumCrias,float nCantidadCarne, String cadenaEnfermedades){
        numeroSerie=nNumeroSerie;
        nombre=nNombre;
        raza=nRaza;
        edad=nEdad;
        peso=nPeso;
        numCrias=nNumCrias;
        cantidadCarne=nCantidadCarne;
        añadirEnfermedades(cadenaEnfermedades);
    }
    public void añadirEnfermedades(String cadena){
        ArrayList<String>enfermedades= new ArrayList(Arrays.asList(cadena.split(";")));
        for(int i=0; i<enfermedades.size();i++){
            String[]valores=enfermedades.get(i).split(":");
            Enfermedad aux=new Enfermedad(valores[0]);
            Medicina aux2=new Medicina(valores[1]);
            enfermedadesDic.put(aux, aux2);
        }
    }
    public void hijos(){
        
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
