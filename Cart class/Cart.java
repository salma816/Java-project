/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commercesystem;
public class Cart {
    int customerId;
    int nProducts;
    Product [] products ;
    int productcount=0;
    public void setcustomerId (int customerId){
        this.customerId=Math.abs(customerId);
    }
    public int getcustomerId (){
        return customerId;
    }
    public void setnProducts (int nProducts){
        this.nProducts=Math.abs(nProducts);
        this.products=new Product[this.nProducts];
    }
    public int getnProducts (){
        return nProducts;
    }
    public void setproducts (Product [] products){
        this.products=products;
    }
    public Product [] getproducts (){
        return products;
    }
    public void addProduct (Product product){
        if (productcount <nProducts){
            products [productcount]=product;
            productcount ++;}
        else{
            System.out.println("The cart is full. you cannot add more products");
        }
    }
   public void removeProduct (Product product){
        for (int i=0 ; i<nProducts ; i++){
            if (products[i]==product){
                products[i]=null;
            }
            else{
                System.out.println("This product isnot in the cart");
            }     
    }
    }
    public float calculatePrice (){
        float total_price =0;
        for (int i=0 ; i<nProducts ; i++){
            total_price+=products[i].getprice();
        }
        return total_price;
    }
    public void placeOrder (){
        System.out.println("Here's your order's summary");
    }
    
}
