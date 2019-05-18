package ro.ubb.dp1819.examples.behavioural.visitor.shapes;

import ro.ubb.dp1819.examples.behavioural.visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);
}
