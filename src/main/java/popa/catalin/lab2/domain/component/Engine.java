package popa.catalin.lab2.domain.component;

public class Engine extends AbstractCarComponent implements CarComponent {
    @Override
    public Long getPrice() {
        return 1000L;
    }
}
