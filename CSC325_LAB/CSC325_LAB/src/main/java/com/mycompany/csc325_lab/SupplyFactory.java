
package com.mycompany.csc325_lab;

/**
 *
 * @author Jeovani Quintanilla
 */
public interface SupplyFactory {
    
    /**
     *
     * @return
     */
    typeOfClothing chooseClothing();

    /**
     *
     * @return
     */
    clothingStyle chooseStyle();
    
}
