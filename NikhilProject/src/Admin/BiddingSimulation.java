package Admin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import BidderEntity.BidderEntity;

public class BiddingSimulation {
    // Function to get a random bid between previousBid + 1 and previousBid + 50
    public static double getRandomBid(double previousBid) {
        Random random = new Random();
        return previousBid + random.nextInt(50) + 1;
    }

    // Function to get the top BidderEntitys from the list of BidderEntitys
    public static List<BidderEntity> getTopBidderEntitys(List<BidderEntity> BidderEntitys, int numBidderEntitys) {
        BidderEntitys.sort(Comparator.comparingDouble(BidderEntity::getBid).reversed());
        return BidderEntitys.subList(0, Math.min(numBidderEntitys, BidderEntitys.size()));
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt for crop details
        System.out.print("Enter the name of the crop: ");
        String cropName = scanner.nextLine();

        System.out.print("Enter the price of the crop: Rs ");
        double cropPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        // Prompt for farmer details
        System.out.print("Enter the name of the farmer: ");
        String farmerName = scanner.nextLine();

        System.out.print("Enter the number of BidderEntitys for the farmer: ");
        int numBidderEntitys = scanner.nextInt();

        System.out.print("Enter the quantity of the crop provided by the farmer: ");
        int quantity = scanner.nextInt();

        // Create the farmer object and BidderEntitys list
        List<BidderEntity> BidderEntitys = new ArrayList<>();
        for (int i = 1; i <= numBidderEntitys; i++) {
            BidderEntitys.add(new BidderEntity("BidderEntity " + i, cropPrice * quantity)); // Initial bid same as crop price * quantity
        }

        // Display initial bids for the farmer and BidderEntitys
        System.out.println("Initial Bids:");

        System.out.println("\n" + farmerName + "'s Crop " + cropName + " (" + quantity + " units) Bids:");
        for (BidderEntity BidderEntity : BidderEntitys) {
            System.out.println(BidderEntity.getName() + ": Rs " + BidderEntity.getBid());
        }

        // Run the bidding simulation for 4 intervals
        int numIntervals = 4;
        int intervalDuration = 10;
        for (int interval = 0; interval < numIntervals; interval++) {
            // Update bids for all BidderEntitys of the farmer
            for (BidderEntity BidderEntity : BidderEntitys) {
                double newBid = getRandomBid(BidderEntity.getBid());
                BidderEntity.updateBid(newBid);
            }

            // Display the top 4 BidderEntitys for the farmer's crop at the current interval
            System.out.println("\nBids at Interval " + (interval + 1) + " (Time: " + (interval * intervalDuration) + " seconds):");
            List<BidderEntity> topBidderEntitys = getTopBidderEntitys(BidderEntitys, 4);
            for (BidderEntity BidderEntity : topBidderEntitys) {
                System.out.println("BidderEntity: " + BidderEntity.getName() + " | Bid: Rs " + BidderEntity.getBid());
            }

            // Wait for the specified interval duration (in milliseconds) before proceeding to the next interval
            try {
                Thread.sleep(intervalDuration * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // After the simulation ends, determine the winning BidderEntity and store the sold crop details in the database
        List<BidderEntity> topBidderEntitys = getTopBidderEntitys(BidderEntitys, 4);
        BidderEntity winningBidderEntity = topBidderEntitys.get(0); // Assuming the top BidderEntity is the winner

        
        /*
        // Store the sold crop details in the database using AdminDAO
        SoldCrop soldCrop = new SoldCrop(crop.getCropId(), winningBidderEntity.getId(), winningBidderEntity.getBid()); // Replace winningBidderEntity.getId() with the actual BidderEntityId
        adminDAO.addSoldCrop(soldCrop);

        // Update the admin's balance based on the sold crop price
        Admin admin = adminDAO.getAdminById(adminId); // Replace adminId with the actual adminId
        double newBalance = admin.getBalance() + soldCrop.getSoldPrice();
        admin.setBalance(newBalance);
        adminDAO.updateAdmin(admin);
*/
        // Close the scanner
        scanner.close();
    }
}
