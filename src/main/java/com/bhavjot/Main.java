package com.bhavjot;

import com.bhavjot.doc.document.Document;
import com.bhavjot.doc.DocumentEditor;
import com.bhavjot.doc.savedoc.Persistence;
import com.bhavjot.doc.savedoc.SaveToFile;

public class Main {
    public static void main(String[] args) {
        Document document= new Document();
        Persistence persistence = new SaveToFile();
        DocumentEditor documentEditor=new DocumentEditor(document,persistence);

        documentEditor.addText("This is basic Document Editor");
        System.out.println();
        documentEditor.saveToFile();
        documentEditor.addImage("image.pdf");
        System.out.println(documentEditor.renderDocument());
    }
}