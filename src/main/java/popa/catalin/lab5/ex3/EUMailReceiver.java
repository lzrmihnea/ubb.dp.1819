package popa.catalin.lab5.ex3;

public class EUMailReceiver extends AbstractMailReceiver {
    @Override
    public String getRegion() {
        return MailSender.RegionType.eu.name();
    }
}
