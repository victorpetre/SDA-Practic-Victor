package exercitiiClase;

public class ShoppingCart {
    private Product[] products;
    private int index;


    public ShoppingCart() {
        this.index = 0;
        this.products = new Product[5];
    }



    public void addProduct(Product product){

if (index  <5) {
    products[index]=product;
    index++;
    System.out.println(product);

} else {

        System.out.println("cart is full");}

    }


}
