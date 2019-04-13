package ro.ubb.dp1819.lab3.behavioral.mediator.stock_broker;

public class StockBroker extends Broker {
    private String name;
    public StockBroker(String brokerName, IMediator newMediator) {
        super(newMediator);
        this.name = brokerName;
        System.out.println(this.name + " signed up with the stockexchange\n");
    }
}
