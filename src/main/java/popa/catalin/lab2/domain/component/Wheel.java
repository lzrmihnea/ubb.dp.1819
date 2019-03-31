package popa.catalin.lab2.domain.component;

public class Wheel extends AbstractCarComponent implements CarComponent {
    @Override
    public Long getPrice() {
        return 1L;
    }
}
