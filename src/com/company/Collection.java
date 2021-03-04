package com.company;

import java.util.Arrays;

public class Collection implements iCollection {

    Integer[] collection;


    @Override
    public String toString() {
        return Arrays.toString(collection);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Collection)) return false;
        Collection that = (Collection) o;
        return Arrays.equals(getCollection(), that.getCollection());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getCollection());
    }

    public Integer[] getCollection() {
        return collection;
    }

    public void setCollection(Integer[] collection) {
        this.collection = collection;
    }

    public Collection() {
        this.collection = new Integer[0];
    }

    @Override
    public void addByValue(Integer element) {
        addByIndex(element, collection.length);
    }

    @Override
    public void addByIndex(Integer element, int index) {
        if (index == 0 && collection.length == 0) {
            collection = new Integer[1];
            collection[0] = element;
        } else {
            if (index <= collection.length && index >= 0) {
                Integer[] temp = Arrays.copyOf(collection, collection.length + 1);

                for (int i = temp.length - 1; i > index; i--) {
                    temp[i] = temp[i - 1];
                }

                temp[index] = element;
                collection = Arrays.copyOf(temp, temp.length);
                //System.out.println(Arrays.toString(collection));
            }
        }
    }

    @Override
    public void DelByValue(int index) {
        if (index < collection.length && index >= 0) {
            Integer[] temp = Arrays.copyOf(collection, collection.length );

            for (int i = index; i < temp.length-1; i++) {
                temp[i] = temp[i+1];
            }


            collection = Arrays.copyOf(temp, temp.length-1);
            // System.out.println(Arrays.toString(collection));
        }


    }



    @Override
    public void DelAllElements() {
        for (int i = 0; i < collection.length; i++) {
            collection[i]=null;

        }
    }


    @Override
    public Integer GetSize() {
        return collection.length;
    }

    @Override
    public Boolean GetSearch(Integer element) {
        int count=0;
        for (int i = 0; i < collection.length; i++) {
            if(element==collection[i]);
             return true;


        }

        return null;
    }

    @Override
    public Integer[] GetMatrixCopy(Integer[] collection) {
        return new Integer[0];
    }

    @Override
    public Integer GetElement(int index) {
        return null;
    }

    @Override
    public int GetIndexFirst(Integer element) {
        return 0;
    }

    @Override
    public int GetIndexLast(Integer element) {
        return 0;
    }


}
