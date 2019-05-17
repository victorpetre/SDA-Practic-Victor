package exercitiiClase;

public class Product {

        private String name;
        private Double price;
        //constructor:
        public Product(String name, Double price){
            this.name = name;
            this.price = price;
        }
        //setter:
        public String getName(){
            return name;
        }
        public Double getPrice() {
            return price;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setPrice(double price){
            this.price = price;
        }
     public String toString() {
           return name + " -> " + price;
       }

}



