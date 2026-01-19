package task_1;

public class ClothingStoreReceipt {
    public static void main(String[] args) {
        
    	String customerName = "Olena";
    	String paymentMethod = "cash";
    	int itemsBought = 2;
    	double itemPrice = 750.2;

        // Calculate here the total cost
    	double totalCost = itemsBought * itemPrice;
        
        // Print purchase details
        System.out.println("Welcome, " + customerName + ", thank you for your purchase!");
        System.out.println("Number of items: " + itemsBought);
        System.out.println("Price per item: " + itemPrice + " UAH.");
        System.out.println("Total cost: " + totalCost + " UAH.");
        System.out.println("Payment method: " + paymentMethod);
    }
}