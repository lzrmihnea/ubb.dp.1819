package ro.ubb.dp1819.examples.behavioural.memento.history;

import ro.ubb.dp1819.examples.behavioural.memento.editor.Editor;

public class Memento {
    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}
