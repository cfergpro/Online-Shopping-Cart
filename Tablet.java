class Tablet extends Technology {
    // ENCAPSULATION: private tablet-specific field
    private double screenSize; 

    public Tablet(String name, double price, int warrantyMonths, double screenSize) {
        // INHERITANCE: passes data up to the Technology constructor
        super(name, price, warrantyMonths); 
        this.screenSize = screenSize;
    }

    // Getter for the encapsulated screen size variable
    public double getScreenSize() { 
        return screenSize; 
    }

    // METHOD OVERRIDING: Re-overriding the description to include tablet specs
    @Override
    public String getDescription() {
        return super.getDescription() + " | Screen: " + screenSize + " inches";
    }
}
