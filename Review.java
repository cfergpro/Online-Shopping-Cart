public class Review {
    private Item item;
    private int rating;
    private String feedback;

    // Constructor
    public Review(Item item, int rating, String feedback) {
        this.item = item;
        this.rating = rating;
        this.feedback = feedback;
    }

    // Display product review
    public void displayReview() {
        System.out.println("Product: " + item.getName());
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Feedback: " + feedback);

        if (rating >= 4) {
            System.out.println("Good product!");
        } else if (rating == 3) {
            System.out.println("Average product.");
        } else {
            System.out.println("Needs improvement.");
        }

        System.out.println("--------------------");
    }
}


