package agiledeveloper.kata.smells;

public class StinkOne {
    private String name;
    private String amount;

    void printOwing() {
        // Print Banner
        System.out.println("*******************************");
        System.out.println("******** Customer Owes ********");
        System.out.println("*******************************");
        
        //print details
        System.out.println("name: " + name);
        System.out.println("amount: " + amount);
    }

}
