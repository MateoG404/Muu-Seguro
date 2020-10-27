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
/**
 *
 * @author  MateoG404
 */
public class Empleado {
    //PARAMETROS
    
    /*
    *Salario empleado
    */
    private int salario;
    /*
    *Nombre de usuario
    */
    private String nombreUsuario;
    /*
    *contraseña de empleado
    */
    private String contraseña;
    /*
    *Fecha de inicio del trabajador con la empresa
    */
    private Fecha fechaInicio;
    //CONSTRUCTOR
    /*
    *Crea un empleado
    */
    public Empleado(int sueldo, String nombreU, String cont, String fecha){
        salario=sueldo;
        nombreUsuario=nombreU;
        contraseña=cont;
        fechaInicio=new Fecha(fecha);
    }
    public String darNombre(){
        return nombreUsuario;
    }
    
    public int darSalario(){
        return salario;
    }
    
    public String darContraseña(){
        return nombreUsuario;
    }
    
    public String darFechaInicioLaboral(){
        return fechaInicio.toString();
    }
}
