package Admin;

public class AdminEntity {
    private long accountId;
    private long farmerId;
    private long bidderId;
    private double balance;

    public AdminEntity(long accountId, long farmerId, long bidderId, double balance) {
        this.accountId = accountId;
        this.farmerId = farmerId;
        this.bidderId = bidderId;
        this.balance = balance;
    }

    // Getters and Setters
    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(long farmerId) {
        this.farmerId = farmerId;
    }

    public long getBidderId() {
        return bidderId;
    }

    public void setBidderId(long bidderId) {
        this.bidderId = bidderId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
