package org.example.memento;

import java.util.Deque;
import java.util.LinkedList;

public class Editor {
    private Deque<TextArea.Memento> stateHistory;
    private TextArea textArea;

    public Editor(){
        stateHistory = new LinkedList<>();
        textArea = new TextArea();
    }

    public String getText() {
        return textArea.getText();
    }

    public void write(String text){
        textArea.set(text);
        stateHistory.push(textArea.takeSnapshot());
    }

    public void undo(){
        if (stateHistory.size() > 1) {
            stateHistory.pop();
            textArea.restore(stateHistory.peek());
        }
    }
}
