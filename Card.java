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
public class Card {
    public String user;
    public double valueOfPurchase;
    public double turnover;
    public double discountRate;
    public double discount;
    public double total;
    
    
    
    public String Total(double turnover, double valueOfPurchase) {
        this.turnover = turnover;
        this.valueOfPurchase = valueOfPurchase;
        
        return "Value of purchase: " + valueOfPurchase + "$\n" + "Discount rate: " + discountRate + "%\n" 
                + "Discount: " + discount + "$\n" + "Total: " + total + "$"; 
    }
    
}
