package org.example;

public class WindowMessage extends Message {
    @Override
    public String getMessage() {
        return "This is class " + WindowMessage.class.getSimpleName();
    }
}