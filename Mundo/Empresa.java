/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


/**
 *
 * @author John Silva
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
    public static final String PATH=".\\src\\dataBase\\empresas.csv";
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
                if (valores[0].equals(codigo)){
                    codigoEmp=valores[0].toCharArray();
                    tipoEmp=valores[1];
                    admin=new Administrador(valores[3],valores[2], valores[4]);
                    break;
                    }
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
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
            System.out.println("Exito");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
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
    
}
