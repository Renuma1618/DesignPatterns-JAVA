
interface Payment {
    void pay(int amount);
}


class CreditCard implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid using Credit Card: " + amount);
    }
}


class DebitCard implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid using Debit Card: " + amount);
    }
}


class ShoppingCart {
    private Payment paymentType;

    public void setPaymentType(Payment type) {
        this.paymentType = type;
    }

    public void checkout(int amount) {
        paymentType.pay(amount);
    }
}


public class Strategy {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();


        cart.setPaymentType(new CreditCard());
        cart.checkout(1000);


        cart.setPaymentType(new DebitCard());
        cart.checkout(3000);
    }
}
//The Strategy Pattern is one of the behavioral design patterns in software engineering. It is used when:
//You have multiple ways to perform an action (algorithm) in a program.
//You want to switch algorithms dynamically at runtime without changing the code of the client.
//You want to encapsulate algorithms to make code cleaner and easier to maintain.