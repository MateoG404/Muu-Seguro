package ReRico;
import java.io.File;
import java.io.FileWriter;
import java.lang.Integer;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author acer
 */
public class VamosQueVamos extends javax.swing.JFrame {
    static String directory = ".\\vaquitas.csv";
    /**
     * Creates new form VamosQueVamos
     */
    public VamosQueVamos() {
        
        initComponents();
        
    }  
    public static boolean isNumeric(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException nfe) {
            resultado = false;
        }
        return resultado;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        buttonGroup = new javax.swing.ButtonGroup();
        RegistroAnimal = new javax.swing.JLabel();
        Raza = new javax.swing.JLabel();
        Peso = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        Crias = new javax.swing.JLabel();
        Enfermedades = new javax.swing.JLabel();
        Tratamientos = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        Cubs = new javax.swing.JSpinner();
        RaceType = new javax.swing.JComboBox<>();
        RegisterNumber = new javax.swing.JTextField();
        Weight = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        Illness = new javax.swing.JComboBox<>();
        SexCow = new javax.swing.JRadioButton();
        SexBull = new javax.swing.JRadioButton();
        Treatments = new javax.swing.JComboBox<>();
        NextStep = new javax.swing.JButton();
        Milk = new javax.swing.JSpinner();
        Litros = new javax.swing.JLabel();
        CantidadDeLeche = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        RegistroAnimal.setText("Número de registro del animal");

        Raza.setText("Raza");

        Peso.setText("Peso");

        Edad.setText("Edad");

        Crias.setText("Crias");

        Enfermedades.setText("Enfermedades");

        Tratamientos.setText("Tratamientos");

        Sexo.setText("Sexo");

        Cubs.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        RaceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------", "Holstein", "Cebu", "Normando", "Simmental" }));

        RegisterNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RegisterNumber.setText("#########");
        RegisterNumber.setToolTipText("");
        RegisterNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterNumberActionPerformed(evt);
            }
        });

        jLabel1.setText("kg");

        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });

        Illness.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup.add(SexCow);
        SexCow.setText("Vaca");
        SexCow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexCowActionPerformed(evt);
            }
        });

        buttonGroup.add(SexBull);
        SexBull.setText("Toro");
        SexBull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexBullActionPerformed(evt);
            }
        });

        Treatments.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        NextStep.setText("Siguiente");
        NextStep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextStepActionPerformed(evt);
            }
        });

        Milk.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        Litros.setText("L");

        CantidadDeLeche.setText("Cantidad de leche");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Sexo)
                    .addComponent(Tratamientos)
                    .addComponent(Enfermedades)
                    .addComponent(Crias)
                    .addComponent(Edad)
                    .addComponent(Peso)
                    .addComponent(Raza)
                    .addComponent(RegistroAnimal)
                    .addComponent(CantidadDeLeche))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Milk, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Treatments, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(SexCow)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Cubs, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Illness, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Litros))
                    .addComponent(RegisterNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SexBull)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Age, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Weight)
                            .addComponent(RaceType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(216, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NextStep)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegistroAnimal)
                    .addComponent(RegisterNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Raza)
                    .addComponent(RaceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Peso)
                    .addComponent(Weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edad)
                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Crias)
                    .addComponent(Cubs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enfermedades)
                    .addComponent(Illness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tratamientos)
                    .addComponent(Treatments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(SexCow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SexBull)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sexo)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Milk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Litros)
                    .addComponent(CantidadDeLeche))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NextStep)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void RegisterNumberActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void SexCowActionPerformed(java.awt.event.ActionEvent evt) {                                       

    }                                      

    private void SexBullActionPerformed(java.awt.event.ActionEvent evt) {                                        
           
    }                                       

    private void NextStepActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //Verificar que el dato ingresado del peso sea un entero
        int numero_peso;
        numero_peso = Integer.parseInt(Weight.getText());
        if (isNumeric(Weight.getText()) == true) {
            if (numero_peso<=0){JOptionPane.showMessageDialog(null, "Ingreso un peso invalido vuelva a intentarlo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            if(Weight.getText().length()==0){
                JOptionPane.showMessageDialog(null, "No ingreso el peso", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                 JOptionPane.showMessageDialog(null, "Ingreso un peso no númerico vuelva a intentarlo", "Error", JOptionPane.ERROR_MESSAGE);
            }
          }
        //Verificar que el dato ingresado de la edad sea un entero
        int numero_años;
        numero_años = Integer.parseInt(Age.getText());
        if (isNumeric(Age.getText()) == true) {
            if (numero_años<=0 || numero_años>30){JOptionPane.showMessageDialog(null, "Ingreso una edad invalida vuelva a intentarlo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            if(Age.getText().length()==0){
                JOptionPane.showMessageDialog(null, "No ingreso la edad", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                 JOptionPane.showMessageDialog(null, "Ingreso una edad no númerico vuelva a intentarlo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        //Cantidad de leche si es macho o hembra
        boolean tt=SexCow.isSelected();
        String sexo;
        if(tt==true){sexo="vaca";}
        else{sexo="toro";}
        double X= (double)Milk.getValue();
        if(SexCow.isSelected() == true)
            {System.out.println(X);} 
        else if((SexCow.isSelected() != true) && (X>0))
            {JOptionPane.showMessageDialog(null, "Los machos no producen leche se le asiganará el valor 0", "Advertencia", JOptionPane.WARNING_MESSAGE);
            X=0;
            System.out.println(X);}
        else
            {System.out.print("es macho");}
        
        //revisar raza
        if(RaceType.getSelectedItem()=="---------")
            {JOptionPane.showMessageDialog(null, "Debe elegir la raza del animal", "Error", JOptionPane.ERROR_MESSAGE);}
        
        //Numero de identificación del animal
        String cadena  = RegisterNumber.getText();
        System.out.println(cadena);
        
        //Raza
        String petName = (String)RaceType.getSelectedItem();
        System.out.println(petName);
        
        //crias
        int value_cubs = (Integer) Cubs.getValue();
        System.out.println(value_cubs);
        
        if((numero_peso>0)&&(numero_años>0 || numero_años<=30)&&(petName!="---------")){
        if (JOptionPane.showConfirmDialog(null, "¿Desea guardar estos datos?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            //Código anexar los datos al archivo CSV
            try {
            FileWriter fw= new FileWriter(directory, true);
            PrintWriter pw1= new PrintWriter(fw);
            pw1.println(cadena+","+petName+","+numero_peso+","+numero_años+","+value_cubs+","+sexo+","+X);
            pw1.close();
            System.out.println("Finished");
            System.exit(0);
        } 
            catch(Exception e){}
    }
            else {
            System.exit(0);
        }
        ArrayList lista = new ArrayList();    
        lista.add(cadena);
            lista.add(petName);
            lista.add(numero_peso);
            lista.add(numero_años);
            System.out.print(lista);}
    }                                        

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {new VamosQueVamos().setVisible(true);}});
    }
    // Variables declaration - do not modify                     
    public static javax.swing.JTextField Age;
    private javax.swing.JLabel CantidadDeLeche;
    private javax.swing.JLabel Crias;
    public static javax.swing.JSpinner Cubs;
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel Enfermedades;
    public static javax.swing.JComboBox<String> Illness;
    private javax.swing.JLabel Litros;
    public static javax.swing.JSpinner Milk;
    public static javax.swing.JButton NextStep;
    private javax.swing.JLabel Peso;
    public static javax.swing.JComboBox<String> RaceType;
    private javax.swing.JLabel Raza;
    public static javax.swing.JTextField RegisterNumber;
    public static javax.swing.JLabel RegistroAnimal;
    public static javax.swing.JRadioButton SexBull;
    public static javax.swing.JRadioButton SexCow;
    private javax.swing.JLabel Sexo;
    private javax.swing.JLabel Tratamientos;
    public static javax.swing.JComboBox<String> Treatments;
    public static javax.swing.JTextField Weight;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
