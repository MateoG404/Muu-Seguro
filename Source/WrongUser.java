package clavenoencontrada;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ClaveNoEncontrada {
    public static void main(String[] args) {
        String path = "C:\\Users\\acer\\Desktop\\Usuarios.csv";
        String line;
        Scanner lindura = new Scanner(System.in);
        String upa= lindura.nextLine();
        String upisima= lindura.nextLine();
        int contador=0;
        int intentos=0;
        int juntos4ever=0;
        try {
            BufferedReader br =new BufferedReader(new FileReader(path));         
            while((line= br.readLine())!= null){
                String[] values = line.split(",");
                if(upa.equals(values[1])){contador++;}
                if(upisima.equals(values[2])){intentos++;}
                if(upa.equals(values[1]) && upisima.equals(values[2])){juntos4ever++;}
            }
            System.out.print(contador);
            System.out.print(intentos);
            System.out.print(juntos4ever);
           /*if (1 == juntos4ever )
                {
                    System.out.println("usuario y clave encontrados");System.exit(0);
                }
            else if (contador == 1 && intentos == 0)
                {
                    JOptionPane.showMessageDialog(null, "usuario encontrado clave incorrecta");System.exit(0);
                }
            else if (contador == 0 && intentos == 1)
                {
                    JOptionPane.showMessageDialog(null, "usuario no encontrado");System.exit(0);
                }          
            else
                {
                    JOptionPane.showMessageDialog(null, "usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);System.exit(0);
                }*/}
        catch (FileNotFoundException e) {
            }
        catch (IOException e) {
            }   
    }    
}
