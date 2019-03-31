package popa.catalin.lab2.domain.component;

public class Chassis extends AbstractCarComponent implements CarComponent {
    @Override
    public Long getPrice() {
        return 3000L;
    }
}
