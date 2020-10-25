
package Mundo;

/**
 *
 * @author John Silva
 */
public class Veterinario {
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
    *contraseña de veterinario
    */
    private String contraseña;
    /*
    *Fecha de inicio del veterinario con la empresa
    */
    private Fecha fechaInicio;
    //CONSTRUCTOR
    /*
    *Crea un veterinario
    */
    public Veterinario(int sueldo, String nombreU, String cont, String fecha){
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
