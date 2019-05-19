package popa.catalin.lab5.ex3;

public class MailReceiverClient {
    public static void main(String[] args) {
        ParallelMailReceiver parallelMailReceiver = new ParallelMailReceiver();

        RegionalMailReceiver EU = new EUMailReceiver();
        RegionalMailReceiver US = new USMailReceiver();

        parallelMailReceiver.addNewReceiver(EU);
        parallelMailReceiver.addNewReceiver(US);
        parallelMailReceiver.stop();
    }
}
