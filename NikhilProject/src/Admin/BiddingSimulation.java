package Admin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Class representing a bidder with a name and bid amount
class Bidder {
    private String name;
    private double bid;

    public Bidder(String name, double bid) {
        this.name = name;
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public double getBid() {
        return bid;
    }

    public void updateBid(double newBid) {
        this.bid = newBid;
    }
}

public class BiddingSimulation {
    // Function to get a random bid between previousBid + 1 and previousBid + 50
    public static double getRandomBid(double previousBid) {
        Random random = new Random();
        return previousBid + random.nextInt(50) + 1;
    }

    // Function to get the top bidders from the list of bidders
    public static List<Bidder> getTopBidders(List<Bidder> bidders, int numBidders) {
        bidders.sort(Comparator.comparingDouble(Bidder::getBid).reversed());
        return bidders.subList(0, Math.min(numBidders, bidders.size()));
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

        System.out.print("Enter the number of bidders for the farmer: ");
        int numBidders = scanner.nextInt();

        System.out.print("Enter the quantity of the crop provided by the farmer: ");
        int quantity = scanner.nextInt();

        // Create the farmer object and bidders list
        List<Bidder> bidders = new ArrayList<>();
        for (int i = 1; i <= numBidders; i++) {
            bidders.add(new Bidder("Bidder " + i, cropPrice * quantity)); // Initial bid same as crop price * quantity
        }

        // Display initial bids for the farmer and bidders
        System.out.println("Initial Bids:");

        System.out.println("\n" + farmerName + "'s Crop " + cropName + " (" + quantity + " units) Bids:");
        for (Bidder bidder : bidders) {
            System.out.println(bidder.getName() + ": Rs " + bidder.getBid());
        }

        // Run the bidding simulation for 4 intervals
        int numIntervals = 4;
        int intervalDuration = 10;
        for (int interval = 0; interval < numIntervals; interval++) {
            // Update bids for all bidders of the farmer
            for (Bidder bidder : bidders) {
                double newBid = getRandomBid(bidder.getBid());
                bidder.updateBid(newBid);
            }

            // Display the top 4 bidders for the farmer's crop at the current interval
            System.out.println("\nBids at Interval " + (interval + 1) + " (Time: " + (interval * intervalDuration) + " seconds):");
            List<Bidder> topBidders = getTopBidders(bidders, 4);
            for (Bidder bidder : topBidders) {
                System.out.println("Bidder: " + bidder.getName() + " | Bid: Rs " + bidder.getBid());
            }

            // Wait for the specified interval duration (in milliseconds) before proceeding to the next interval
            try {
                Thread.sleep(intervalDuration * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Close the scanner
        scanner.close();
    }
}

