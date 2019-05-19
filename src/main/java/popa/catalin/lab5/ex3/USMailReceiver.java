package popa.catalin.lab5.ex3;

public class USMailReceiver extends AbstractMailReceiver {
    @Override
    public String getRegion() {
        return MailSender.RegionType.usa.name();
    }
}
