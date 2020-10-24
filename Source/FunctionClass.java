package admin;

import java.io.IOException;

/*
    Esta función permite acceder a métodos en común entre las diversas ventanas
    Cada ventana posee un número para identificar en dado caso a que ventana regresar o cambiar
    Admin        --->  1 
    Trabajador   --->  2
    Veterinario  --->  3
*/

public class FunctionsClass {
    int value ;
    boolean x ;
    
    // Constructor with value
    public FunctionsClass(int value) {
        this.value = value;
        System.out.println("valor" + value);
    }
    
    public FunctionsClass(){
        System.out.println("El valor es : "+ value);
    }
    
    //Method to out of the program
    public void OutProgram(){
        System.exit(0);
    }   
    
    // Method go to the Search Window
    public void SearchProgramm(){
        SearchWindow bus = new SearchWindow(this.value);
        bus.setVisible(true);
    }
    
    // Method return to the window 
    public void BackProgramm(int value) throws IOException{
        System.out.println("Valor es :" + value  );
        switch(value){
           case 1 : 
               Ventana v2 = new Ventana();
               v2.setVisible(true);
               
               break ;
           case 2 :
               workerWindow v3 = new workerWindow();
               v3.setVisible(true);
               
               break;
       }    
    }
    
}
