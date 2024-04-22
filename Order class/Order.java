/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commercesystem;
public class Order {
    public void printOrderInfo (int customerId , int orderId , Product [] products , float total_price){
        System.out.println("Order ID : "+Math.abs(orderId));
        System.out.println("Customer ID : "+customerId);
        System.out.println("Products : ");
        for (int i=0 ; i<products.length ; i++ ){
            if (products[i]!=null){
                System.out.println(products[i].getname()+"- $"+products[i].getprice());
            }
        }
            System.out.println("Total price : $"+total_price);
    }
}
