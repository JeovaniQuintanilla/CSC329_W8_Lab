
package com.mycompany.csc325_lab;

/**
 *
 * @author quint
 */
public class Driver {
    /**
     * methods returns app
     * @return 
     */
    
    private static Application configureApplication(){
    Application app;
    SupplyFactory factory;
    
    String printName = "Check the config for shirt";
    
  if (printName.contains("shirt")) {
            factory = new StyleFactory();
            app = new Application(factory);
    } else {
        factory = new ClothingFactory();
            app = new Application(factory);
      }
        
      return app;
    }
    
    /**
     * main method to test methods
     * @param args
     */
    public static void main(String[] args) {
       Application app = configureApplication();
        app.revealContent(); 
    }




}
      

