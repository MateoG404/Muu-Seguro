package Interfaz;

import Mundo.Empresa;
import Mundo.Veterinario;
import javax.swing.JButton;


/**
 *
 * @author mtgtr
 */
public class VeterinarioInterfaz extends javax.swing.JFrame {
    // Create the objects 
    Empresa empresa ;
    Veterinario veterinario;
    FunctionsClass ven = new FunctionsClass(3) ; 
    String nombreUsuario; 
    
    public VeterinarioInterfaz(Empresa empresa, String nombreUsuario){
        initComponents();
        this.nombreUsuario = nombreUsuario;
        this.empresa = empresa ;
        veterinario = empresa.darVeterinarioActual(nombreUsuario, empresa.darCodigo());
        System.out.println("Entroooo");
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ButtonSalir = new javax.swing.JButton();
        ButtonPerfil = new javax.swing.JButton();
        
        ButtonEnfermedad = new javax.swing.JButton();
        ButtonMedica = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea3 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        TextArea2 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        ComBox2 = new javax.swing.JComboBox<>();
        Imagen2 = new javax.swing.JLabel();
        Imagen3 = new javax.swing.JLabel();
        Imagen1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        textSetA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Muu Seguro");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        setLocation(new java.awt.Point(150, 50));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(77,144,254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/DataImage/logoMuuTexto.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 182));

        ButtonSalir.setIcon(new javax.swing.ImageIcon("..\\Muu-Seguro\\src\\Interfaz\\DataImage\\salir.png")); // NOI18N
        ButtonSalir.setFont(new java.awt.Font("SansSerif", 0, 12));
        ButtonSalir.setForeground(new java.awt.Color(255,255,255));
        ButtonSalir.setBorder(null);
        ButtonSalir.setBorderPainted(false);
        ButtonSalir.setBackground(new java.awt.Color(77,144,254));
        ButtonSalir.setContentAreaFilled(false);
        ButtonSalir.setOpaque(true);
        ButtonSalir.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMouseEntered(evt,ButtonSalir);
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                buttonMouseExited(evt, ButtonSalir);
            }
        });
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 30, 30));
        ButtonPerfil.setIcon(new javax.swing.ImageIcon("..\\Muu-Seguro\\src\\Interfaz\\DataImage\\perfil.png")); // NOI18N
        ButtonPerfil.setText("PERFIL");
        ButtonPerfil.setFont(new java.awt.Font("SansSerif", 0, 12));
        ButtonPerfil.setForeground(new java.awt.Color(255,255,255));
        ButtonPerfil.setBorder(null);
        ButtonPerfil.setBorderPainted(false);
        ButtonPerfil.setBackground(new java.awt.Color(77,144,254));
        ButtonPerfil.setContentAreaFilled(false);
        ButtonPerfil.setOpaque(true);
        ButtonPerfil.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMouseEntered(evt,ButtonPerfil);
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                buttonMouseExited(evt, ButtonPerfil);
            }
        });
        ButtonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPerfilActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 190, 32));

        
           

        ButtonEnfermedad.setIcon(new javax.swing.ImageIcon("..\\Muu-Seguro\\src\\Interfaz\\DataImage\\viewWhite.png")); // NOI18N
        ButtonEnfermedad.setText("ENFERMEDADES");
        ButtonEnfermedad.setFont(new java.awt.Font("SansSerif", 0, 12));
        ButtonEnfermedad.setForeground(new java.awt.Color(255,255,255));
        ButtonEnfermedad.setBorder(null);
        ButtonEnfermedad.setBorderPainted(false);
        ButtonEnfermedad.setBackground(new java.awt.Color(77,144,254));
        ButtonEnfermedad.setContentAreaFilled(false);
        ButtonEnfermedad.setOpaque(true);
        ButtonEnfermedad.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMouseEntered(evt,ButtonEnfermedad);
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                buttonMouseExited(evt, ButtonEnfermedad);
            }
        });
        ButtonEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEnfermedadActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 190, 32));

        ButtonMedica.setIcon(new javax.swing.ImageIcon("..\\Muu-Seguro\\src\\Interfaz\\DataImage\\agregar.png")); // NOI18N
        ButtonMedica.setText("MEDICAMENTOS");
        ButtonMedica.setFont(new java.awt.Font("SansSerif", 0, 12));
        ButtonMedica.setForeground(new java.awt.Color(255,255,255));
        ButtonMedica.setBorder(null);
        ButtonMedica.setBorderPainted(false);
        ButtonMedica.setBackground(new java.awt.Color(77,144,254));
        ButtonMedica.setContentAreaFilled(false);
        ButtonMedica.setOpaque(true);
        ButtonMedica.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMouseEntered(evt,ButtonMedica);
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                buttonMouseExited(evt, ButtonMedica);
            }
        });
        ButtonMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //ButtonMedicButtonMedicaaActionPerformed(evt);
                ButtonMedicaActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 190, 32));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 640));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextArea3.setColumns(20);
        TextArea3.setRows(5);
        jScrollPane2.setViewportView(TextArea3);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 220, 140));

        TextArea1.setColumns(20);
        TextArea1.setRows(5);
        jScrollPane3.setViewportView(TextArea1);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 220, 140));

        TextArea2.setColumns(20);
        TextArea2.setRows(5);
        jScrollPane4.setViewportView(TextArea2);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 220, 140));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 150, 30));

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 30));

        ComBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(ComBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, 30));
        jPanel2.add(Imagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 100, 100));
        jPanel2.add(Imagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 100, 100));
        jPanel2.add(Imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 100, 100));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/DataImage/FondoDos.png"))); // NOI18N
        jPanel2.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 640));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 0, 820, 615));

        textSetA.setColumns(20);
        textSetA.setRows(5);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void buttonMouseEntered(java.awt.event.MouseEvent evt, javax.swing.JButton boton) {                                             
        // TODO add your handling code here:
        if(boton.getText().length()!=0){
            boton.setBackground(new java.awt.Color(177, 207, 255));
        }else{
            boton.setBackground(new java.awt.Color(255,0,0));
        }
    }
    private void buttonMouseExited(java.awt.event.MouseEvent evt, javax.swing.JButton boton) {                                             
        // TODO add your handling code here:
        boton.setBackground(new java.awt.Color(77,144,254));
    }
    
    private void ButtonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPerfilActionPerformed
        System.out.println("Ver Pefil");
        PerfilVeterinarios ven=new PerfilVeterinarios(empresa,veterinario);
        this.setVisible(false);
        ven.setVisible(true);
    }//GEN-LAST:event_ButtonPerfilActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
        System.out.println("Eliminar enfermedades");
        
    }//GEN-LAST:event_ButtonEliminarActionPerformed

    private void ButtonEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEnfermedadActionPerformed
        System.out.println("Entro a --> Ver enfermedades");
        // Se abre la ventana de Agregar / Eliminar Enfermedades
        AgregarEnfermedad enfermedadVentana = new AgregarEnfermedad (empresa,nombreUsuario);
        enfermedadVentana.setVisible(true);
        this.setVisible(false);
    }
    

    private void ButtonMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarActionPerformed
        System.out.println("Entro a ---> Agregar enfermedades");
        // Se abre la ventana de Agregar / Eliminar Medicamentos
        AgregarMedicamentos medicamentosVentana = new AgregarMedicamentos(empresa, nombreUsuario) ;
        medicamentosVentana.setVisible(true);
        this.setVisible(false);
    }


    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void ComBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComBox2ActionPerformed

    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        System.out.println("Cerrar Sesión");
        InterfazPrincipal ventanaDeRegistro=new InterfazPrincipal();
        this.setVisible(false);
        ventanaDeRegistro.setVisible(true);
    }//GEN-LAST:event_ButtonSalirActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEnfermedad;
    private javax.swing.JButton ButtonMedica;
    private javax.swing.JButton ButtonPerfil;
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JComboBox<String> ComBox2;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Imagen1;
    private javax.swing.JLabel Imagen2;
    private javax.swing.JLabel Imagen3;
    private javax.swing.JTextArea TextArea1;
    private javax.swing.JTextArea TextArea2;
    private javax.swing.JTextArea TextArea3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea textSetA;
    // End of variables declaration//GEN-END:variables
}