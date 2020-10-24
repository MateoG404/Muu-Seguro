package admin;
/**
 *
 * @author MateoG404
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList ;

public class SearchWindow extends javax.swing.JFrame {
    //Data Members 
    int value ;
    FunctionsClass ven = new FunctionsClass();
    Empresa emp = new Empresa() ; 
    ArrayList<String> ListAnimals;
    ArrayList<String> ListEmployees;
    ArrayList<String> ListSets ;
    
    
    
    public SearchWindow(int value) {
        initComponents();
        texto.setLineWrap(true);
        texto.setWrapStyleWord(true);
        this.value = value ;

    }

    private SearchWindow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Animales");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Empleados");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lotes");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, -1, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
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
        texto.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 650, 340));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/FondoDos.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>                        

    private void RegresarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        try {
            ven.BackProgramm(value);
            dispose();
        } catch (IOException ex) {
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
        try {
            ListAnimals = emp.getAnimals();
            for(int i = 0 ; i<ListAnimals.size();i++){
                if (cont == 16 ){
                    cont = 0 ;
                    message += "\n" ;
                }
                message += ListAnimals.get(i);
                cont += 1 ;
            }
            message += "\n";
            } catch (IOException ex) {
                Logger.getLogger(SearchWindow.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error no hay animales o se elimino el archivo") ;
            }}         
        
        if(chkEmpleados.isSelected()){ 
            try {
                ListEmployees = emp.getEmployees();
                for (int i = 0 ;i<ListEmployees.size();i++){
                    if(cont == 10){
                        cont = 0 ;
                        message += "\n" ;
                    }
                    message += ListEmployees.get(i);
                    cont += 1 ;
                }} catch (IOException ex) {
                Logger.getLogger(SearchWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        message += "\n";
        if(chkLotes.isSelected())
            try {
                ListSets = emp.getSets();
                for(int i = 0; i< ListSets.size();i++){
                    if(cont == 12){
                        cont = 0 ; 
                        message += "\n" ;
                    }
                    message += ListSets.get(i);
                    cont += 1 ;
            }
        } catch (IOException ex) {
            Logger.getLogger(SearchWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            message += "\n" ;
            
        texto.setText(message);
        
        
    }                                              

    private void chkEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void chkAnimalesActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchWindow().setVisible(true);
            }
        });
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
