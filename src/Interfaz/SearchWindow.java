
package Interfaz;

import Mundo.Empresa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList ;

public class SearchWindow extends javax.swing.JFrame {
    //Data Members 
    int value ;
    Empresa empresa; 
    FunctionsClass ven = new FunctionsClass(value);
    
    public SearchWindow(int value, Empresa emp) {
        empresa=emp;
        initComponents();
        texto.setLineWrap(true);
        texto.setWrapStyleWord(true);
        this.value = value ;

    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {


        this.setLocation(150, 50);
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        chkAnimales = new javax.swing.JCheckBox();
        chkLotes = new javax.swing.JCheckBox();
        chkEmpleados = new javax.swing.JCheckBox();
        BusquedaButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RegresarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Busqueda");
        setBackground(new java.awt.Color(172, 225, 141));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chkAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnimalesActionPerformed(evt);
            }
        });
        jPanel2.add(chkAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));
        jPanel2.add(chkLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, -1, -1));

        chkEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEmpleadosActionPerformed(evt);
            }
        });
        jPanel2.add(chkEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        BusquedaButton.setText("Buscar");
        BusquedaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaButtonActionPerformed(evt);
            }
        });
        jPanel2.add(BusquedaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 99, -1));

        jButton2.setText("Borrar Selección ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Animales");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, 20));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Empleados");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, 20));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lotes");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, -1, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Qué desea buscar?");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 191, 48));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 110));

        RegresarButton.setBackground(new java.awt.Color(255, 255, 255));
        RegresarButton.setText("Regresar");
        RegresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RegresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        texto.setColumns(20);
        texto.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        texto.setRows(5);
        texto.setEditable(false);
        jScrollPane1.setViewportView(texto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 650, 340));

        fondo.setIcon(new javax.swing.ImageIcon(".\\src\\Interfaz\\DataImage\\fondoMuu.png")); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));
        this.setResizable(false);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));
        
        pack();
        
    }// </editor-fold>                        

    private void RegresarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        try {
            ven.BackProgramm(value, empresa);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(SearchWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                              

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        if (chkAnimales.isSelected())
        chkAnimales.setSelected(false);
        if(chkEmpleados.isSelected())
        chkEmpleados.setSelected(false);
        if(chkLotes.isSelected())
        chkLotes.setSelected(false);

        texto.setText(" ");
    }                                        

    private void BusquedaButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               

        String message = "" ;
        int cont = 0 ;
        if(chkAnimales.isSelected()){
            message+="ANIMALES\nSexo | Numero | Nombre | Raza | Edad | Peso(kg) | Crías | kgs.Carne | Lts.Leche|\n";
            for (int i=0; i<empresa.darAdmin().darArregloToros().size();i++){
                message+="Toro |";
                message+=empresa.darAdmin().darArregloToros().get(i).darNumeroSerie()+" | ";
                message+=empresa.darAdmin().darArregloToros().get(i).darNombre()+" | ";
                message+=empresa.darAdmin().darArregloToros().get(i).darRaza()+" | ";
                message+=empresa.darAdmin().darArregloToros().get(i).darEdad()+" | ";
                message+=empresa.darAdmin().darArregloToros().get(i).darpeso()+" | ";
                message+=empresa.darAdmin().darArregloToros().get(i).darNumeroCrias()+" | ";
                message+=empresa.darAdmin().darArregloToros().get(i).darCantidadCarne()+" | ";
                message+="\n";
            }
             for (int i=0; i<empresa.darAdmin().darArregloVacas().size();i++){
                message+="Vaca |";
                message+=empresa.darAdmin().darArregloVacas().get(i).darNumeroSerie()+" | ";
                message+=empresa.darAdmin().darArregloVacas().get(i).darNombre()+" | "; 
                message+=empresa.darAdmin().darArregloVacas().get(i).darRaza()+" | ";
                message+=empresa.darAdmin().darArregloVacas().get(i).darEdad()+" | ";
                message+=empresa.darAdmin().darArregloVacas().get(i).darpeso()+" | ";
                message+=empresa.darAdmin().darArregloVacas().get(i).darNumeroCrias()+" | ";
                message+=empresa.darAdmin().darArregloVacas().get(i).darCantidadCarne()+" | ";
                message+=empresa.darAdmin().darArregloVacas().get(i).darCantidadLeche()+" | ";
                message+="\n";
            }
            message+="\n"; 
        }         
        if(chkEmpleados.isSelected()){ 
            message+="USUARIOS\n Tipo | Salario | Nombre | Inicio laboral |\n";
           for(int i=0;i<empresa.darAdmin().darArregloEmpleados().size();i++){
               message+="Empleado |";
               message+=empresa.darAdmin().darArregloEmpleados().get(i).darSalario()+" | ";
               message+=empresa.darAdmin().darArregloEmpleados().get(i).darNombre()+" | ";
               message+=empresa.darAdmin().darArregloEmpleados().get(i).darFechaInicioLaboral()+" | ";
               message+="\n";
           }
           for(int i=0;i<empresa.darAdmin().darArregloVeterinarios().size();i++){
               message+="Veterinario |";
               message+=empresa.darAdmin().darArregloVeterinarios().get(i).darSalario()+" | ";
               message+=empresa.darAdmin().darArregloVeterinarios().get(i).darNombre()+" | ";
               message+=empresa.darAdmin().darArregloVeterinarios().get(i).darFechaInicioLaboral()+" | ";
               message+="\n";
           }
           message+="\n";
        }
        if(chkLotes.isSelected()){
            message+="LOTES\nNúmero | Raza | Hectáreas | Distancia casa(KM) | Calidad | Punto agua |\n";
            for(int i=0;i<empresa.darAdmin().darArregloLote().size();i++){
                message+=empresa.darAdmin().darArregloLote().get(i).darNumero()+" | ";
                message+=empresa.darAdmin().darArregloLote().get(i).darRazaLote()+" | ";
                message+=empresa.darAdmin().darArregloLote().get(i).darHectareas()+" | ";
                message+=empresa.darAdmin().darArregloLote().get(i).darDistanciaCasa()+" | ";
                message+=empresa.darAdmin().darArregloLote().get(i).darCalidad()+" | ";
                message+=empresa.darAdmin().darArregloLote().get(i).darAgua()+" | ";
                message+="\n";
            }
            message+="\n";
        }  
        texto.setText(message);
        
        
    }                                              

    private void chkEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void chkAnimalesActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

 

    // Variables declaration - do not modify                     
    private javax.swing.JButton BusquedaButton;
    private javax.swing.JButton RegresarButton;
    private javax.swing.JCheckBox chkAnimales;
    private javax.swing.JCheckBox chkEmpleados;
    private javax.swing.JCheckBox chkLotes;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea texto;
    // End of variables declaration                   
}
