package Interfaz;

import Mundo.Empresa;
import javax.swing.JOptionPane;

/**
 *
 * @author MateoG404
 */
public class AgregarMedicamentos extends javax.swing.JFrame {
    
    Empresa empresa ;
    String nombreUsuario;
    
    public AgregarMedicamentos(Empresa empresa, String nombreUsuario) {
        this.empresa = empresa;
        this.nombreUsuario = nombreUsuario;
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioButtonEliminar = new javax.swing.JRadioButton();
        RadioButtonAgregar = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        CheckVitaminas = new javax.swing.JRadioButton();
        CheckMedicamentos = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ComBoxAnimales = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        DescripcionMedicamentos = new javax.swing.JTextField();
        DescripcionVitaminas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        LabelPaso2 = new javax.swing.JLabel();
        NombreMedicamentos = new javax.swing.JTextField();
        NombreMedicamentos.setVisible(false);
        NombreVitaminas = new javax.swing.JTextField();
        NombreVitaminas.setVisible(false);
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RadioButtonEliminar.setFont(new java.awt.Font("Bebas Neue", 0, 26)); // NOI18N
        RadioButtonEliminar.setForeground(new java.awt.Color(0, 204, 204));
        RadioButtonEliminar.setText("Eliminar");
        RadioButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(RadioButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        RadioButtonAgregar.setFont(new java.awt.Font("Bebas Neue", 0, 26)); // NOI18N
        RadioButtonAgregar.setForeground(new java.awt.Color(0, 204, 204));
        RadioButtonAgregar.setText("Agregar");
        RadioButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(RadioButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Medicamentos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        CheckVitaminas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckVitaminasActionPerformed(evt);
            }
        });
        getContentPane().add(CheckVitaminas, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        CheckMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckMedicamentosActionPerformed(evt);
            }
        });
        getContentPane().add(CheckMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bebas Neue", 0, 43)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("¿Desea Agregar o Eliminar?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("vitaminas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        ComBoxAnimales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComBoxAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComBoxAnimalesActionPerformed(evt);
            }
        });
        getContentPane().add(ComBoxAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 190, -1));

        jLabel6.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("1.Seleccione el animal ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        DescripcionMedicamentos.setText("Describa la vitamina aquí");
        DescripcionMedicamentos.enable(false);
        DescripcionMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripcionMedicamentosActionPerformed(evt);
            }
        });
        getContentPane().add(DescripcionMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 420, 120));

        DescripcionVitaminas.setText("Describa el medicamento aquí");
        DescripcionVitaminas.enable(false);
        DescripcionVitaminas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripcionVitaminasActionPerformed(evt);
            }
        });
        getContentPane().add(DescripcionVitaminas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 420, 120));

        jButton1.setFont(new java.awt.Font("Bebas Neue", 0, 22)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 100, 30));

        LabelPaso2.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        LabelPaso2.setForeground(new java.awt.Color(255, 255, 255));
        LabelPaso2.setText(" ");
        getContentPane().add(LabelPaso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 360, -1));

        NombreMedicamentos.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        NombreMedicamentos.setText("Nombre");
        NombreMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreMedicamentosActionPerformed(evt);
            }
        });
        getContentPane().add(NombreMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 210, -1));

        NombreVitaminas.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        NombreVitaminas.setText("Nombre");
        NombreVitaminas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreVitaminasActionPerformed(evt);
            }
        });
        getContentPane().add(NombreVitaminas, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 210, -1));

        jButton2.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/DataImage/fondomedicamentos.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonAgregarActionPerformed
        // Si se oprime el boton de agregar, la ventana muestra el textField de descripción.
        // Y el label donde dice los pasos para agregar
       RadioButtonEliminar.setSelected(false);

       LabelPaso2.setText("2. Seleccione la opción que desea agregar");
        
        
    }//GEN-LAST:event_RadioButtonAgregarActionPerformed

    private void CheckVitaminasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckVitaminasActionPerformed
        // El usuario primero debe seleccionar si va a agregar o eliminar un medicamento
        // Por ello es necesario primero saber si fue seleccionado alguna de las dos opciones
        if(RadioButtonAgregar.isSelected() == false && RadioButtonEliminar.isSelected() == false){
            JOptionPane.showMessageDialog(null, "Primero debe seleccionar si desea agregar o eliminar");
            CheckVitaminas.setSelected(false);
        }
            
        
        if(CheckVitaminas.isSelected()){
            DescripcionVitaminas.enable(true);
            NombreVitaminas.setVisible(true);
            
        }
        else{
            DescripcionVitaminas.setText("Describa el medicamento aquí");
            DescripcionVitaminas.enable(false);
            NombreVitaminas.setVisible(false);
        }
            
        
    }//GEN-LAST:event_CheckVitaminasActionPerformed

    private void CheckMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckMedicamentosActionPerformed
        if(RadioButtonAgregar.isSelected() == false && RadioButtonEliminar.isSelected() == false){
            JOptionPane.showMessageDialog(null, "Primero debe seleccionar si desea agregar o eliminar");
            CheckMedicamentos.setSelected(false);
        }
            
        if(CheckMedicamentos.isSelected()){
            DescripcionMedicamentos.enable(true);
            NombreMedicamentos.setVisible(true);
        }
        else{
            NombreMedicamentos.setVisible(false);
            DescripcionMedicamentos.setText("Describa el medicamento aquí");
            DescripcionMedicamentos.enable(false);
        }
    }//GEN-LAST:event_CheckMedicamentosActionPerformed

    private void DescripcionMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripcionMedicamentosActionPerformed
        
    }//GEN-LAST:event_DescripcionMedicamentosActionPerformed

    private void RadioButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonEliminarActionPerformed
        // Si se selecciona esto se deben cambiar algunos labels 
        RadioButtonAgregar.setSelected(false);

        LabelPaso2.setText("2. Seleccione la opción que desea eliminar");
        
    }//GEN-LAST:event_RadioButtonEliminarActionPerformed

    private void ComBoxAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComBoxAnimalesActionPerformed
        
        if(RadioButtonAgregar.isSelected() == false && RadioButtonEliminar.isSelected() == false)
            JOptionPane.showMessageDialog(null, "Primero debe seleccionar si desea agregar o eliminar");
            
    }//GEN-LAST:event_ComBoxAnimalesActionPerformed

    private void DescripcionVitaminasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripcionVitaminasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescripcionVitaminasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NombreMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreMedicamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreMedicamentosActionPerformed

    private void NombreVitaminasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreVitaminasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreVitaminasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Se regresa a la ventana principal del administrador
        VeterinarioInterfaz veterinarioVentana = new VeterinarioInterfaz(empresa,nombreUsuario);
        veterinarioVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarMedicamentos(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CheckMedicamentos;
    private javax.swing.JRadioButton CheckVitaminas;
    private javax.swing.JComboBox<String> ComBoxAnimales;
    private javax.swing.JTextField DescripcionMedicamentos;
    private javax.swing.JTextField DescripcionVitaminas;
    private javax.swing.JLabel LabelPaso2;
    private javax.swing.JTextField NombreMedicamentos;
    private javax.swing.JTextField NombreVitaminas;
    private javax.swing.JRadioButton RadioButtonAgregar;
    private javax.swing.JRadioButton RadioButtonEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
