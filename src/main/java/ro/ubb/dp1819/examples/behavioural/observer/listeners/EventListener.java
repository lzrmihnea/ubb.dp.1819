package ro.ubb.dp1819.examples.behavioural.observer.listeners;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
