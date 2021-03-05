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
public class Bronze extends Card{

    public Bronze(String user) {
        this.user = user;
    }

    @Override
    public String Total(double turnover, double valueOfPurchase) {
        if(turnover < 100) {
             discountRate = 0;
         } else if (turnover >= 100 && turnover <= 300) {
             discountRate = 1;
         } else {
             discountRate = 2.5;
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

   
    

