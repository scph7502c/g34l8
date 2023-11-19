package org.example;

class UpperCase implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}