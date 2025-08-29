interface Product{
    void showProduct();
}
class Book implements Product{
    public void showProduct(){
        System.out.println("Book created");
    }
}
class Laptop implements Product{
    public void showProduct(){
        System.out.println("Laptop created");
    }
}
class ProductFactory{
   public static Product createProduct(String type){
       if(type.equalsIgnoreCase("Laptop")){
           return new Laptop();
       }else if(type.equalsIgnoreCase("Book")){
           return new Book();
       }
       return null;
   }
}
public class Factory{
    public static void main(String[] args){
        Product product1 = ProductFactory.createProduct("Laptop");
        Product product2 = ProductFactory.createProduct("Book");
        product1.showProduct();
        product2.showProduct();
    }
}

//A Creational Design Pattern that provides a way to create objects without exposing the creation logic to the client.
//The client only knows what type of object it wants, not how it is created.
//To centralize object creation.
//To make the code cleaner and easier to extend.
//To avoid messy if-else or switch statements scattered across the code.