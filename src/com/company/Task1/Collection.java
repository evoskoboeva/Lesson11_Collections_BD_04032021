package com.company.Task1;

import java.util.Arrays;

public class Collection implements iCollection {

    Integer[] collection;


    @Override
    public String toString() {
        return Arrays.toString(collection);
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
            }
        }
    }

    @Override
    public void DelByIndex(int index) {
        if (index < collection.length && index >= 0) {
            Integer[] temp = Arrays.copyOf(collection, collection.length);

            for (int i = index; i < temp.length - 1; i++) {
                temp[i] = temp[i + 1];
            }
            collection = Arrays.copyOf(temp, temp.length - 1);
        }
    }


    @Override
    public void DelAllElements() {
        for (int i = 0; i < collection.length; i++) {
            collection[i] = null;

        }
        collection = Arrays.copyOf(collection, 0);
    }


    @Override
    public Integer GetSize() {

        return collection.length;
    }

    @Override
    public Boolean GetSearch(Integer element) {
        for (int i = 0; i < collection.length; i++) {
            if (element == collection[i]) ;
            return true;
        }
        return null;
    }

    @Override
    public String GetMatrixCopy() {

        Integer[] temp = Arrays.copyOf(collection, collection.length);

        return   Arrays.toString(temp);
    }


    @Override
    public Integer GetElement(int index) {
        return collection[index];
    }

    @Override
    public int GetIndexFirst(Integer element) {
        int result = 999;
        if (GetSearch(element) == true) {
            for (int index = 0; index < collection.length; index++) {
                if (this.collection[index].equals(element)) {
                    result = index;
                    break;
                }

            }
        }
                return result;
    }

    @Override
    public int GetIndexLast(Integer element) {
        int result = 999;
        if (GetSearch(element)==true){
            for (int i = collection.length-1; i > 0; i--) {
                if (element.equals(collection[i])){
                    result = i;
                    break;
                }

            }
        }

       // (result == 999? " no element in collection" : return result);
        return result;
    }

    @Override
    public boolean equals(Collection[] collection) {

            boolean result = false;
            if (this.collection.length == collection.length) {
                for (int i = 0; i < collection.length; i++) {
                    if (!this.collection[i].equals(collection[i])) { return false; }
                }
                result = true;

            }

            return result;
        }
    }



