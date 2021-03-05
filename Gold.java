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
public class Gold extends Card{

    public Gold(String user) {
        this.user = user;
    }
    

    @Override
    public String Total(double turnover, double valueOfPurchase) {
        discountRate = 2;
        
        int firstDigit = (int)turnover / 100;
        
        if (firstDigit >= 1 && firstDigit <= 8) {
            discountRate += firstDigit;
        } else if(firstDigit >= 9) {
            discountRate = 10;
        } else {
            discountRate = 2;
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
