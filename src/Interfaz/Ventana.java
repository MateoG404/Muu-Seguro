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
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList ;
import Mundo.Administrador;
import java.util.Date;
import javax.swing.JOptionPane;
import org.xml.sax.Attributes;
/**
 *
 * @author mtgtr
 */

public class Ventana extends javax.swing.JFrame {
    // Create Objects //
    
   
    Empresa empresa;
    FunctionsClass ven=new FunctionsClass(1);
    Administrador admin;
    
    //                  Methods                 //
    
    //Add the Set to the ComboBox 
    public void AddLotesCB(){
        ArrayList<String> Lotes = admin.getLotesArray() ;
        for (int i = 0; i < Lotes.size()  ; i++) {
            String temp = Lotes.get(i) ;
            CBSetA.addItem(temp);
            CBSetB.addItem(Lotes.get(i));            
        }
    }
    
    // Add the Characteristics to compare
    public void AddComparatives(){
        String [] Comparatives = {"Cantidad Lotes","Animales","Vacas","Toros","Terneros","Empleados"};
        for (int i = 0 ; i < Comparatives.length - 1 ; i ++){
            ComA.addItem(Comparatives[i]);
            ComB.addItem(Comparatives[i]);
        }
        
    }
    
    // Return the name of the image
    public String getImage(String lote){         
        return admin.getImage(lote).toLowerCase();
    }
    
    // Return a String with the properties of each Set
    public String  getProperties(String lote) throws IOException{
        String [] temp =admin.getProperties(lote).toArray(new String[admin.getProperties(lote).size()]);
        String properties = temp[0] + "\n" + "Hectareas " +temp[1] + "\n";
        properties += "Distancia a casa Principal " +temp[2] + "\n";
        properties += "Calidad Pasto " + temp[3] + "\n" ;
        properties += "Punto de Agua " + temp[4] + "\n" ;
        properties += "Raza " + temp[5] ;
        
        return properties ;
    }
    
    // Ventana 
    public Ventana(Empresa emp) {
        empresa=emp;
        admin=empresa.darAdmin();
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
        setTitle("Muu Seguro");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(128, 95, 29));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\Interfaz\\DataImage\\logoMuuTexto.png")); // NOI18N
        jPanel1.add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 182));

        BProfile.setIcon(new javax.swing.ImageIcon("C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\Interfaz\\DataImage\\perfil.png")); // NOI18N
        BProfile.setText("Perfil");
        BProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BProfileActionPerformed(evt);
            }
        });
        jPanel1.add(BProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 137, -1));

        BSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\Interfaz\\DataImage\\buscar.png")); // NOI18N
        BSearch.setText("Buscar");
        BSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSearchActionPerformed(evt);
            }
        });
        jPanel1.add(BSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 137, -1));

        BOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\Interfaz\\DataImage\\salir.png")); // NOI18N
        BOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOutActionPerformed(evt);
            }
        });
        jPanel1.add(BOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 30, 31));

        AddButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\Interfaz\\DataImage\\agregar.png")); // NOI18N
        AddButton.setText("Agregar");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 137, -1));

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

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("VS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel2.setText("DESDE:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel3.setText("HASTA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));
        ((javax.swing.JTextField)jDateChooser1.getDateEditor()).setEditable(false);
        jDateChooser1.getJCalendar().setMaxSelectableDate(new Date());
        jDateChooser1.setDate(new Date());
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1)); 
        
        jDateChooser2.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser2.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser2.setFocusCycleRoot(true);
        jDateChooser2.setFocusable(false);
        ((javax.swing.JTextField)jDateChooser2.getDateEditor()).setEditable(false);
        jDateChooser2.getJCalendar().setMaxSelectableDate(new Date());
        jDateChooser2.setDate(new Date());
        jPanel2.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        ButtonGraphic.setText("Graficar");
        ButtonGraphic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGraphicActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonGraphic, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, -1, -1));

        CowA.setIcon(new javax.swing.ImageIcon("C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\Interfaz\\DataImage\\holstein.png")); // NOI18N
        jPanel2.add(CowA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        CBSetA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSetAActionPerformed(evt);
            }
        });
        jPanel2.add(CBSetA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        CowB.setIcon(new javax.swing.ImageIcon("C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\Interfaz\\DataImage\\jersey.png")); // NOI18N
        jPanel2.add(CowB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        CBSetB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSetBActionPerformed(evt);
            }
        });
        jPanel2.add(CBSetB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        textSetA.setColumns(20);
        textSetA.setRows(5);
        textSetA.setEditable(false);
        jScrollPane1.setViewportView(textSetA);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 230, 150));
        jScrollPane1.getAccessibleContext().setAccessibleDescription("");

        textSetB.setColumns(20);
        textSetB.setRows(5);
        textSetB.setEditable(false);
        jScrollPane2.setViewportView(textSetB);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 240, 150));

        Fondo.setBackground(new java.awt.Color(0, 51, 51));
        Fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\Interfaz\\DataImage\\FondoDos.png")); // NOI18N
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
            String ubication = "C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\Interfaz\\DataImage\\" ; 
            ubication= ubication+image+".png" ;
            System.out.println(ubication);
            CowA.setIcon(new javax.swing.ImageIcon(ubication));
            String temp = CBSetA.getSelectedItem().toString();
            
            textSetA.setText(getProperties(temp));
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                      

    private void BOutActionPerformed(java.awt.event.ActionEvent evt) {                                     
        InterfazPrincipal ventanaDeRegistro=new InterfazPrincipal();
        this.setVisible(false);
        ventanaDeRegistro.setVisible(true);
    }                                   

    private void ComAActionPerformed(java.awt.event.ActionEvent evt) {                                     
        
    }                                    

    private void ComBActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void BSearchActionPerformed(java.awt.event.ActionEvent evt) {                                        
       // Ventana para buscar
        ven.SearchProgramm(empresa);
        dispose();      
    }                                       

    private void CBSetBActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
        try {
            textSetB.setText(null);
            String image = getImage(CBSetB.getSelectedItem().toString());
            String ubication = "C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\Interfaz\\DataImage\\" ;
            ubication += image + ".png" ;
            CowB.setIcon(new javax.swing.ImageIcon(ubication));
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
         Registros ventanaRegistros=new Registros(empresa);
         this.setVisible(false);
         ventanaRegistros.setVisible(true);
    }                                         

    private void BSet1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        System.out.println("Ventana de eliminar ");
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

            int valA =admin.getQuantityAnimals(ComA.getSelectedItem().toString());
            int valB =admin.getQuantityAnimals(ComB.getSelectedItem().toString());
            
            int total = valA + valB ;
            int degreeValA=0;
            int degreeValB=0; 
            if(total>0){
                degreeValA = ( valA * 360 ) / total;
                degreeValB = (valB * 360 ) / total ;
            }
            
            g.setFont( new Font( "SansSerif", Font.BOLD, 20 ) );
            
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

