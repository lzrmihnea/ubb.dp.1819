package popa.catalin.lab2.domain.component;

public class Paint extends AbstractCarComponent implements CarComponent {
    @Override
    public Long getPrice() {
        return 10L;
    }
}
