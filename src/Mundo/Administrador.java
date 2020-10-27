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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author John Silva, MateoG404 and Laura Ardila
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
    *Direccion .csv animales
    */
    private static String pathLot;
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
    private ArrayList<Empleado> empleados=new ArrayList <Empleado>();
    /*
    *Arreglo Veterinario
    */
    private ArrayList<Veterinario> veterinarios=new ArrayList <Veterinario>();
    /*
    *Arreglo Vacas
    */
    private ArrayList<Vaca> vacas=new ArrayList<Vaca>();
    /*
    *Arreglo Veterinario
    */
    private ArrayList<Toro> toros=new ArrayList<Toro>();;
    /*
    *Arreglo lotes
    */
    private ArrayList<Lote> lotes=new ArrayList<Lote>();;
    //CONTRUCTORES
    /*
    *Crear admin
    */
    public Administrador(String nombre, String correo,String contraseña){
        nombreUsuario=nombre;
        correoElectronico=correo;
        this.contraseña=contraseña;
        pathUsers="C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\dataBase\\"+correo+"Usuarios.csv";
        pathAnimals="C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\dataBase\\"+correo+"Animales.csv";
        pathLot="C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\dataBase\\"+correo+"Lotes.csv";
        basesUsuarios();
        basesAnimales();
        basesLotes();
        arregloEmpleados();
        arregloVeterinarios();
        arregloVacas();
        arregloToros();
        arregloLotes();
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
    *Crear .csv para lotes
    */
    private void basesLotes(){
        try{
            FileWriter empresas=new FileWriter(pathLot, true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /*
    *Al utilizar este metodo se añade al .csv(Usuarios) un usuario de tipo empleado o veterinario
    */
    public void registrarUsuario(String tipo, int salario, String nombreU, String contraseña, String fecha){
        try{
            FileWriter usuarios= new FileWriter(pathUsers, true);
            PrintWriter registrar=new PrintWriter(usuarios);
            registrar.println(tipo+","+salario+","+nombreU+","+contraseña+","+fecha);
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
    public void registrarAnimal(String numSerie, String nombre, String raza, String sexo,int edad, float peso, int numCrias, float cantidadCarne, float cantidadLeche){
        if(nombre.equals("Opcional")){
            nombre="NULL";
        }
        if(sexo.equals("Vaca")){
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
                registrar.println(sexo+","+numSerie+","+nombre+","+raza+","+edad+","+peso+","+numCrias+","+ cantidadCarne+","+cantidadLeche);
                registrar.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        arregloVacas();
        arregloToros();
    } 
    /*
    *Al utilizar este metodo se añade al .csv(Lotes) un usuario de tipo empleado o veterinario
    */
    public void registrarLote(int numero, int hectareas, float distanciaCasa, String razaLote, String calidadPasto, String agua){
        try{
            FileWriter lotes= new FileWriter(pathLot, true);
            PrintWriter registrar=new PrintWriter(lotes);
            registrar.println(numero+","+hectareas+","+distanciaCasa+","+ razaLote+","+calidadPasto+","+agua);
            registrar.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        arregloLotes();
    } 
    /*
    *Modifica los usuarios del mismo tipo que tengan
    *el nombre enviado, los datos son actualizados en
    *el archivo .csv con los nuevos
    */

    public void modificarUsuario(String tipo, int nuevoSalario, String nombreU, String nuevaContraseña, String nuevaFecha){
        try{
            Path path=FileSystems.getDefault().getPath("C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\dataBase\\"+correoElectronico+"Usuarios.csv");
            ArrayList<String> contenidoArchivo = new ArrayList<>(Files.readAllLines(path));
            for(int i=0; i<contenidoArchivo.size();i++){
                String[] valores = contenidoArchivo.get(i).split(",");
                if(valores[0].equals(tipo) && valores[2].equals(nombreU)){
                    contenidoArchivo.set(i, tipo+","+nuevoSalario+","+nombreU+","+nuevaContraseña+","+nuevaFecha);
                    break;
                }
            }
            Files.write(path, contenidoArchivo);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        arregloEmpleados();
        arregloVeterinarios();
    }
    
    /*
    *Modifica los animales del mismo sexo que tengan
    *el numero de registro enviado, los datos son actualizados en
    *el archivo .csv con los nuevos
    */
    public void modificarAnimal(String numSerie, String nombre, String raza, String sexo,int edad, float peso, int numCrias, float cantidadCarne, float cantidadLeche){
        if(nombre.equals("Opcional")){
            nombre="NULL";
        }
        try{
            Path path=FileSystems.getDefault().getPath("C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\dataBase\\"+ correoElectronico+"Animales.csv");
            ArrayList<String> contenidoArchivo = new ArrayList<>(Files.readAllLines(path));
            for(int i=0; i<contenidoArchivo.size();i++){
                String[] valores = contenidoArchivo.get(i).split(",");
                if(valores[0].equals(sexo) && valores[1].equals(numSerie)){
                    contenidoArchivo.set(i, sexo+","+numSerie+","+nombre+","+raza+","+edad+","+peso+","+numCrias+","+cantidadCarne+","+cantidadLeche);
                    break;
                }
            }
            Files.write(path, contenidoArchivo);//Reescribe todo el archivo
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups---! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        arregloVacas();
        arregloToros();
    }
    
    /*
    *Modifica los lotes que tengan
    *el numero de lote enviado, los datos son actualizados en
    *el archivo .csv con los nuevos
    */

    public void modificarLote(int numero, int nuevaHectareas, float nuevaDistanciaCasa, String nuevaRazaLote, String nuevaCalidadPasto, String nuevaAgua){
        try{
            Path path=FileSystems.getDefault().getPath("C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\dataBase\\"+ correoElectronico+"Lotes.csv");
            ArrayList<String> contenidoArchivo = new ArrayList<>(Files.readAllLines(path));
            for(int i=0; i<contenidoArchivo.size();i++){
                String[] valores = contenidoArchivo.get(i).split(",");
                if(valores[0].equals(numero+"")){
                    contenidoArchivo.set(i, numero+","+nuevaHectareas+","+nuevaDistanciaCasa+","+nuevaRazaLote+","+nuevaCalidadPasto+","+nuevaAgua);
                    break;
                }
            }
            Files.write(path, contenidoArchivo);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        arregloLotes();
    }
    
    
    /*
    *Elimina del archivo .csv el usuario de tipo 
    *que tenga el mismo nombre de usuario
    */
    public void eliminarUsuario(String tipo, String nombreU){
        try{
            Path path=FileSystems.getDefault().getPath("C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\dataBase\\"+ correoElectronico+"Usuarios.csv");
            ArrayList<String> contenidoArchivo = new ArrayList<>(Files.readAllLines(path));
            for(int i=0; i<contenidoArchivo.size();i++){
                String[] valores = contenidoArchivo.get(i).split(",");
                if(valores[0].equals(tipo) && valores[2].equals(nombreU)){
                    contenidoArchivo.remove(i);
                    break;
                }
            }
            Files.write(path, contenidoArchivo);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        arregloEmpleados();
        arregloVeterinarios();
    }
    
    
     /*
    *Elimina del archivo .csv el animal de sexo
    *que tenga el mismo numero de serie
    */
    public void eliminarAnimal(String sexo, String numeroReg){
        try{
            Path path=FileSystems.getDefault().getPath("C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\dataBase\\"+ correoElectronico+"Animales.csv");
            ArrayList<String> contenidoArchivo = new ArrayList<>(Files.readAllLines(path));
            for(int i=0; i<contenidoArchivo.size();i++){
                String[] valores = contenidoArchivo.get(i).split(",");
                if(valores[0].equals(sexo) && valores[1].equals(numeroReg)){
                    //System.out.println(sexo+"/"+valores[0]+"*"+numeroReg+"/"+);
                    contenidoArchivo.remove(i);
                    break;
                }
            }
            Files.write(path, contenidoArchivo);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        arregloVacas();
        arregloToros();
    }
    
    /*
    *Elimina del archivo .csv el lote
    *que tenga el mismo numero
    */
    public void eliminarLote(int numero){
        try{
            Path path=FileSystems.getDefault().getPath("C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\dataBase\\"+ correoElectronico+"Lotes.csv");
            ArrayList<String> contenidoArchivo = new ArrayList<>(Files.readAllLines(path));
            for(int i=0; i<contenidoArchivo.size();i++){
                String[] valores = contenidoArchivo.get(i).split(",");
                if(valores[0].equals(numero+"")){
                    contenidoArchivo.remove(i);
                    break;
                }
            }
            Files.write(path, contenidoArchivo);
            }catch(IOException ex){
                JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        arregloLotes();
    }
    
    
    private void arregloEmpleados(){
        String linea;
        empleados.clear();
        try{
            BufferedReader br =new BufferedReader(new FileReader(pathUsers));
            while((linea=br.readLine())!= null){//cada linea del archivo csv
                String[] valores = linea.split(",");//arreglo de las columnas de cada linea
                if (valores[0].equals("Empleado")){
                    int sueldo=Integer.parseInt(valores[1]);
                    Empleado emp=new Empleado(sueldo,valores[2],valores[3],valores[4]);
                    empleados.add(emp);
                    }
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        ///PRUEBA OBJETOS
        for(int i=0; i<empleados.size();i++){
            System.out.println(empleados.get(i).darNombre());
            System.out.println("Tamaño empleados: "+empleados.size());
        }  
    }
    /*
    *Añade todo los elementos de tipo veterinario que encuentre 
    *en el .csv al arreglo de empleados 
    */
    private void arregloVeterinarios(){
        String linea;
        veterinarios.clear();
        try{
            BufferedReader br =new BufferedReader(new FileReader(pathUsers));
            while((linea=br.readLine())!= null){//cada linea del archivo csv
                String[] valores = linea.split(",");//arreglo de las columnas de cada linea
                if (valores[0].equals("Veterinario")){
                    int sueldo=Integer.parseInt(valores[1]);
                    Veterinario vet=new Veterinario(sueldo,valores[2],valores[3], valores[4]);
                    veterinarios.add(vet);
                    System.out.println("Tamaño veterinarios: "+veterinarios.size());
                    }
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //PRUEBA OBJETOS
        for(int i=0; i<veterinarios.size();i++){
            System.out.println(veterinarios.get(i).darNombre());
        }
    }
    /*
    *Añade todo los elementos de tipo vaca que encuentre 
    *en el .csv al arreglo de vacas
    */
    private void arregloVacas(){
        //|sexo|numSerie|nombre|raza|edad|peso|numCrias|cantidadCarne|cantidadLeche|
        String linea;
        vacas.clear();
        try{
            BufferedReader br =new BufferedReader(new FileReader(pathAnimals));
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
                JOptionPane.showMessageDialog(null, "UpsarregloVacas! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //PRUEBA OBJETOS
        for(int i=0; i<vacas.size();i++){
            System.out.println(vacas.get(i).darNumeroSerie());
            System.out.println("Tamaño vacas: "+vacas.size());
        }
    }
     /*
    *Añade todo los elementos de tipo toro que encuentre 
    *en el .csv al arreglo de toros
    */
    private void arregloToros(){
        //|sexo|numSerie|nombre|raza|edad|peso|numCrias|cantidadCarne|
        String linea;
        toros.clear();
        try{
            BufferedReader br =new BufferedReader(new FileReader(pathAnimals));
            while((linea=br.readLine())!= null){//cada linea del archivo csv
                String[] valores = linea.split(",");//arreglo de las columnas de cada linea
                if (valores[0].equals("Toro")){//si el sexo es toro
                    Toro muu=new Toro(valores[1], valores[2],valores[3],Integer.parseInt(valores[4]),
                    Float.parseFloat(valores[5]), Integer.parseInt(valores[6]), Float.parseFloat(valores[7]));
                    toros.add(muu);
                    }
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "UpsarregloToros! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
         //PRUEBA OBJETOS
        for(int i=0; i<toros.size();i++){
            System.out.println(toros.get(i).darNumeroSerie());
            System.out.println("Tamaños toros: "+toros.size());
        }
    }
    
    /*
    *Añade todo los lotesque encuentre 
    *en el .csv al arreglo de lotes
    */
    private void arregloLotes(){
        String linea;
        lotes.clear();
        try{
            BufferedReader br =new BufferedReader(new FileReader(pathLot));
            while((linea=br.readLine())!= null){//cada linea del archivo csv
                String[] valores = linea.split(",");//arreglo de las columnas de cada linea
                Lote lot=new Lote(Integer.parseInt(valores[0]), Integer.parseInt(valores[1]), Float.parseFloat(valores[2]), valores[3], valores[4], valores[5]);
                lotes.add(lot);

                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        ///PRUEBA OBJETOS
        for(int i=0; i<lotes.size();i++){
            System.out.println(lotes.get(i).darNumero());
            System.out.println("Tamaño lotes: "+lotes.size());
        }  
    }
    
    
    /*
    *Comprueba si existe un empleado ya registrado
    */
    public boolean comprobarSiEmpleadoExiste(String nombreU){
        Empleado iterar;
       // if(empleados.size()>0){
            for(int i=0; i<empleados.size();i++){
                iterar=empleados.get(i);
                if(iterar.darNombre().equals(nombreU)){
                    return true;
                }
            }
        //}
        return false;
    }
    /*
    *Comprueba si existe un veterinario ya registrado
    */
    public boolean comprobarSiVeterinarioExiste(String nombreU){
        Veterinario iterar;
        if(veterinarios.size()>0){
            for(int i=0; i<veterinarios.size();i++){
                iterar=veterinarios.get(i);
                if(iterar.darNombre().equals(nombreU)){
                    return true;
                }
            }
        }
        return false;
    }
    
    /*
    *Comprueba si existe una vaca ya registrado
    */
    public boolean comprobarSiVacaExiste(String numeroReg){
        Vaca iterar;
        if(vacas.size()>0){
            for(int i=0; i<vacas.size();i++){
                iterar=vacas.get(i);
                if(iterar.darNumeroSerie().equals(numeroReg)){
                    return true;
                }
            }
        }
        return false;
    }
    /*
    *Comprueba si existe un toro ya registrado
    */
    public boolean comprobarSiToroExiste(String numeroReg){
        Toro iterar;
        System.out.println(numeroReg);
        //if(toros.size()>0){
            for(int i=0; i<toros.size();i++){
                iterar=toros.get(i);
                if(iterar.darNumeroSerie().equals(numeroReg)){
                    return true;
                }
            }
        //}
        return false;
    }
    
    /*
    *Comprueba si existe un lote ya registrado
    */
    public boolean comprobarSiLoteExiste(int numero){
        Lote iterar;
            for(int i=0; i<lotes.size();i++){
                iterar=lotes.get(i);
                if(iterar.darNumero()==numero){
                    return true;
                }
            }
        return false;
    }
     /*
    *Metodo para un arreglo con los numeros
    *de lotes registrados
    */
    public ArrayList<String> getLotesArray() {
        ArrayList<String> valores=new ArrayList<String>();
        for(int i=0; i<lotes.size();i++){
            valores.add(((lotes.get(i)).darNumero()+" ")+lotes.get(i).darRazaLote());
        }
        
        return valores;
    }
    
    public String getImage(String Lote){
        String[] reg=Lote.split(" ");
        int numero=Integer.parseInt(reg[0]);
        arregloLotes();
        Lote iterador;
        for(int i=0; i<lotes.size();i++){
            iterador=lotes.get(i);
            if(iterador.darNumero()==numero){
                return iterador.darRazaLote();
            }
        }
        return "";
    }
    
    //Method to get the Properties of one Set 
    public ArrayList<String> getProperties(String LoteSelected){
        String[] reg=LoteSelected.split(" ");
        int numero=Integer.parseInt(reg[0]); 
        ArrayList<String>properties= new ArrayList<String>();
        Lote iterador;
        for(int i=0; i<lotes.size();i++){
             iterador=lotes.get(i);
            if(iterador.darNumero()==numero){
                properties.add(iterador.darNumero()+"");
                properties.add(iterador.darHectareas()+"");
                properties.add(iterador.darDistanciaCasa()+"");
                properties.add(iterador.darCalidad());
                properties.add(iterador.darAgua()+"");
                properties.add(iterador.darRazaLote()+"");
                break;
            }
        }
        return properties;
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
    
    /*
    *Retornar el arreglo de lotes
    */
    public ArrayList<Lote> darArregloLote(){
        return lotes;
    }
    
    public int getQuantityAnimals(String Selected) {
        if(Selected.equals("Cantidad Lotes")){
            return lotes.size();
        }else if(Selected.equals("Animales")){
            return vacas.size() + toros.size();
        }else if(Selected.equals("Vacas")){
            return vacas.size();
        }else if(Selected.equals("Toros")){
            return toros.size();
        }else if(Selected.equals("Terneros")){
            int total=0;
            for(int i=0; i<vacas.size();i++){
                total+=vacas.get(i).darNumeroCrias();
            }
            for(int i=0; i<toros.size();i++){
                total+=toros.get(i).darNumeroCrias();
            }
            return total;
        }else if(Selected.equals("Empleados")){
            return empleados.size()+veterinarios.size();
        }
        return 0;
    }
    
   
    public String darCorreo(){
        return correoElectronico;
    }
    public String darNombreUsuario(){
        return nombreUsuario;
    }
    public String darContraseña(){
        return contraseña;
    }
}