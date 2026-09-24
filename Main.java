import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { //This class handles all of the main functions of an online store.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 250.00; //The customer's starting balance.
        int cartnum = 0; //The number of items in the customer's cart.
        double cost; //The total cost of the items in the cart. This gets updated after each loop.

        //Creates items to be sold.
        Item tshirt = new Item("T-Shirt", 19.99);
        Item chair = new Item("Chair", 74.99);
        Item sunglasses = new Item("Sunglasses", 14.99);
        Item hat = new Item("Hat", 24.99);
        Item shoes = new Item("Shoes", 59.99);
        Item backpack = new Item("Backpack", 44.99);
        Item watch = new Item("Watch", 49.99);
        Item socks = new Item("Socks", 9.99);
        Item waterbottle = new Item("Water Bottle", 19.99);
        Item wallet = new Item("Wallet", 29.99);

        ArrayList<Item> store = new ArrayList<>(List.of(tshirt, chair, sunglasses, hat, shoes, backpack, watch, socks, waterbottle, wallet)); //Adds the items we created to the list of items to be purchased.
        ArrayList<Item> cart = new ArrayList<>(); //Creates a shopping cart that stores items you want to purchase.


        while (true) { //Main shopping loop.
            cost = 0.00;
            for (int i = 0; i < cart.size(); i++) {
                cost += cart.get(i).getPrice(); //Calculates total cost of items in your cart.
            }

            System.out.printf("Balance: $%.2f | Items in Cart: %d | Total Cost: $%.2f%n", balance, cart, cost); //Prints balance, items in cart, and total cost.

            System.out.print("Continue Shopping?"); 
            if (input.nextLine().equals("no") || input.nextLine().equals("No") || input.nextLine().equals("n") || input.nextLine().equals("N")) { //Determines if the shopping loop continues.
                System.out.print("Checkout?");
                if (input.nextLine().equals("no") || input.nextLine().equals("No") || input.nextLine().equals("n") || input.nextLine().equals("N")) { //Cancels the shopping order.
                    System.out.print("Sorry we didn't have what you were looking for.");
                    break;
                }
                else {
                    if (cost < balance) { //Tried checking out without enough money.
                        System.out.println("Your total cost is more than your current balance.");
                    }
                    else{ //Final checkout
                        System.out.println("Items in Cart: " + cartnum + " | Total Cost: $" + cost);
                        System.out.print("Leftover Balance: $" + (balance - cost));
                        break;
                    }
                }
            }
        }
    }
}
