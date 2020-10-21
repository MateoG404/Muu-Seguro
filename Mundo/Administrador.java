package Mundo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author John Silva
 */
public class Administrador {
    //PARAMETROS
    /*
    *Direccion .csv usuarios
    */
    private static String pathUsers;
    
    /*
    *Direccion .csv animales
    */
    private static String pathAnimals;
    /*
    *Nombre de usuario
    */
    private String nombreUsuario;
    /*
    *Correo de usuario
    */
    private String correoElectronico;
    /*
    *Contraseña
    */
    private String contraseña;
    
    /*
    *Arreglo de empleados
    */
    private ArrayList<Empleado> empleados;
    /*
    *Arreglo Veterinario
    */
    private ArrayList<Veterinario> veterinarios;
    /*
    *Arreglo Vacas
    */
    private ArrayList<Vaca> vacas;
    /*
    *Arreglo Veterinario
    */
    private ArrayList<Toro> toros;
    
    //CONTRUCTORES
    /*
    *Crear admin
    */
    public Administrador(String nombre, String correo,String contraseña){
         nombreUsuario=nombre;
         correoElectronico=correo;
         this.contraseña=contraseña;
         pathUsers=".\\src\\dataBase\\"+correo+"Usuarios.csv";
         pathAnimals=".\\src\\dataBase\\"+correo+"Animales.csv";
         basesUsuarios();
         basesAnimales();
    }
    //METODOS
    /*
    *Crear .csv para empleado y veterinarios
    */
    private void basesUsuarios(){
        try{
            FileWriter empresas=new FileWriter(pathUsers, true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /*
    *Crear .csv para animales
    */
    private void basesAnimales(){
        try{
            FileWriter empresas=new FileWriter(pathAnimals, true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /*
    *Al utilizar este metodo se añade al .csv(Usuarios) un usuario de tipo empleado o veterinario
    */
    public void registrarUsuario(String tipo, int salario, String nombreU, String contraseña){
        try{
            FileWriter usuarios= new FileWriter(pathUsers, true);
            PrintWriter registrar=new PrintWriter(usuarios);
            registrar.println(tipo+","+salario+","+nombreU+","+contraseña);
            registrar.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        arregloEmpleados();
        arregloVeterinarios();
    }
    /*
    *Al utilizar este metodo se añade al .csv(Animales) un animal de tipo vaca o toro
    */
    public void registrarAnimal(String numSerie, String nombre, String raza, String sexo,int edad, int peso, int numCrias, float cantidadCarne, float cantidadLeche){
        if(sexo=="Vaca"){
            try{
                FileWriter animales= new FileWriter(pathAnimals, true);
                PrintWriter registrar=new PrintWriter(animales);
                registrar.println(sexo+","+numSerie+","+nombre+","+raza+","+edad+","+peso+","+numCrias+","+ cantidadCarne+","+cantidadLeche);
                registrar.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            try{
                FileWriter animales= new FileWriter(pathAnimals, true);
                PrintWriter registrar=new PrintWriter(animales);
                registrar.println(sexo+","+numSerie+","+nombre+","+raza+","+edad+","+peso+","+numCrias+","+ cantidadCarne+","+"NULL");
                registrar.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }    
    } 
    /*
    *Añade todo los elementos de tipo empleado 
    *que encuentre en el .csv al arreglo de empleados 
    */
    private void arregloEmpleados(){
        String linea;
        try{
            BufferedReader br =new BufferedReader(new FileReader(pathUsers));
            while((linea=br.readLine())!= null){//cada linea del archivo csv
                String[] valores = linea.split(",");//arreglo de las columnas de cada linea
                if (valores[0].equals("Empleado")){
                    int sueldo=Integer.parseInt(valores[1]);
                    Empleado emp=new Empleado(sueldo,valores[2],valores[3]);
                    empleados.add(emp);
                    }
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /*
    *Añade todo los elementos de tipo veterinario que encuentre 
    *en el .csv al arreglo de empleados 
    */
    private void arregloVeterinarios(){
        String linea;
        try{
            BufferedReader br =new BufferedReader(new FileReader(pathUsers));
            while((linea=br.readLine())!= null){//cada linea del archivo csv
                String[] valores = linea.split(",");//arreglo de las columnas de cada linea
                if (valores[0].equals("Veterinario")){
                    int sueldo=Integer.parseInt(valores[1]);
                    Veterinario vet=new Veterinario(sueldo,valores[2],valores[3]);
                    veterinarios.add(vet);
                    }
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /*
    *Añade todo los elementos de tipo vaca que encuentre 
    *en el .csv al arreglo de vacas
    */
    private void arregloVacas(){
        //|sexo|numSerie|nombre|raza|edad|peso|numCrias|cantidadCarne|cantidadLeche|
        String linea;
        try{
            BufferedReader br =new BufferedReader(new FileReader(pathUsers));
            while((linea=br.readLine())!= null){//cada linea del archivo csv
                String[] valores = linea.split(",");//arreglo de las columnas de cada linea
                if (valores[0].equals("Vaca")){//si el sexo es vaca
                    Vaca muu=new Vaca(valores[1], valores[2],valores[3],Integer.parseInt(valores[4]),
                    Float.parseFloat(valores[5]), Integer.parseInt(valores[6]), Float.parseFloat(valores[7]),
                    Float.parseFloat(valores[8]));
                    vacas.add(muu);
                    }
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     /*
    *Añade todo los elementos de tipo toro que encuentre 
    *en el .csv al arreglo de toros
    */
    private void arregloToros(){
        //|sexo|numSerie|nombre|raza|edad|peso|numCrias|cantidadCarne|
        String linea;
        try{
            BufferedReader br =new BufferedReader(new FileReader(pathUsers));
            while((linea=br.readLine())!= null){//cada linea del archivo csv
                String[] valores = linea.split(",");//arreglo de las columnas de cada linea
                if (valores[0].equals("Toro")){//si el sexo es toro
                    Toro muu=new Toro(valores[1], valores[2],valores[3],Integer.parseInt(valores[4]),
                    Float.parseFloat(valores[5]), Integer.parseInt(valores[6]), Float.parseFloat(valores[7]));
                    toros.add(muu);
                    }
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    /*
    *Retornar el arreglo de veterinarios
    */
    public ArrayList<Veterinario> darArregloVeterinarios(){
        return veterinarios;
    }
    /*
    *Retornar el arreglo de empleados
    */
    public ArrayList<Empleado> darArregloEmpleados(){
        return empleados;
    }
    /*
    *Retornar el arreglo de vacas
    */
    public ArrayList<Vaca> darArregloVacas(){
        return vacas;
    }
    /*
    *Retornar el arreglo de toros
    */
    public ArrayList<Toro> darArregloToros(){
        return toros;
    }
   
}
