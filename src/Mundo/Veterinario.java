
package Mundo;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author John Silva
 */
public class Veterinario extends Usuario{
     //PARAMETROS
    
    /*
    *Salario empleado
    */
    //private int salario;
    /*
    *Nombre de usuario
    */
    //private String nombreUsuario;
    /*
    *contraseña de veterinario
    */
    //private String contraseña;
    /*
    *Fecha de inicio del veterinario con la empresa
    */
    //private Fecha fechaInicio;
    //CONSTRUCTOR
    /*
    *Crea un veterinario
    */
    public Veterinario(int sueldo, String nombreU, String cont, String fecha){
       super(sueldo, nombreU,cont,  fecha);
      //registrarEnfermedad("1","Vaca","Enfermedad","jhsilvaz@unal.edu.co","Medi");
    }
    
    public void registrarEnfermedad(String numeroSerieAnimal,String tipoSexo,String nombreEnfermedad, String correoElectronico, String nombreMedicamento){
        try{
            Path path=FileSystems.getDefault().getPath("..\\Muu-Seguro\\src\\dataBase\\"+ correoElectronico+"Animales.csv");
            ArrayList<String> contenidoArchivo = new ArrayList<>(Files.readAllLines(path));
            for(int i=0; i<contenidoArchivo.size();i++){
                String[] valores = contenidoArchivo.get(i).split(",");
                if(valores[0].equals(tipoSexo) && valores[1].equals(numeroSerieAnimal)){
                    if(valores[9].length()>0){
                        ArrayList<String>enfermedades= new ArrayList(Arrays.asList(valores[9].split(";")));
                        enfermedades.add(nombreEnfermedad+":"+nombreMedicamento+";");
                        valores[9]="";
                        for(int j=0; j<enfermedades.size(); j++){
                            valores[9]+=enfermedades.get(i)+";";
                        }
                    }
                    contenidoArchivo.set(i,valores[0]+","+valores[1]+","+valores[2]+","+valores[3]+","+valores[4]+","+valores[5]+","+valores[6]+","+valores[7]+","+valores[8]+","+valores[9]);
                    break;
                }
            }
            Files.write(path, contenidoArchivo);//Reescribe todo el archivo
        }catch(IOException ex){
                JOptionPane.showMessageDialog(null, "Ups---! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}