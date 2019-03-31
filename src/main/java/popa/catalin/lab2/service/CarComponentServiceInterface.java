package popa.catalin.lab2.service;

import popa.catalin.lab2.domain.component.AbstractCarComponent;

import java.util.List;

public interface CarComponentServiceInterface {
    List<AbstractCarComponent> createComponentsFromStrings(List<String> carInputComponents);
}
