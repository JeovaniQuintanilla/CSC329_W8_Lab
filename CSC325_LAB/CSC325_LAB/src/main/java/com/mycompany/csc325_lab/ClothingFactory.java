
package com.mycompany.csc325_lab;

/**
 *
 * @author quint
 */
public class ClothingFactory implements SupplyFactory{

    /**
     * method returns type of clothing
     * @return
     */
    @Override
    public typeOfClothing chooseClothing() {
        return new Pants();
    }

    /**
     * method returns style type
     * @return
     */
    @Override
    public clothingStyle chooseStyle() {
        return new CasualStyle();
    }
    
}
