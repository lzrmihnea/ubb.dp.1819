package ro.ubb.dp1819.examples.behavioural.memento.commands;

import java.awt.Color;

import ro.ubb.dp1819.examples.behavioural.memento.editor.Editor;
import ro.ubb.dp1819.examples.behavioural.memento.shapes.Shape;

public class ColorCommand implements Command {
    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}
