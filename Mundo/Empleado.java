
package Mundo;

/**
 *
 * @author John Silva
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
    public Empleado(int sueldo, String nombreU, String cont){
        salario=sueldo;
        nombreUsuario=nombreU;
        contraseña=cont;
    }
}
