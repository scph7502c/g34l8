package org.example;

public class ConsoleMessage extends Message {
    @Override
    public String getMessage() {
        return "This is class " + ConsoleMessage.class.getSimpleName();
    }
}