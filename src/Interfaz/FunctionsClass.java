/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Mundo.Empresa;

/**
 *
 * @author John Silva
 */

public class FunctionsClass {
    int value ;
    boolean x ;

    // Constructor with value
    public FunctionsClass(int value) {
        this.value = value;
        System.out.println("valor" + value);
    }
    
    
    //Method to out of the program
    public void OutProgram(){
        System.exit(0);
    }   
    
    // Method go to the Search Window
    public void SearchProgramm(Empresa empresa){
        SearchWindow bus = new SearchWindow(this.value, empresa);
        bus.setVisible(true);
    }
    
    // Method return to the window 
    public void BackProgramm(int value, Empresa empresa){
        System.out.println("Valor es :" + value  );
        switch(value){
           case 1 : 
               Ventana ventanaPrincipalAdmin = new Ventana(empresa);
               ventanaPrincipalAdmin.setVisible(true);
               
               break ;
           case 2 :
               //workerWindow v3 = new workerWindow();
               //v3.setVisible(true);
               
               break;
       }    
    }
    
}
