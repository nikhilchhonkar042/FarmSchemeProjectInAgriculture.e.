
// FarmSchemeApp.java (main class)
import java.util.*;

public class FarmSchemeApp {
    private static List<User> users = new ArrayList<>();
    private static List<Crop> crops = new ArrayList<>();
    private static List<Bid> bids = new ArrayList<>();
    private static List<InsurancePolicy> insurancePolicies = new ArrayList<>();

    public static void main(String[] args) {
        // Code for user registration, login, and other functionalities can be added here.
        // For simplicity, we will just add some sample data.

        // Sample Users
        User admin = new User("admin@example.com", "admin@123", UserType.ADMIN);
        users.add(admin);

        User farmer1 = new User("farmer1@example.com", "farmer@123", UserType.FARMER);
        User farmer2 = new User("farmer2@example.com", "farmer@456", UserType.FARMER);
        users.add(farmer1);
        users.add(farmer2);

        User bidder1 = new User("bidder1@example.com", "bidder@123", UserType.BIDDER);
        User bidder2 = new User("bidder2@example.com", "bidder@456", UserType.BIDDER);
        users.add(bidder1);
        users.add(bidder2);

        // Sample Crops
        Crop crop1 = new Crop("Wheat", "Kharif", "Variety1", 1000, 500);
        Crop crop2 = new Crop("Rice", "Rabi", "Variety2", 800, 600);
        crops.add(crop1);
        crops.add(crop2);

        // Sample Bids
        Bid bid1 = new Bid(bidder1, crop1, 550);
        Bid bid2 = new Bid(bidder2, crop2, 700);
        bids.add(bid1);
        bids.add(bid2);

        // Sample Insurance Policies
        InsurancePolicy policy1 = new InsurancePolicy(farmer1, "Kharif", 5000);
        InsurancePolicy policy2 = new InsurancePolicy(farmer2, "Rabi", 6000);
        insurancePolicies.add(policy1);
        insurancePolicies.add(policy2);

        // Additional functionalities can be implemented as required.
        
      
            Scanner scanner = new Scanner(System.in);

            // Code for user registration
            System.out.println("Welcome to Farm Scheme Application!");
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            System.out.print("Enter your user type (ADMIN, FARMER, BIDDER): ");
            String userTypeInput = scanner.nextLine();
            UserType userType = UserType.valueOf(userTypeInput.toUpperCase());

            User currentUser = new User(email, password, userType);
            users.add(currentUser);

            // Code for crop bidding
            if (currentUser.getUserType() == UserType.FARMER) {
                System.out.print("Enter crop name: ");
                String cropName = scanner.nextLine();
                System.out.print("Enter crop type: ");
                String cropType = scanner.nextLine();
                System.out.print("Enter crop variety: ");
                String variety = scanner.nextLine();
                System.out.print("Enter crop quantity: ");
                double quantity = scanner.nextDouble();
                System.out.print("Enter minimum bid amount: ");
                double minBid = scanner.nextDouble();

                Crop newCrop = new Crop(cropName, cropType, variety, quantity, minBid);
                crops.add(newCrop);
                System.out.println("Crop added for bidding: " + newCrop);
            }

            // Code for bid submission
            if (currentUser.getUserType() == UserType.BIDDER) {
                // Assuming there is at least one crop available for bidding
                System.out.println("Available Crops for Bidding:");
                for (Crop crop : crops) {
                    System.out.println(crop);
                }

                System.out.print("Enter the index of the crop you want to bid on: ");
                int cropIndex = scanner.nextInt();
                System.out.print("Enter your bid amount: ");
                double bidAmount = scanner.nextDouble();

                Crop selectedCrop = crops.get(cropIndex);
                Bid newBid = new Bid(currentUser, selectedCrop, bidAmount);
                bids.add(newBid);
                System.out.println("Bid submitted successfully: " + newBid);
            }

            // Code for insurance policy handling (similar user interactions can be added)

            scanner.close();
        
    }
}
