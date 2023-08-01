public class InsurancePolicy {
    private User farmer;
    private String cropType;
    private double insuredAmount;

    public InsurancePolicy(User farmer, String cropType, double insuredAmount) {
        this.farmer = farmer;
        this.cropType = cropType;
        this.insuredAmount = insuredAmount;
    }

    // Getters and setters (if required)

    // toString method for debugging and printing insurance policy details
    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "farmer=" + farmer +
                ", cropType='" + cropType + '\'' +
                ", insuredAmount=" + insuredAmount +
                '}';
    }
}
