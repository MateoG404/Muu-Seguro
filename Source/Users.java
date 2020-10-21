package usuarios;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class defusuarios extends javax.swing.JFrame {
    static String directory2 = "C:\\Users\\acer\\Desktop\\Usuarios.csv";
    public defusuarios() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Job = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Salary = new javax.swing.JSpinner();
        ThankYou = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));

        jLabel1.setText("Nombre de usuario");

        jLabel2.setText("Opupación");

        Job.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "Veterinario", "Trabajador" }));

        jLabel3.setText("Clave");

        jLabel4.setText("Salario");

        Salary.setModel(new javax.swing.SpinnerNumberModel(300000.0d, 300000.0d, 1800000.0d, 10000.0d));

        ThankYou.setText("Siguiente");
        ThankYou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThankYouActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(UserName, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                        .addComponent(Job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Password)))
                .addContainerGap(715, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ThankYou)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addComponent(ThankYou)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void ThankYouActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //jOB?
        String ocupation1  = (String)Job.getSelectedItem();
        if(Job.getSelectedItem()=="----------")
            {JOptionPane.showMessageDialog(null, "Debe elegir la ocupación de su trabajador", "Error", JOptionPane.ERROR_MESSAGE);}
        else
            {System.out.println(ocupation1);}
        
        //nombre de usuario
        String name_user  = UserName.getText();
        System.out.println(name_user);
        boolean user_exist = true;
        
        //Cuidado Verifica que el usuario no exista ya
        String path2 = "C:\\Users\\acer\\Desktop\\Usuarios.csv";
        String line2;
        try {
            BufferedReader br =new BufferedReader(new FileReader(path2));
            while((line2= br.readLine())!= null){
                String[] values1 = line2.split(",");
                if(values1[0].equals(name_user))
                    {JOptionPane.showMessageDialog(null, "Este usuario ya esta registrado, ingrese uno nuevo", "Error", JOptionPane.ERROR_MESSAGE);
                    user_exist=false;}
            }
        } 
        catch (FileNotFoundException e) {}
        catch (IOException e) {}
        System.out.print(user_exist);
        
        
        //CLAVE
        String CLUE  = Password.getText();
        System.out.println(CLUE);
        
        //Salario
        double salario1 = (Double) Salary.getValue();
        System.out.println(salario1); 
        String vacio;
        if(name_user.isEmpty() || CLUE.isEmpty())
            {vacio="no";
            JOptionPane.showMessageDialog(null, "Algunos datos no han sido ingresados", "Error", JOptionPane.ERROR_MESSAGE);}
        else
            {vacio="yes";}
        if(Job.getSelectedItem()!="----------" && vacio=="yes" && user_exist == true)
        {if (JOptionPane.showConfirmDialog(null, "¿Desea guardar estos datos?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
        {   
            try {
            FileWriter fw2= new FileWriter(directory2, true);
            PrintWriter pw2= new PrintWriter(fw2);
            pw2.println(ocupation1+","+name_user+","+CLUE+","+salario1);
            pw2.close();
            System.out.println("Finished");
            System.exit(0);
            } 
            catch(Exception e){}
        }
            else 
                {System.exit(0);}
        ;}    
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
            java.util.logging.Logger.getLogger(defusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(defusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(defusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(defusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new defusuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> Job;
    private javax.swing.JTextField Password;
    private javax.swing.JSpinner Salary;
    private javax.swing.JButton ThankYou;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
