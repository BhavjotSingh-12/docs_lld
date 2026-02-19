package com.bhavjot.doc;

public class TextElement extends DocumentElement {
    String text;

    public TextElement(String text) {
        this.text = text;
    }

    @Override
    String render() {
        return text;
    }
}
