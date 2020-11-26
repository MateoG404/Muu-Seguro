package Interfaz;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Mundo.Empresa;
//Graficar el lote
public class Tabla_Lotes extends javax.swing.JFrame{
    private javax.swing.JPanel contenedorPrincipal;
    private Interfaz.Registros ventanaRegistro;
    private Empresa empresa;
    public Tabla_Lotes(Interfaz.Registros ventanaRegistros, Empresa emp){
        this.ventanaRegistro=ventanaRegistro;
        empresa=emp;
        initComponents();
    }
    private void initComponents(){
        contenedorPrincipal=new javax.swing.JPanel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new java.awt.BorderLayout());
        setTitle("Muu Seguro");
        setResizable(false);
        contenedorPrincipal.setLayout(new java.awt.GridBagLayout());
        //Scanner sc= new Scanner(System.in);
        int widht= 1000;
        int height= 1000;
               //para el widht
        if(widht>=10 && widht<50){widht=2;}
        if(widht>=50 && widht<=100){widht=4;}
        if(widht>100 && widht<=1000){widht=7;}
        if(widht>1000 && widht<=10000){widht=13;}
        if(widht>10000 && widht<=100000){widht=14;}
        if(widht>100000 && widht<=1000000){widht=15;}
        if(widht>1000000 && widht<=10000000){widht=16;}
        if(widht>10000000 && widht<=100000000){widht=17;}
        if(widht>100000000 && widht<=1000000000){widht=18;}
               //para el height
        if(height>=10 && height<50){height=2;}
        if(height>=50 && height<=100){height=4;}
        if(height>=100 && height<=1000){height=7;}
        if(height>1000 && height<=10000){height=13;}
        if(height>10000 && height<=100000){height=14;}
        if(height>100000 && height<=1000000){height=15;}
        if(height>1000000 && height<=10000000){height=16;}
        if(height>10000000 && height<=100000000){height=17;}
        if(height>100000000 && height<=1000000000){height=18;}
        
        new CellPane(0,0,ventanaRegistro, this, empresa).cargarLotes();
        
        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        int x=0;
        int y=0;
        for (int row = 0; row < widht; row++) {

            for (int col = 0; col <height; col++) {
                gbc.gridx = col;
                gbc.gridy = row;
                CellPane cellPane = new CellPane(col,row,ventanaRegistro, this, empresa);
                javax.swing.border.Border border = null;
                if (row < (widht-1)) {
                    if (col < (height-1)) {
                        border = new javax.swing.border.MatteBorder(1, 1, 0, 0, new java.awt.Color(90,90,90));
                    }else{
                        border = new javax.swing.border.MatteBorder(1, 1, 0, 1, new java.awt.Color(90,90,90));
                    }
                }else{
                    if (col < (height-1)) {
                        border = new javax.swing.border.MatteBorder(1, 1, 1, 0, new java.awt.Color(90,90,90));
                    }else{
                        border = new javax.swing.border.MatteBorder(1, 1, 1, 1, new java.awt.Color(90,90,90));
                    }
                }
                cellPane.setBorder(border);
                contenedorPrincipal.add(cellPane,gbc);
            }
        }
        getContentPane().add(contenedorPrincipal);     
        setLocationRelativeTo(null);
        setVisible(true);
        pack();
       }
    /*public int getXselectValue(){
        return new CellPane(0,0,ventanaRegistro,this, empresa).getXselectValue();
    }
    public int getYselectValue(){
        return  new CellPane(0,0,ventanaRegistro, this, empresa).getYselectValue();
    }*/
}

class CellPane extends javax.swing.JPanel{
    private int x;
    private int y;
    private java.awt.Color defaultBackground;
    private static ArrayList<String>registrados=new ArrayList<>();
    private Interfaz.Registros ventanaRegistros;
    private javax.swing.JFrame ventanaContenedor;
    private Empresa empresa;
    public CellPane(int x, int y, Interfaz.Registros ventanaRegistros,javax.swing.JFrame ventanaContenedor, Empresa emp){
        empresa=emp;
        this.x=x;
        this.y=y;
        System.err.println(registrados.size());
        for(int i=0; i<registrados.size();i++){
            System.out.println("Now:"+registrados.get(i));
        }
        System.out.println();
        for(int i=0; i<registrados.size();i++){
            if((this.x+"-"+this.y).equals(registrados.get(i))){
                setBackground(new java.awt.Color(104,191,52));
            }
        }
        
        addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            panelMouseClicked(e,ventanaRegistros, ventanaContenedor);        
        }
        });
    }
    public void cargarLotes(){
        String linea;
        try{
            BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\John Silva\\Desktop\\Java\\MuuuuSeguro\\src\\dataBase\\"+empresa.darAdmin().darCorreo()+"Lotes.csv"));
            while((linea=br.readLine())!= null){//cada linea del archivo csv
                String[] valores = linea.split(",");//arreglo de las columnas de cada linea
                String coordenadas;   
                coordenadas=valores[4]+"-"+valores[5];
                System.err.println("Coordenadas: "+coordenadas);
                registrados.add(coordenadas);                    
                }
            }catch(IOException ex){
                JOptionPane.showMessageDialog(null, "UpsArregloLotes! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void panelMouseClicked(java.awt.event.MouseEvent ev, Interfaz.Registros ventanaRegistros,javax.swing.JFrame ventanaContenedor){
        //this.ventanaRegistros=ventanaRegistros;
        System.out.println("COLOR: "+this.getBackground().getRGB());
        if(this.getBackground().getRGB()==-2696737){
            defaultBackground = getBackground();
            setBackground(new java.awt.Color(104,191,52));
            if (JOptionPane.showConfirmDialog(null, "¿Está seguro de seleccionar la ubicación?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {  
                    System.out.println(this.x+"*"+this.y);
                    ventanaRegistros.xValueLote=this.x;
                    ventanaRegistros.yValueLote=this.y;
                    //ventanaRegistros.setEnabled(true);
                    ventanaContenedor.setVisible(false);       
            }else{
                setBackground(defaultBackground);
            }
        }
    }

     @Override
    public java.awt.Dimension getPreferredSize() {
        return new java.awt.Dimension(40, 40);
    }
    /*public int getXselectValue(){
        return xSelect;
    }
    public int getYselectValue(){
        return ySelect;
    }*/
}

