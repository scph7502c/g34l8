package org.example;

class LowerCase implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}