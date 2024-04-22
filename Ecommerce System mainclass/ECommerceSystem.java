/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e.commercesystem;
import java.util.Scanner;
public class ECommerceSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the E-commerce System!");
        Scanner input=new Scanner(System.in);
        Electronic_Product product1=new Electronic_Product();
        product1.setname ("smartphone");
        product1.setproductId(1);
        product1.setprice(599.99f);
        product1.setbrand("Samsung");
        product1.setwarranty_period(1);
        Clothing_Product product2=new Clothing_Product();
        product2.setname("T-shirt");
        product2.setproductId(2);
        product2.setprice(19.99f);
        product2.setsize("Medium");
        product2.setfabric("Cotton");
        Book_Product product3 =new Book_Product();
        product3.setname("OOP");
        product3.setproductId(3);
        product3.setprice(39.99f);
        product3.setauthor("O'Reilly");
        product3.setpublisher("X Publications");
        Customer data=new Customer();
        System.out.println("Please enter your id");
        int id =input.nextInt();
        input.nextLine();
        data.setcustomer_Id(id);
        System.out.println("Please enter your name");
        String Name=input.nextLine();
        data.setname(Name);
        System.out.println("Please enter your address");
        String Address=input.nextLine();
        data.setaddress(Address);
        Cart productcart=new Cart();
        Order order=new Order();
        productcart.setcustomerId(id);
        System.out.println("How many products you want to add to your cart");
        int num=input.nextInt();
        productcart.setnProducts(num);
        for (int i=0; i<num ; i++){
            System.out.println("Which product would you like to add? 1-Smartphone 2-T-shirt 3-OOP ");
            int choice=input.nextInt();
            switch(choice){
                case 1:
                    productcart.addProduct(product1);
                    break;
                case 2:
                    productcart.addProduct(product2);
                    break;
                case 3:
                    productcart.addProduct(product3);
                    break;
                default:
                    System.out.println("Invalid choice please choose from product 1 or 2 or 3");
                    i--;
            }
        }
        System.out.println("Your total is $"+productcart.calculatePrice()+". Would you like to place the order? 1- Yes  2- No");
        int PlaceOrderChoice=input.nextInt();
        if (PlaceOrderChoice==1){
            productcart.placeOrder();
            order.printOrderInfo(data.getcustomer_Id(),1 , productcart.getproducts(),productcart.calculatePrice()); 
        }
        else if (PlaceOrderChoice==2){
            System.out.println("Do you want to remove any item from the cart? 1-Yes  2-No");
            int y=input.nextInt();
            if (y==1){
                System.out.println("How many products you want to remove?");
                int d=input.nextInt();
            for(int i=0; i<d; i++){
                System.out.println("choose the product you want to remove 1-Smartphone  2-T-shirt  3-OOP");
                int x=input.nextInt();
                switch (x){
                    case 1:
                        productcart.removeProduct(product1);
                        break;
                    case 2:
                        productcart.removeProduct(product2);
                        break;
                    case 3:
                        productcart.removeProduct(product3);
                        break;
                    default:
                        System.out.println("Invalid index");
                }
            }
                System.out.println("The products After the removing");
                Product[]products=productcart.getproducts();
                for(int j=0 ; j<products.length ; j++){
                    if (products[j] != null){
                        System.out.println(products[j].getname()+"-"+products[j].getprice());}
                    }
            }
                    else if (y==2){
                        System.out.println("Thank you for shopping with us");
                    }
                    else{
                        System.out.println("Invalid choice please try again");
                    }
        }
    }
}
                
            
        
   
                
            
            
        
                    
            