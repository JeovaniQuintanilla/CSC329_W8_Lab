
package com.mycompany.csc325_lab;

/**
 *
 * @author soblab
 */
public class Application {
    
    private typeOfClothing clothing;
    private clothingStyle style;
    
    /**
     * methods takes parameter and creates instance of chooseClothing and chooseStyle
     * @param factory
     */
    public Application(SupplyFactory factory){
        clothing = factory.chooseClothing();
        style = factory.chooseStyle();
    }
    
    /**
     * method reveals content
     */
    public void revealContent(){
        style.clothingStyle();
        clothing.typeOfClothing();
    }
    
}
