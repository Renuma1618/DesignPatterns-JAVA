import java.util.ArrayList;
import java.util.List;

class Shoppingcart {
    //2. static instance variables stores single shared obj
    private static Shoppingcart instance;
    private List<String>items;


   // 1.private contructor that cant cretae any new shoppingcart
    private Shoppingcart() {
        items = new ArrayList<>();
    }
    //3. to access
    public static Shoppingcart getInstance() {
        if (instance == null) {
            instance = new Shoppingcart();
        }
        return instance;
    }
    public void addItem(String item) {
        items.add(item);
    }
    public void showItem() {
            System.out.println(items);
    }
}

public class Singleton {
    public static void main(String[] args) {
        Shoppingcart cart1 = Shoppingcart.getInstance();
        Shoppingcart cart2 = Shoppingcart.getInstance();

        cart1.addItem("Laptop");
        cart2.addItem("Mobile");


        cart1.showItem();
        System.out.println(cart1==cart2);
    }
}

//Singleton
//Type: Creational design pattern → helps in object creation.
//Purpose: Create only one instance of a class and share it across multiple parts of the program.
//Benefits:
//Ensures consistency (all parts use the same object).
//Makes code cleaner and more readable.
//Saves memory/resources (no multiple objects).
//Implementation Steps:
//Private constructor → prevents other classes from creating new objects.
//Static variable → stores the single instance of the class.
//Static method → provides global access to the single instance. Every time you call it, it returns the same object.