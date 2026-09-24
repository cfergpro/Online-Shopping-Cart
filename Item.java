public class Item { //This class creates items for the online store.
    private final String name; double price; //Initializes a name and price for each item to be made.

    public Item(String name, double price) { //Constructs the item using the provided name and price.
        this.name = name;
        this.price = price;
    }

    public String getName() { //Returns the name of the target item.
        return name;
    }

    public double getPrice() { //Returns the price of the target item.
        return price;
    }
}
