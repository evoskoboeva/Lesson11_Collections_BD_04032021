package com.company.Task1;

public interface iCollection {

    void addByValue(Integer element);                //1.Добавить элемент.
    void addByIndex(Integer element, int index);     //2. Добавить элемент по индексу.
    void DelByIndex(int index);                      //3. Удалить элемент по индексу.
       void DelAllElements();                        //4. Очистить коллекцию.

    Integer GetSize();                               //5. Получить размер коллекции(хвост не считаем).
    Boolean GetSearch(Integer element);              //6. Проверить, содержится ли элемент в коллекции.
    String GetMatrixCopy();   //7. Вернуть копию массива в коллекции (хвост обрезать).
    Integer GetElement(int index);                   //8. Получить элемент коллекции по индексу.
    int GetIndexFirst(Integer element);              //9. Получить индекс первого вхождения элемента.
    int GetIndexLast(Integer element);              //10.Получить индекс последнего вхождения элемента.

    boolean equals(Collection [] element);
    String toString();






}
