import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Lot extends javax.swing.JFrame {
    static String directory1 = "C:\\Users\\acer\\Desktop\\lotes.csv";
    public Lot() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Hectareas = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        GrassQuality = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        YespointOfWater = new javax.swing.JRadioButton();
        NopointOfWater = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        DistanceHouse = new javax.swing.JSpinner();
        ButonNext = new javax.swing.JButton();
        NumeroDeLote = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));

        jLabel1.setText("Número de hectareas");

        Hectareas.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1500.0d, 0.5d));

        jLabel2.setText("Calidad del pasto");

        GrassQuality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "Bueno", "Regular", "Malo" }));
        GrassQuality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrassQualityActionPerformed(evt);
            }
        });

        jLabel3.setText("Punto de agua");

        buttonGroup1.add(YespointOfWater);
        YespointOfWater.setText("Si");

        buttonGroup1.add(NopointOfWater);
        NopointOfWater.setText("No");

        jLabel4.setText("Distancia a la casa principal");

        DistanceHouse.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 280.0d, 0.5d));

        ButonNext.setText("Siguiente");
        ButonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonNextActionPerformed(evt);
            }
        });

        NumeroDeLote.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel5.setText("Número de lote");

        jLabel6.setText("ha");

        jLabel7.setText("km");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButonNext)
                .addGap(94, 94, 94))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(YespointOfWater)
                    .addComponent(DistanceHouse)
                    .addComponent(NopointOfWater)
                    .addComponent(GrassQuality, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hectareas)
                    .addComponent(NumeroDeLote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(548, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroDeLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Hectareas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(GrassQuality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(YespointOfWater))
                .addGap(1, 1, 1)
                .addComponent(NopointOfWater)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(DistanceHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(113, 113, 113)
                .addComponent(ButonNext)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void ButonNextActionPerformed(java.awt.event.ActionEvent evt) {                                          
        //Número de lote
        int lotnum = (Integer) NumeroDeLote.getValue();//Toca revisar que no este repetido el lote y eso con csv
        System.out.println(lotnum);
        boolean earth_exist = true;
        
        //Cuidado Verifica que el lote no exista ya
        String path1 = "C:\\Users\\acer\\Desktop\\lotes.csv";
        String line1;
        try {
            BufferedReader br =new BufferedReader(new FileReader(path1));
            while((line1= br.readLine())!= null){
                String[] values1 = line1.split(",");
                String numCadena= Integer.toString(lotnum);
                if(values1[0].equals(numCadena))
                    {JOptionPane.showMessageDialog(null, "Este lote ya esta registrado, ingrese uno nuevo", "Error", JOptionPane.ERROR_MESSAGE);
                    earth_exist=false;}
            }
        } 
        catch (FileNotFoundException e) {}
        catch (IOException e) {}
        System.out.print(earth_exist);
        
        
        //Hectareas
        double hecti = (Double) Hectareas.getValue();
        System.out.println(hecti);
        if (hecti == 0){JOptionPane.showMessageDialog(null, "Debe elegir la cantidad de hectareas", "Error", JOptionPane.ERROR_MESSAGE);}

        //Grass
        if(GrassQuality.getSelectedItem()=="-----------")
            {JOptionPane.showMessageDialog(null, "Debe elegir la calidad del pasto", "Error", JOptionPane.ERROR_MESSAGE);}
        else{
            String grassi  = (String)GrassQuality.getSelectedItem();
            System.out.println(grassi);}
        
        //Punto de agua
        boolean ll=YespointOfWater.isSelected();
        String water;
        if(ll==true){water="si";}
        else{water="no";}
        
        //Distancia a la casa principal
        double kilom = (Double) DistanceHouse.getValue();
        System.out.println(kilom);
        if (kilom == 0){JOptionPane.showMessageDialog(null, "Debe elegir la cantidad de kilometros", "Error", JOptionPane.ERROR_MESSAGE);}
        
        //verificar si lo quiere guardar
        if(GrassQuality.getSelectedItem()!="-----------" && hecti !=0 && kilom != 0 && earth_exist==true)
        {if (JOptionPane.showConfirmDialog(null, "¿Desea guardar estos datos?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
        {   try {
            FileWriter fw1= new FileWriter(directory1, true);
            PrintWriter pw1= new PrintWriter(fw1);
            pw1.println(lotnum+","+hecti+","+water+","+kilom);
            pw1.close();
            System.out.println("Finished");
            System.exit(0);
            } 
            catch(Exception e){}
        }
            else 
                {System.exit(0);}
        ;} 
        
    }                                         

    private void GrassQualityActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Lot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton ButonNext;
    private javax.swing.JSpinner DistanceHouse;
    private javax.swing.JComboBox<String> GrassQuality;
    private javax.swing.JSpinner Hectareas;
    private javax.swing.JRadioButton NopointOfWater;
    private javax.swing.JSpinner NumeroDeLote;
    private javax.swing.JRadioButton YespointOfWater;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
