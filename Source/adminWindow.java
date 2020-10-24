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
 * @author mtgtr
 */

public class Ventana extends javax.swing.JFrame {
    // Create Objects //
    
    FunctionsClass ven = new FunctionsClass(1);
    Empresa datos = new Empresa();
    
    //                  Methods                 //
    
    //Add the Set to the ComboBox 
    public void AddLotesCB() throws IOException{
        ArrayList<String> Lotes = datos.getLotesArray() ;
        for (int i = 1; i < Lotes.size() - 1  ; i++) {
            String temp = Lotes.get(i) ;
            CBSetA.addItem(temp);
            CBSetB.addItem(Lotes.get(i));
            
        }
    }
    
    // Add the Characteristics to compare
    public void AddComparatives(){
        String [] Comparatives = datos.getComparatives();
        for (int i = 0 ; i < Comparatives.length - 1 ; i ++){
            ComA.addItem(Comparatives[i]);
            ComB.addItem(Comparatives[i]);
        }
        
    }
    
    // Return the name of the image
    public String getImage(String lote) throws IOException{         
        return datos.getImage(lote);
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
    
    // Ventana 
    public Ventana() throws IOException {
        
        initComponents();
        textSetA.setLineWrap(true);
        textSetA.setWrapStyleWord(true);
        textSetB.setLineWrap(true);
        textSetB.setWrapStyleWord(true);
        this.setLocationRelativeTo(null);
        
        AddLotesCB();
        AddComparatives();
        
        
        

        
    }
    
    //Data Members 
    boolean band = false;
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LabelImage = new javax.swing.JLabel();
        BProfile = new javax.swing.JButton();
        BSearch = new javax.swing.JButton();
        BOut = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        BSet1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ComB = new javax.swing.JComboBox<>();
        ComA = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        ButtonGraphic = new javax.swing.JButton();
        CowA = new javax.swing.JLabel();
        CBSetA = new javax.swing.JComboBox<>();
        CowB = new javax.swing.JLabel();
        CBSetB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textSetA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textSetB = new javax.swing.JTextArea();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(128, 95, 29));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/logoMuuTexto.png"))); // NOI18N
        jPanel1.add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 182));

        BProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/perfil.png"))); // NOI18N
        BProfile.setText("Perfil");
        BProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BProfileActionPerformed(evt);
            }
        });
        jPanel1.add(BProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 137, -1));

        BSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/buscar.png"))); // NOI18N
        BSearch.setText("Buscar");
        BSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSearchActionPerformed(evt);
            }
        });
        jPanel1.add(BSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 137, -1));

        BOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/salir.png"))); // NOI18N
        BOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOutActionPerformed(evt);
            }
        });
        jPanel1.add(BOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 30, 31));

        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/agregar.png"))); // NOI18N
        AddButton.setText("Agregar");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 137, -1));

        BSet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/eliminar.png"))); // NOI18N
        BSet1.setText("Eliminar");
        BSet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSet1ActionPerformed(evt);
            }
        });
        jPanel1.add(BSet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 137, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 190, 640));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComBActionPerformed(evt);
            }
        });
        jPanel2.add(ComB, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, -1, -1));

        ComA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComAActionPerformed(evt);
            }
        });
        jPanel2.add(ComA, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 90, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("VS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("DESDE:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("HASTA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        jDateChooser2.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser2.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser2.setFocusCycleRoot(true);
        jDateChooser2.setFocusable(false);
        jPanel2.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        ButtonGraphic.setText("Graficar");
        ButtonGraphic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGraphicActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonGraphic, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, -1, -1));

        CowA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/holstein.png"))); // NOI18N
        jPanel2.add(CowA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        CBSetA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSetAActionPerformed(evt);
            }
        });
        jPanel2.add(CBSetA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        CowB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/jersey.png"))); // NOI18N
        jPanel2.add(CowB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        CBSetB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSetBActionPerformed(evt);
            }
        });
        jPanel2.add(CBSetB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        textSetA.setColumns(20);
        textSetA.setRows(5);
        jScrollPane1.setViewportView(textSetA);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 230, 150));
        jScrollPane1.getAccessibleContext().setAccessibleDescription("");

        textSetB.setColumns(20);
        textSetB.setRows(5);
        jScrollPane2.setViewportView(textSetB);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 240, 150));

        Fondo.setBackground(new java.awt.Color(0, 51, 51));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataImages/FondoDos.png"))); // NOI18N
        jPanel2.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -20, 1060, 640));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 0, 820, 615));

        pack();
    }// </editor-fold>                        

    private void BProfileActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Llama el método de perfil Admin
        System.out.println("Admin profile");
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

    private void BOutActionPerformed(java.awt.event.ActionEvent evt) {                                     
        ven.OutProgram();
    }                                    

    private void ComAActionPerformed(java.awt.event.ActionEvent evt) {                                     
        
    }                                    

    private void ComBActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void BSearchActionPerformed(java.awt.event.ActionEvent evt) {                                        
       // Ventana para buscar
       ven.SearchProgramm();
       dispose();      
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
            
            textSetB.setText(getProperties(temp2));
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                      

    private void ButtonGraphicActionPerformed(java.awt.event.ActionEvent evt) {                                              
        band = true ; 
        repaint();
    }                                             

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        System.out.println("Ventana de agregar ") ; 
    }                                         

    private void BSet1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        System.out.println("Ventana de eliminar ");
    }                                     

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new Ventana().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BOut;
    private javax.swing.JButton BProfile;
    private javax.swing.JButton BSearch;
    private javax.swing.JButton BSet1;
    private javax.swing.JButton ButtonGraphic;
    private javax.swing.JComboBox<String> CBSetA;
    private javax.swing.JComboBox<String> CBSetB;
    private javax.swing.JComboBox<String> ComA;
    private javax.swing.JComboBox<String> ComB;
    private javax.swing.JLabel CowA;
    private javax.swing.JLabel CowB;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LabelImage;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textSetA;
    private javax.swing.JTextArea textSetB;
    // End of variables declaration                   

    
    // Function to do the graphics
    public void paint(Graphics g){
        super.paint(g) ;
        if (band){
            //Take the values of the CSV

            int valA = datos.getQuantityAnimals(ComA.getSelectedItem().toString());
            int valB = datos.getQuantityAnimals(ComB.getSelectedItem().toString());
            
            int total = valA + valB ;
            
            int degreeValA = ( valA * 360 ) / total;
            int degreeValB = (valB * 360 ) / total ;
            
            
            g.setFont( new Font( "Tw Cen MT", Font.BOLD, 20 ) );
            
            // First Value
            
            g.setColor(new Color(246, 35, 54));
            g.fillArc(700,150,200, 200,0,degreeValA);
            g.fillRect(700, 420, 20, 20);
            g.drawString(ComA.getSelectedItem().toString(), 725, 435);
            // Second Value
            g.setColor(new Color(32, 63, 182));
            g.fillArc(700,150,200, 200,degreeValA,degreeValB);
            g.fillRect(700, 450, 20, 20);
            g.drawString(ComB.getSelectedItem().toString(), 725, 465 );
            
        }
    }


}
