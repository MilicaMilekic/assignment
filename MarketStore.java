/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketstore;

/**
 *
 * @author Super User
 */
public class MarketStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Card bronze = new Bronze("Milica Milekic");       
        System.out.println(bronze.Total(0, 150));
        
        Card silver = new Silver("Tomislav Milekic");    
        System.out.println(silver.Total(600, 850));
        
        Card gold = new Gold("Ana Prodanovic");
        System.out.println(gold.Total(1500, 1300));
    }
    
}
