// Ventana para agregar o eliminar enfermedades de los animales

package Interfaz;

import Mundo.Empresa;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author MateoG404
 */

public class AgregarEnfermedad extends javax.swing.JFrame {
    Empresa empresa;
    String nombreUsuario;
    public AgregarEnfermedad(JComboBox<String> ComBoxAnimal, JButton Guardar, JTextField TextDescripcion, JRadioButton agregarboton, JComboBox<String> comBoxEnfermedad, JRadioButton eliminarBoton, JButton jButton1, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JTextField textEnfermedad) throws HeadlessException {
        this.ComBoxAnimal = ComBoxAnimal;
        this.Guardar = Guardar;
        this.TextDescripcion = TextDescripcion;
        this.agregarboton = agregarboton;
        this.comBoxEnfermedad = comBoxEnfermedad;
        this.eliminarBoton = eliminarBoton;
        this.jButton1 = jButton1;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.textEnfermedad = textEnfermedad;
    }
            
    public AgregarEnfermedad(Empresa empresa, String nombreUsuario) {
        initComponents();
        this.empresa = empresa ;
        this.nombreUsuario = nombreUsuario;
        
        comBoxEnfermedad.setVisible(false);
        textEnfermedad.setVisible(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ComBoxAnimal = new javax.swing.JComboBox<>();
        eliminarBoton = new javax.swing.JRadioButton();
        agregarboton = new javax.swing.JRadioButton();
        comBoxEnfermedad = new javax.swing.JComboBox<>();
        textEnfermedad = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        TextDescripcion = new javax.swing.JTextField();
        TextDescripcion.enable(false);
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("4. Descripción ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("1. Selecciona tu Animal ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setText("2.¿Deseas Agregar o Eliminar?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setText("3. Nombre de la Enfermedad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        ComBoxAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComBoxAnimalActionPerformed(evt);
            }
        });
        getContentPane().add(ComBoxAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 130, -1));

        eliminarBoton.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        eliminarBoton.setText("Eliminar");
        eliminarBoton.setToolTipText("");
        eliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBotonActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, -1, -1));

        agregarboton.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        agregarboton.setText("Agregar");
        agregarboton.setToolTipText("");
        agregarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarbotonActionPerformed(evt);
            }
        });
        getContentPane().add(agregarboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, -1, -1));

        comBoxEnfermedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comBoxEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxEnfermedadActionPerformed(evt);
            }
        });
        getContentPane().add(comBoxEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 100, 30));
        getContentPane().add(textEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 140, 30));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, -1, -1));

        TextDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextDescripcion.setText("Escriba su descripción aquí");
        TextDescripcion.setToolTipText("");
        TextDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDescripcionActionPerformed(evt);
            }
        });
        getContentPane().add(TextDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 400, 170));

        jButton1.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 204, 0));
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/DataImage/fondoenfermedad.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -20, 1070, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComBoxAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComBoxAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComBoxAnimalActionPerformed

    private void eliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBotonActionPerformed
       System.out.println(evt.getActionCommand());
       comBoxEnfermedad.setVisible(true);
       textEnfermedad.setVisible(false);
       agregarboton.setSelected(false);
       TextDescripcion.enable(true);
    }//GEN-LAST:event_eliminarBotonActionPerformed

    private void agregarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarbotonActionPerformed
        // Se oculta el combox pues el usuario debe colocar el nombre de la enfermedad 
        comBoxEnfermedad.setVisible(false);
        textEnfermedad.setVisible(true);
        eliminarBoton.setSelected(false);
        TextDescripcion.enable(true);
    }//GEN-LAST:event_agregarbotonActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        String textoDescripcion = TextDescripcion.getText();
        System.out.println(textoDescripcion);
    }//GEN-LAST:event_GuardarActionPerformed

    private void comBoxEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxEnfermedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comBoxEnfermedadActionPerformed

    private void TextDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDescripcionActionPerformed
        
        
    }//GEN-LAST:event_TextDescripcionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Se devuelve a la ventana principal
        VeterinarioInterfaz veterinarioVentana = new VeterinarioInterfaz(empresa, nombreUsuario);
        veterinarioVentana.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEnfermedad(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComBoxAnimal;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField TextDescripcion;
    private javax.swing.JRadioButton agregarboton;
    private javax.swing.JComboBox<String> comBoxEnfermedad;
    private javax.swing.JRadioButton eliminarBoton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textEnfermedad;
    // End of variables declaration//GEN-END:variables
}
