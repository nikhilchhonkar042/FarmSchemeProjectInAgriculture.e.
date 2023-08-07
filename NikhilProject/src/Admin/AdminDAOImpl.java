package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/*
// Ensure you have the import statements for the Crop and SoldCrop classes
import your.package.name.of.admin.Crop;
import your.package.name.of.admin.Bid;
import your.package.name.of.admin.SoldCrop;
*/
public abstract class AdminDAOImpl implements AdminDAO {
    private Connection connection;

    // Implement the constructor to set up the connection
    public AdminDAOImpl() {
        try {
            // Replace "your_database_url", "your_username", and "your_password" with your actual database credentials
            String url = "your_database_url";
            String username = "your_username";
            String password = "your_password";
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to add a new crop to the database
    @Override
    public void addCrop(Crop crop) {
        try {
            String query = "INSERT INTO crops (cropId, cropName, cropPrice) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, crop.getCropId());
            statement.setString(2, crop.getCropName());
            statement.setDouble(3, crop.getCropPrice());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to get a crop by its ID from the database
    @Override
    public Crop getCropById(int cropId) {
        try {
            String query = "SELECT cropId, cropName, cropPrice FROM crops WHERE cropId = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, cropId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String cropName = resultSet.getString("cropName");
                double cropPrice = resultSet.getDouble("cropPrice");
                return new Crop(cropId, cropName, cropPrice);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Method to get all crops from the database
    @Override
    public List<Crop> getAllCrops() {
        List<Crop> crops = new ArrayList<>();
        try {
            String query = "SELECT cropId, cropName, cropPrice FROM crops";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int cropId = resultSet.getInt("cropId");
                String cropName = resultSet.getString("cropName");
                double cropPrice = resultSet.getDouble("cropPrice");
                crops.add(new Crop(cropId, cropName, cropPrice));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return crops;
    }

    // Method to add a new bid to the database
    @Override
    public void addBid(Bid bid) {
        try {
            String query = "INSERT INTO bids (bidderId, cropId, bidAmount) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, bid.getBidderId());
            statement.setInt(2, bid.getCropId());
            statement.setDouble(3, bid.getBidAmount());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to get the top bids for a crop from the database
    @Override
    public List<Bid> getTopBidsForCrop(int cropId, int numberOfBids) {
        List<Bid> topBids = new ArrayList<>();
        try {
            String query = "SELECT bidderId, bidAmount FROM bids WHERE cropId = ? ORDER BY bidAmount DESC LIMIT ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, cropId);
            statement.setInt(2, numberOfBids);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int bidderId = resultSet.getInt("bidderId");
                double bidAmount = resultSet.getDouble("bidAmount");
                topBids.add(new Bid(bidderId, cropId, bidAmount));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return topBids;
    }

    // Method to add a sold crop to the history in the database
    @Override
    public void addSoldCrop(SoldCrop soldCrop) {
        try {
            String query = "INSERT INTO sold_crops (cropId, bidderId, soldPrice) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, soldCrop.getCropId());
            statement.setInt(2, soldCrop.getBidderId());
            statement.setDouble(3, soldCrop.getSoldPrice());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to get all sold crops from the database
    @Override
    public List<SoldCrop> getAllSoldCrops() {
        List<SoldCrop> soldCrops = new ArrayList<>();
        try {
            String query = "SELECT cropId, bidderId, soldPrice FROM sold_crops";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int cropId = resultSet.getInt("cropId");
                int bidderId = resultSet.getInt("bidderId");
                double soldPrice = resultSet.getDouble("soldPrice");
                soldCrops.add(new SoldCrop(cropId, bidderId, soldPrice));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soldCrops;
    }
}
    // Close the database connection when the object is garbage collected
    
