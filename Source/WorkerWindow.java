package admin;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList ;

/**
 *
 * @author MateoG404
 */
public class workerWindow extends javax.swing.JFrame {
   // Create Objects //
    
    FunctionsClass ven = new FunctionsClass(1);
    Empresa datos = new Empresa();
    
    /*
    //                                      Methods                           //
    */
    
    //Add the Set to the ComboBox 
    public void AddLotesCB() throws IOException{
        ArrayList<String> Lotes = datos.getLotesArray() ;
        for (int i = 1; i < Lotes.size() - 1  ; i++) {
            String temp = Lotes.get(i) ;
            CBSetA.addItem(temp);
            CBSetB.addItem(temp);
            CBSetC.addItem(temp);
            
        }
    }
    
    // Return a String with the properties of each Set
    public String  getProperties(String lote) throws IOException{
        String [] temp = datos.getProperties(lote);
        String properties = temp[0] + "\n" + "Hectareas " +temp[1] + "\n";
        properties += "Distancia a casa Principal " +temp[2] + "\n";
        properties += "Calidad Pasto " + temp[3] + "\n" ;
        properties += "Punto de Agua " + temp[4] + "\n" ;
        properties += "Raza " + temp[5] ;
        
        return properties ;
    }
    
    // Return the name of the image
    public String getImage(String lote) throws IOException{         
        return datos.getImage(lote);
    }
    
    
    public workerWindow() throws IOException {
        initComponents();
        // Properties to the texts areas 
        textSetA.setLineWrap(true);
        textSetA.setWrapStyleWord(true);
        textSetB.setLineWrap(true);
        textSetB.setWrapStyleWord(true);
        textSetC.setLineWrap(true);
        textSetC.setWrapStyleWord(true);
        
        this.setLocationRelativeTo(null);
        AddLotesCB();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelImage1 = new javax.swing.JLabel();
        BHouse1 = new javax.swing.JButton();
        BProfile1 = new javax.swing.JButton();
        BSearch1 = new javax.swing.JButton();
        BSet1 = new javax.swing.JButton();
        BOut1 = new javax.swing.JButton();
        fond = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CBSetA = new javax.swing.JComboBox<>();
        CBSetB = new javax.swing.JComboBox<>();
        CBSetC = new javax.swing.JComboBox<>();
        CowB = new javax.swing.JLabel();
        CowA = new javax.swing.JLabel();
        CowC = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textSetA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textSetB = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        textSetC = new javax.swing.JTextArea();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabajador");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(128, 95, 29));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/logoMuuTexto.png"))); // NOI18N
        jPanel1.add(LabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 190, 176));

        BHouse1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/casa.png"))); // NOI18N
        BHouse1.setText("Inicio");
        BHouse1.setToolTipText("");
        BHouse1.setAutoscrolls(true);
        BHouse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHouse1ActionPerformed(evt);
            }
        });
        jPanel1.add(BHouse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 265, 93, -1));

        BProfile1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/perfil.png"))); // NOI18N
        BProfile1.setText("Perfil");
        BProfile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BProfile1ActionPerformed(evt);
            }
        });
        jPanel1.add(BProfile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 320, 93, -1));

        BSearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/buscar.png"))); // NOI18N
        BSearch1.setText("Buscar");
        BSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSearch1ActionPerformed(evt);
            }
        });
        jPanel1.add(BSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 380, 93, -1));

        BSet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/ver.png"))); // NOI18N
        BSet1.setText("Lotes");
        BSet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSet1ActionPerformed(evt);
            }
        });
        jPanel1.add(BSet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 445, -1, -1));

        BOut1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/salir.png"))); // NOI18N
        BOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOut1ActionPerformed(evt);
            }
        });
        jPanel1.add(BOut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 559, 34, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 600));

        fond.setBackground(new java.awt.Color(255, 255, 255));
        fond.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/obra.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        fond.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 440, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("MAPA LOTES");
        fond.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 50, -1, -1));

        CBSetA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSetAActionPerformed(evt);
            }
        });
        fond.add(CBSetA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 26, -1, -1));

        CBSetB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSetBActionPerformed(evt);
            }
        });
        fond.add(CBSetB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 178, -1, -1));

        CBSetC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSetCActionPerformed(evt);
            }
        });
        fond.add(CBSetC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 348, -1, -1));
        fond.add(CowB, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 215, 108, 108));
        fond.add(CowA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 108, 108));
        fond.add(CowC, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 379, 108, 108));

        textSetA.setColumns(20);
        textSetA.setRows(5);
        jScrollPane1.setViewportView(textSetA);

        fond.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 190, 120));

        textSetB.setColumns(20);
        textSetB.setRows(5);
        jScrollPane2.setViewportView(textSetB);

        fond.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 190, 120));

        textSetC.setColumns(20);
        textSetC.setRows(5);
        jScrollPane3.setViewportView(textSetC);

        fond.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 190, 130));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/FondoDos.png"))); // NOI18N
        fond.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        getContentPane().add(fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 0, 790, 600));

        pack();
    }// </editor-fold>                        

    private void BHouse1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        System.err.println("Ventana Principal");
        
    }                                       

    private void BOut1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        ven.OutProgram();
    }                                     

    private void BSearch1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        ven.SearchProgramm();
        dispose();
    }                                        

    private void CBSetCActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            System.out.println("Hereee");
            textSetC.setText(null);
            String image = getImage(CBSetC.getSelectedItem().toString());
            String ubication = "/DataImages/" ;
            ubication += image + ".png" ;
            CowC.setIcon(new javax.swing.ImageIcon(getClass().getResource(ubication)));
            String temp2 = CBSetC.getSelectedItem().toString(); 
            
            
            textSetC.setText(getProperties(temp2));
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                      

    private void CBSetBActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            textSetB.setText(null);
            String image = getImage(CBSetB.getSelectedItem().toString());
            String ubication = "/DataImages/" ;
            ubication += image + ".png" ;
            CowB.setIcon(new javax.swing.ImageIcon(getClass().getResource(ubication)));
            String temp2 = CBSetB.getSelectedItem().toString(); 
            System.err.println(temp2);
            
            textSetB.setText(getProperties(temp2)+ "Here");
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                      

    private void CBSetAActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            textSetB.setText(null);
            String image = getImage(CBSetA.getSelectedItem().toString());
            String ubication = "/DataImages/" ;
            ubication += image + ".png" ;
            CowA.setIcon(new javax.swing.ImageIcon(getClass().getResource(ubication)));
            String temp = CBSetA.getSelectedItem().toString();
            
            textSetA.setText(getProperties(temp));
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                      

    private void BProfile1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        System.out.println("Perfil Del trabajador");
    }                                         

    private void BSet1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        System.out.println("Ver Lotes");
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
            java.util.logging.Logger.getLogger(workerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(workerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(workerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(workerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new workerWindow().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(workerWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton BHouse1;
    private javax.swing.JButton BOut1;
    private javax.swing.JButton BProfile1;
    private javax.swing.JButton BSearch1;
    private javax.swing.JButton BSet1;
    private javax.swing.JComboBox<String> CBSetA;
    private javax.swing.JComboBox<String> CBSetB;
    private javax.swing.JComboBox<String> CBSetC;
    private javax.swing.JLabel CowA;
    private javax.swing.JLabel CowB;
    private javax.swing.JLabel CowC;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LabelImage1;
    private javax.swing.JPanel fond;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea textSetA;
    private javax.swing.JTextArea textSetB;
    private javax.swing.JTextArea textSetC;
    // End of variables declaration                   
}
