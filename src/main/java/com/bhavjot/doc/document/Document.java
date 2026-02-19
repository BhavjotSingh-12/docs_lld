package com.bhavjot.doc.document;

import java.util.ArrayList;
import java.util.List;

public class Document {
    List<DocumentElement> documentElements=new ArrayList<>();


    public void addElement(DocumentElement document){
        documentElements.add(document);
    }

    public String render(){
        StringBuilder result= new StringBuilder();
        for(DocumentElement el:documentElements){
            result.append(el.render());
            result.append(System.lineSeparator());
        }
        return result.toString();
    }
}
