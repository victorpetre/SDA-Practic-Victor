package exercitiiClase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();
        Product mar = new Product("mar", 3.5);
        Product para = new Product("para", 4.9);
        Product rosie = new Product("rosie", 8.5);
        Product cartof = new Product("cartof", 3.9);
        Product ou = new Product("ou", 1.1);
        Product castr = new Product("castravete", 3.3);

        cart.addProduct(mar);
        cart.addProduct(para);
        cart.addProduct(rosie);
        cart.addProduct(ou);
        cart.addProduct(cartof);

//        Scanner sc = new Scanner(System.in);
//        String nume = sc.nextLine();
        //System.out.println(mar);
       // System.out.println(mar.toString());

    }
}


