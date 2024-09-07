public class RewardValue {
    private double cash;
    private int miles;

    public static final double MILES_TO_CASH_RATE = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int)(cash / MILES_TO_CASH_RATE);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = miles * MILES_TO_CASH_RATE;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
}