package ro.ubb.dp1819.examples.behavioural.mediator;

/**
 * The colleague class
 */
public interface Component {
    void setMediator(Mediator mediator);

    String getName();
}