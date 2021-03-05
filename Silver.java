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
public class Silver extends Card{
    
    public Silver (String user) {
        this.user = user;
    }
    
    
    @Override
    public String Total(double turnover, double valueOfPurchase) {
        
        discountRate = 2;
        
        if(turnover > 300) {
             discountRate = 3.5;
         }
         
         discount = valueOfPurchase * (discountRate / 100) ;
         if(discount > 0) {
             total = valueOfPurchase - discount;
         } else {
             total = valueOfPurchase;
         }
        
        return super.Total(turnover, valueOfPurchase); 
    }
    
    
    
}
