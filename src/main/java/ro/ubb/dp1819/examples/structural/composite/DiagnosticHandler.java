package ro.ubb.dp1819.examples.structural.composite;

/**
 * Class for Chain of Responsibility pattern example
 */
public abstract class DiagnosticHandler {
    private DiagnosticHandler next;

    public DiagnosticHandler() {
    }

    public void setNext(DiagnosticHandler next) {
        this.next = next;
    }

    public void diagnostic() {
        if (this.next != null) {
            this.next.diagnostic();
        }
    }
}