package Mundo;

/**
 *
 * @author John Silva
 */
public class Usuario {
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
    *Crea un usuario
    */
    public Usuario(int sueldo, String nombreU, String cont, String fecha){
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
        return contraseña;
    }
    
    public String darFechaInicioLaboral(){
        return fechaInicio.toString();
    }
}
