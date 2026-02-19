package com.bhavjot.doc;

public class SaveToDB implements Persistence{
    @Override
    public void save(String text) {
        System.out.println("Saved to DB");
    }
}
