package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 4;
        Collection collection = new Collection();

        collection.addByValue(555);
        collection.addByValue(666);
        collection.addByIndex(123,  2);
        System.out.println(collection);



      // collection.DelByValue(1);

        System.out.println(collection);

        //collection.DelAllElements();
        collection.GetSize();

        System.out.println(collection.GetSize());

        System.out.println(collection.GetSearch(666));


    }
}
