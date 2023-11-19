package org.example;

class UpperCaseFormatter implements TextFormatter {
    @Override
    public String formatText(String text) {
        if (text == null) {
            return "";
        } else {
            return text.toUpperCase();
        }
    }
}