package org.example;

class LowerCaseFormatter implements TextFormatter {
    @Override
    public String formatText(String text) {
        if (text == null) {
            return "";
        } else {
            return text.toLowerCase();
        }
    }
}