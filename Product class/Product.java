/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commercesystem;
public class Product {
    protected int productId;
    protected String name;
    protected float price;
    public void setproductId(int productId){
        this.productId=Math.abs(productId);
    }
    public int getproductId(){
        return productId;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setprice(float price){
        this.price=Math.abs(price);
    }
    public float getprice(){
        return price;
    }
    
}
