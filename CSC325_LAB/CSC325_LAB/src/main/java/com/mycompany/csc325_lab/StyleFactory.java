
package com.mycompany.csc325_lab;

/**
 *
 * @author quint
 */
public class StyleFactory implements SupplyFactory{

    /**
     * method returns type of clothing
     * @return
     */
    @Override
    public typeOfClothing chooseClothing() {
        return new Tops();
    }

    /**
     * method returns style type
     * @return
     */
    @Override
    public clothingStyle chooseStyle() {
        return new ProfessionalStyle();
    }
    
}
