//Data Members
    
    // Directions of the files
    String pathAnimals = "C:\\Users\\mtgtr\\Documents\\NetBeansProjects\\Admin\\Animales.csv" ;
    String pathEmployees = "C:\\Users\\mtgtr\\Documents\\NetBeansProjects\\Admin\\Empleados.csv" ;
    String pathSets = "C:\\Users\\mtgtr\\Documents\\NetBeansProjects\\Admin\\Lotes.csv" ;
    String pathQuantity = "C:\\Users\\mtgtr\\Documents\\NetBeansProjects\\Admin\\Cantidad.csv" ;
    String line = "" ; 
    
    // BufferReaders
    BufferedReader brAnimals ;
    BufferedReader brEmployees ;
    BufferedReader brSets ;
    BufferedReader brSets2 ;
    BufferedReader brSets3 ;
    BufferedReader brQuantity ;
    
    //ArrayList to save the data of the documents
    ArrayList<String> tempAnimals = new ArrayList<String>() ;
    ArrayList<String> tempEmployees = new ArrayList<String>();
    ArrayList<String> tempSets = new ArrayList<String> () ;
    ArrayList<String> Quantity = new ArrayList<String> () ;
    ArrayList<String> ListText = new ArrayList<String> () ;

    
    // ArrayLists with the datas to the ComBox 
    ArrayList<String> lotesArray = new ArrayList<String> ();
    
    
    boolean band = true ;
    String [] Comparatives = {"Cantidad Lotes","Animales","Vacas","Toros","Terneros","Empleados"};
    
    //Constructor 
    public Empresa() {
        try {
            // initialization Buffers 
            this.brAnimals = new BufferedReader(new FileReader(pathAnimals));
            this.brEmployees = new BufferedReader(new FileReader(pathEmployees));
            this.brSets = new BufferedReader(new FileReader(pathSets));
            this.brSets2 = new BufferedReader(new FileReader(pathSets));
            this.brSets3 = new BufferedReader(new FileReader(pathSets));
            this.brQuantity = new BufferedReader(new FileReader(pathQuantity));
            
            // Add the elements of Quantity to the ArrayList Quantity
            addQuantity();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //                            Methods                                     //
    
    private void addQuantity() throws IOException{
        while( (this.line = brQuantity.readLine()) != null ){
                String [] value = this.line.split(",");
                for(int i = 0 ; i <5 ; i ++){
                    this.Quantity.add(value[i]);
                }
            }

    }
    
    // Method to get the Animal´s list 
    public ArrayList<String> getAnimals() throws IOException{   
        while( (this.line = brAnimals.readLine()) != null ){
            String [] values = this.line.split(",");
            for (int i = 0 ; i<8;i++){
                tempAnimals.add(values[i]);
                tempAnimals.add(" | ");
                //System.out.println(values[i]);
            }
        }
        //System.out.println("Lista animales" + tempAnimals);
        return tempAnimals ; 
    }
    
    //Method to get the Employees' list
    public ArrayList<String> getEmployees() throws IOException{
        while( (this.line = brEmployees.readLine()) != null ){
            String [] value = this.line.split(",");
            for (int i = 0; i<5;i++){
                tempEmployees.add(value[i]);
                tempEmployees.add(" | ");
                
            }
        }
        return tempEmployees;
    }
    
    // Method to get the Sets' list
    public ArrayList<String> getSets() throws IOException{
        
        while( (this.line = brSets.readLine() ) != null ){
            String [] value = this.line.split(",");
            for (int i = 0 ; i < 6; i ++){
                this.tempSets.add(value[i]);
                this.tempSets.add(" | ");
            }
        }
        System.out.println(this.tempSets.size());
        return this.tempSets ;
    }

    // Method to return the ArrayList with the name of the Sets
    public ArrayList<String> getLotesArray() throws IOException {
        while( (this.line = brSets.readLine()) != null ){
            String [] value = this.line.split(",");
            String temp =  value[0]; // Temporal to safe the 
            lotesArray.add(temp);
        }
        return lotesArray ;
    }
    
    // Method to return the image's name of the cows
    public String getImage(String Lote) throws IOException{

        String image = "" ; 
        while( (this.line = this.brSets2.readLine() )!= null ){
            String [] value = this.line.split(",");
            this.tempSets.add(value[0]);
            this.tempSets.add(value[5]);
        }

        for(int i = 0 ; i<this.tempSets.size();i++){
            if(Lote.equals(tempSets.get(i))){
                
                image = tempSets.get(i+1);
            }
            
        }
        
        return image ;
    }
    
    // Method to get the Array String with the elements that can be compared with others
    public String [] getComparatives(){
        return Comparatives ;
    }
    
    //Method to get the Properties of one Set 
    public String [] getProperties(String LoteSelected) throws IOException{
        String [] ArrayProperties = new String[6] ;
        
        //Add the elements of the document to the new ArrayList
        int cont = 0;
        while ( (this.line = brSets3.readLine()) != null ){
            cont += 1 ;
            if(cont > 1 ){
                String [] value = this.line.split(",");
                for(int i = 0 ; i < 6 ; i++){
                    ListText.add(value[i]) ;
                }
            }
            
        }
        
        //Do the comparation to find the value that is equal to "LoteSelected"
        for (int i = 0 ; i<ListText.size();i++){
            if( LoteSelected.equals(ListText.get(i)) ){
                System.err.println("Entooooo");
                for(int x = 0 ; x < 6 ; x++){
                   ArrayProperties[x] = ListText.get(i+x) ;
                }
            }
        }
        
        
        return ArrayProperties ; 
    }
    
    public int getQuantityAnimals(String Selected){
        // Return the quantity of the type that user choose
        for(int i = 0 ; i < Quantity.size(); i ++){
            if(Selected.equals(Quantity.get(i))){
                return Integer.parseInt( Quantity.get(i+5) ) ;
            }
        }
        return 0 ;
    }
