package com.bhavjot.doc;

import com.bhavjot.doc.document.Document;
import com.bhavjot.doc.document.ImageElement;
import com.bhavjot.doc.document.TextElement;
import com.bhavjot.doc.savedoc.Persistence;

public class DocumentEditor {
    private Document document;
    private Persistence persistence;

    public DocumentEditor(Document document, Persistence persistence) {
        this.document = document;
        this.persistence = persistence;
    }

    public void addText(String text){
        document.addElement(new TextElement(text));
    }

    public void addImage(String imagePath){
        document.addElement(new ImageElement(imagePath));
    }
    public String renderDocument() {
        return document.render();
    }
    public void saveToFile(){
        persistence.save(document.render());
    }
}
