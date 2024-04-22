/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commercesystem;
public class Customer {
    int customer_Id;
    String name;
    String address;
    public void setcustomer_Id(int customer_Id){
        this.customer_Id=Math.abs(customer_Id);
    }
    public int getcustomer_Id (){
        return customer_Id;
    }
    public void setname (String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setaddress (String address){
        this.address=address;
    }
    public String getaddress (){
        return address;
    }
}
