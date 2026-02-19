package com.bhavjot.doc;

public class ImageElement extends DocumentElement {
    String imagePath;

    public ImageElement(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    String render() {
        return "Image path: " +imagePath;
    }
}
