package popa.catalin.lab3.observer;

public class CIAObserver implements CustomObserver {
    private StringBuilder log = new StringBuilder();

    @Override
    public void recieveMessage(String message) {
        log.append(message).append("\n");
    }

    public String getLog()
    {
        return log.toString();
    }
}
