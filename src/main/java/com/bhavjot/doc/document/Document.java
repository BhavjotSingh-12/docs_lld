package com.bhavjot.doc;

import java.util.ArrayList;
import java.util.List;

public class Document {
    List<DocumentElement> documentElements=new ArrayList<>();


    void addElement(DocumentElement document){
        documentElements.add(document);
    }

    String render(){
        StringBuilder result= new StringBuilder();
        for(DocumentElement el:documentElements){
            result.append(el.render());
            result.append(System.lineSeparator());
        }
        return result.toString();
    }
}
