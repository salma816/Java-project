/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commercesystem;
public class Electronic_Product extends Product {
     String brand;
     int warranty_period;
    public void setbrand(String brand){
        this.brand=brand;
    }
    public String getbrand(){
        return brand;
    }
    public void setwarranty_period(int warranty_period){
        this.warranty_period=Math.abs(warranty_period);
    }
    public int getwarranty_period (){
        return warranty_period;
    }
    
}
