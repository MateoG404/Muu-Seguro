
package Mundo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author John Silva and MateoG404
 */
public class Empresa {
    //CONSTANTES
    /*
    *Longitud del arreglo de caracteres para 
    *el codigo
    */
    public static final int TAMAÑO_CODIGO=10;
    /*
    *
    */
    public static final String PATH="..\\Muu-Seguro\\src\\dataBase\\empresas.csv";
    //ATRIBUTOS
    /*
    *Arreglo codigo de la empresa
    */
    private char[] codigoEmp=new char[TAMAÑO_CODIGO];
    /*
    *Tipo de empresa
    */
    private String tipoEmp;
    /*
    *Administrador
    */
    private Administrador admin;

    //CONSTRUCTORES
    /*
    *Crea nueva empresa
    */
    public Empresa(String tipo, String correoAdmin, String nombreAdmin,String contraseña){
        tipoEmp=tipo;
        codigoEmp=caracteresAleatorios();
        registrarEmpresa(String.valueOf(codigoEmp), tipo,correoAdmin, nombreAdmin,contraseña);
        admin=new Administrador(nombreAdmin, correoAdmin, contraseña);
    }
    /*
    *Cargar empresa
    */
    public Empresa(String codigo){
        String linea;
        try{
            BufferedReader br =new BufferedReader(new FileReader(PATH));
            while((linea=br.readLine())!= null){//cada linea del archivo csv
                String[] valores = linea.split(",");//arreglo de las columnas de cada linea
                System.out.print(valores.length+"LEN");
                if (valores[0].equals(codigo)){
                    codigoEmp=valores[0].toCharArray();
                    tipoEmp=valores[1];
                    admin=new Administrador(valores[3],valores[2], valores[4]);
                    break;
                    }
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups79! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
                System.err.println(ex.toString());
        }
    }
    /*
    *Crea un arreglo de caracteres pseudoaleatorios para el codigo de la empresa 
    */
    private char[] caracteresAleatorios(){
        Random random=new Random();
        int n;
        char[] aleatorios=new char[TAMAÑO_CODIGO];
        for(int i=0; i<TAMAÑO_CODIGO; i++){
           n=random.nextInt(122);
           if(n<65){
               n+=65;
               if(n>122){
                   n-=8;
               }
           }
           if(n>90 && n<97){
               n+=10;
           }
           aleatorios[i]=(char)n;
        }
        return aleatorios;
    }
    
    /*
    *Registrar empresa en archivo csv
    */
    private void registrarEmpresa(String codigo, String tipo, String correo, String nombreAdmin, String contraseña){
        try{
            FileWriter empresas= new FileWriter(PATH, true);
            PrintWriter registrar=new PrintWriter(empresas);
            registrar.println(codigo+","+tipo+","+correo+","+nombreAdmin+","+contraseña);
            registrar.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void modificarEmpresaAdmin(String correoElectronico,String nCodigoEmp, String nTipoEmp,String nNombreAdmin, String nContraseña){
        try{
            Path path=FileSystems.getDefault().getPath(PATH);
            ArrayList<String> contenidoArchivo = new ArrayList<>(Files.readAllLines(path));
            for(int i=0; i<contenidoArchivo.size();i++){
                String[] valores = contenidoArchivo.get(i).split(",");
                if(valores[2].equals(correoElectronico)){
                    contenidoArchivo.set(i, nCodigoEmp+","+nTipoEmp+","+correoElectronico+","+nNombreAdmin+","+nContraseña);
                    break;
                }
            }
            Files.write(path, contenidoArchivo);
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /*
    *Retorna el veterinario que ha iniciado sesión
    */
    public  Veterinario darVeterinarioActual(String nombreU, String codigoEmp){
        String correo="";
        String linea;
        Veterinario actual = null;
        try{
            BufferedReader br =new BufferedReader(new FileReader(PATH));
            while((linea=br.readLine())!= null){//cada linea del archivo csv
                String[] valores = linea.split(",");//arreglo de las columnas de cada linea
                if(valores[0].equals(codigoEmp)){
                correo=valores[2];
                break;
                }   
            }     
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        String pathUsers="..\\Muu-Seguro\\src\\dataBase\\"+correo+"Usuarios.csv";
        /*
        *Buscar el usuario VETERINARIO
        */
        try{
            BufferedReader br =new BufferedReader(new FileReader(pathUsers));
            while((linea=br.readLine())!= null){//cada linea del archivo csv
                String[] valores = linea.split(",");//arreglo de las columnas de cada linea
                if(valores[2].equals(nombreU) && valores[0].equals("Veterinario")){
                   actual=new Veterinario(Integer.parseInt(valores[1]),valores[2],valores[3],valores[4]);
                   break;
                }   
            }
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return actual;   
    }
    /*
    *Retorna el empleado que ha iniciado sesión
    */
    public Empleado darEmpleadoActual(String nombreU, String codigoEmp){
        String correo="";
        String linea;
        Empleado actual = null;
        try{
            BufferedReader br =new BufferedReader(new FileReader(PATH));
            while((linea=br.readLine())!= null){//cada linea del archivo csv
                String[] valores = linea.split(",");//arreglo de las columnas de cada linea
                if(valores[0].equals(codigoEmp)){
                correo=valores[2];
                break;
                }   
            }     
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        String pathUsers="..\\Muu-Seguro\\src\\dataBase\\"+correo+"Usuarios.csv";
        /*
        *Buscar el usuario VETERINARIO
        */
        try{
            BufferedReader br =new BufferedReader(new FileReader(pathUsers));
            while((linea=br.readLine())!= null){//cada linea del archivo csv
                String[] valores = linea.split(",");//arreglo de las columnas de cada linea
                if(valores[2].equals(nombreU) && valores[0].equals("Empleado")){
                   actual=new Empleado(Integer.parseInt(valores[1]),valores[2],valores[3],valores[4]);
                   break;
                }   
            }
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return actual;
    }
    /*
    *Dar codigo de la empresa
    */
    public String darCodigo(){
        String valorCode=String.valueOf(codigoEmp);
        System.out.println(codigoEmp);
        return valorCode;
    }
    /*
    *Dar tipo de empresa
    */
    public String mdarTipoEmp(){
        return tipoEmp;
    }
    /*
    *Dar administrador
    */
    public Administrador darAdmin(){
        return admin;
    }
    /*
    *Metodo para un arreglo con los numeros
    *de lotes registrados
    */
    
}

