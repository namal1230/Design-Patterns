package org.example.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("Like and");
        editor.write("Like and Subscribe");
        editor.undo();
        System.out.println(editor.getText());
    }
}
