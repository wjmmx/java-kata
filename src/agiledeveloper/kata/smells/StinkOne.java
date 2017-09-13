package agiledeveloper.kata.smells;

class StinkOne {
    private String name;
    private String amount;
    private int quantity;
    private double itemPrice;

    void printOwing() {
        // Print Banner
        System.out.println("*******************************");
        System.out.println("******** Customer Owes ********");
        System.out.println("*******************************");
        
        //print details
        System.out.println("name: " + name);
        System.out.println("amount: " + amount);
    }

    double calculateTotal() {

        double basePrice = basePrice();
        if (basePrice > 1000) {
            return basePrice * 0.95;
        }
        else {
            return basePrice * 0.98;
        }
    }

    private double basePrice() {
        return quantity * itemPrice;
    }

}
