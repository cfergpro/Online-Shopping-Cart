class Technology extends Item {
// Encapsulation: private variable only accessable by the getter method
private int warrantyMonths;

public Technology(String name, double price, int warrantyMonths) {
// Inheritance: using "super" to send the name and price to the parent class item
super(name, price);
this.warrantyMonths = warrantyMonths;
}
// getter to get the encapsula data member warrantyMonths
public int getWarrantyMonths () {
  return warrantyMonths;
}
  // Method overriding 
@Override
public String getDescription () {
  return "[Tech]" + getName() + "($" + String.format("%.2f", getPrice())
    }
}
