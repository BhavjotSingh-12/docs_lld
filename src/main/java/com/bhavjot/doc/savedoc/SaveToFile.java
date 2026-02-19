package com.bhavjot.doc.savedoc;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile implements Persistence{
    @Override
    public void save(String text) {
        try {
            FileWriter outFile = new FileWriter("document.txt");
            outFile.write(text);
            outFile.close();
            System.out.println("Document saved to document.txt");
        } catch (IOException e) {
            System.out.println("Error: Unable to open file for writing.");
        }
    }
}
