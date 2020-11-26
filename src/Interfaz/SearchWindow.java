/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author John Silva
 */
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
        this.value = value ;

    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {


        this.setLocation(150, 50);
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanelTablas = new javax.swing.JPanel();
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
        jScrollPaneAnimales = new javax.swing.JScrollPane();
        jScrollPaneUsuarios = new javax.swing.JScrollPane();
        jScrollPaneLotes = new javax.swing.JScrollPane();
        fondo = new javax.swing.JLabel();
        jTableAnimales=new javax.swing.JTable();
        jTableUsuarios=new javax.swing.JTable();
        jTableLotes=new javax.swing.JTable();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Busqueda");
        setBackground(new java.awt.Color(172, 225, 141));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        jPanelTablas.setBackground(new java.awt.Color(0, 0, 0));
        jPanelTablas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelTablas.setBackground(new java.awt.Color(255,255,255));
        
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
        BusquedaButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        BusquedaButton.setForeground(new java.awt.Color(97, 97, 97));
        BusquedaButton.setBorder(null);
        BusquedaButton.setBorderPainted(false);
        BusquedaButton.setFocusPainted(false);
        BusquedaButton.setMargin(new java.awt.Insets(100, 2, 100, 14));
        BusquedaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaButtonActionPerformed(evt);
            }
        });
        jPanel2.add(BusquedaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 90, 32));

        jButton2.setText("Borrar Selección ");
        jButton2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(97, 97, 97));
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setMargin(new java.awt.Insets(100, 2, 100, 14));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, 32));

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
        RegresarButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        RegresarButton.setForeground(new java.awt.Color(97, 97, 97));
        RegresarButton.setBorder(null);
        RegresarButton.setBorderPainted(false);
        RegresarButton.setFocusPainted(false);
        RegresarButton.setMargin(new java.awt.Insets(100, 2, 100, 14));
        RegresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RegresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 100, 32));


        jScrollPaneAnimales.setBorder(javax.swing.BorderFactory.createTitledBorder ("ANIMALES"));
        jPanelTablas.add(jScrollPaneAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 133));
            
        jScrollPaneUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder ("USUARIOS"));
        jPanelTablas.add(jScrollPaneUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 133, 650, 133));
        
        jScrollPaneLotes.setBorder(javax.swing.BorderFactory.createTitledBorder ("LOTES"));
        jPanelTablas.add(jScrollPaneLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 266, 650, 133));
            
        
        getContentPane().add(jPanelTablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 170, 650, 400));
        
        fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\Interfaz\\DataImage\\fondoMuu.png")); // NOI18N
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
    }                                        

    private void BusquedaButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
        if(chkAnimales.isSelected()){
            ArrayList<String[]>filasTemp=new ArrayList<>();
            String[] fila;
            for(int i=0; i<empresa.darAdmin().darArregloToros().size();i++){
                fila=new String[9];
                fila[0]=("Toro");
                fila[1]=(empresa.darAdmin().darArregloToros().get(i).darNumeroSerie());
                fila[2]=(empresa.darAdmin().darArregloToros().get(i).darNombre());
                fila[3]=(empresa.darAdmin().darArregloToros().get(i).darRaza());
                fila[4]=(empresa.darAdmin().darArregloToros().get(i).darEdad()+"");
                fila[5]=(empresa.darAdmin().darArregloToros().get(i).darpeso()+"");                
                fila[6]=(empresa.darAdmin().darArregloToros().get(i).darNumeroCrias()+"");
                fila[7]=(empresa.darAdmin().darArregloToros().get(i).darCantidadCarne()+"");
                fila[8]=("NULL");
                filasTemp.add(fila);
            }
            for(int i=0; i<empresa.darAdmin().darArregloVacas().size();i++){
                fila=new String[9];
                fila[0]=("Vaca");
                fila[1]=(empresa.darAdmin().darArregloVacas().get(i).darNumeroSerie());
                fila[2]=(empresa.darAdmin().darArregloVacas().get(i).darNombre());
                fila[3]=(empresa.darAdmin().darArregloVacas().get(i).darRaza());
                fila[4]=(empresa.darAdmin().darArregloVacas().get(i).darEdad()+"");
                fila[5]=(empresa.darAdmin().darArregloVacas().get(i).darpeso()+"");                
                fila[6]=(empresa.darAdmin().darArregloVacas().get(i).darNumeroCrias()+"");
                fila[7]=(empresa.darAdmin().darArregloVacas().get(i).darCantidadCarne()+"");
                fila[8]=(empresa.darAdmin().darArregloVacas().get(i).darCantidadLeche()+"");
                filasTemp.add(fila);
            }
            
            String[][] filas=new String[filasTemp.size()][9];
            System.err.println("Tamaño:"+filasTemp.size());
            for(int i=0; i<filasTemp.size();i++){
                for(int j=0; j<filasTemp.get(0).length;j++){
                    filas[i][j]=filasTemp.get(i)[j];
                }
            }
            jTableAnimales.setModel(new javax.swing.table.DefaultTableModel(
            filas,
            new String [] {
                "Sexo", "Número", "Nombre", "Raza", "Edad", "Peso(kg)", "Crías", "kgs.Carne", "Lts.Leche"
                }
            ));
            jScrollPaneAnimales.setViewportView(jTableAnimales);
        }         
        if(chkEmpleados.isSelected()){ 
            ArrayList<String[]>filasTemp=new ArrayList<>();
            String[] fila;
            for(int i=0; i<empresa.darAdmin().darArregloEmpleados().size();i++){
                fila=new String[4];
                fila[0]="Empleado";
                fila[1]=empresa.darAdmin().darArregloEmpleados().get(i).darNombre();
                fila[2]=empresa.darAdmin().darArregloEmpleados().get(i).darSalario()+"";
                fila[3]=empresa.darAdmin().darArregloEmpleados().get(i).darFechaInicioLaboral();
                filasTemp.add(fila);
            }
            for(int i=0; i<empresa.darAdmin().darArregloVeterinarios().size();i++){
                fila=new String[4];
                fila[0]="Veterinario";
                fila[1]=empresa.darAdmin().darArregloVeterinarios().get(i).darNombre();
                fila[2]=empresa.darAdmin().darArregloVeterinarios().get(i).darSalario()+"";
                fila[3]=empresa.darAdmin().darArregloVeterinarios().get(i).darFechaInicioLaboral();
                filasTemp.add(fila);
            }
            
            String[][] filasU=new String[filasTemp.size()][4];
            for(int i=0; i<filasTemp.size();i++){
                for(int j=0; j<filasTemp.get(0).length;j++){
                    filasU[i][j]=filasTemp.get(i)[j];
                }
            }
            jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            filasU,
            new String [] {
                "Tipo", "Nombre", "Salario", "Fecha de inicio laboral"
                }
            ));
            jScrollPaneUsuarios.setViewportView(jTableUsuarios);
        }
        if(chkLotes.isSelected()){
            ArrayList<String[]>filasTemp=new ArrayList<>();
            String[] fila;
            for(int i=0; i<empresa.darAdmin().darArregloLote().size();i++){
                fila=new String[4];
                fila[0]=empresa.darAdmin().darArregloLote().get(i).darNumero()+"";
                fila[1]=empresa.darAdmin().darArregloLote().get(i).darRazaLote();  
                fila[2]=empresa.darAdmin().darArregloLote().get(i).darCalidad()+"";
                fila[3]=empresa.darAdmin().darArregloLote().get(i).darAgua();
                filasTemp.add(fila);
            }
            
            String[][] filasL=new String[filasTemp.size()][4];
            for(int i=0; i<filasTemp.size();i++){
                for(int j=0; j<filasTemp.get(0).length;j++){
                    filasL[i][j]=filasTemp.get(i)[j];
                }
            }
            jTableLotes.setModel(new javax.swing.table.DefaultTableModel(
            filasL,
            new String [] {
                "Número", "Raza","Calidad","Punto agua"
                }
            ));
            jScrollPaneLotes.setViewportView(jTableLotes);
        }  
        
        
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
    private javax.swing.JPanel jPanelTablas;
    private javax.swing.JScrollPane jScrollPaneAnimales;
    private javax.swing.JScrollPane jScrollPaneUsuarios;
    private javax.swing.JScrollPane jScrollPaneLotes;
    private javax.swing.JTable jTableAnimales;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTable jTableLotes;
    

    // End of variables declaration                   
}
