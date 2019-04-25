package ro.ubb.dp1819.lab3.behavioral.strategy.billing;

// Normal billing strategy (unchanged price)
class NormalHourStrategy
        implements BillingStrategy {

    @Override
    public double getActPrice
            (double rawPrice) {
        return rawPrice;
    }
}