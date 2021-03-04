package com.company;

public interface iCollection {

    void addByValue(Integer element);
    void addByIndex(Integer element, int index);
    void DelByValue(int index);
       void DelAllElements();

    Integer GetSize();
    Boolean GetSearch(Integer element);
    Integer[] GetMatrixCopy(Integer[] collection);
    Integer GetElement(int index);
    int GetIndexFirst(Integer element);
    int GetIndexLast(Integer element);



}
