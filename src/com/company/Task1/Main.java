package com.company.Task1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Collection collection = new Collection();

        collection.addByValue(555);
        collection.addByValue(666);
        collection.addByIndex(123,  2);

        Collection collection1 = new Collection();
        collection1.addByValue(555);
        collection1.addByValue(666);
        collection1.addByValue(123);

        System.out.println("first index "+collection1.GetIndexFirst(666));
        System.out.println(collection1.GetSearch(123));
        System.out.println(collection1.GetSize()+""+collection1.toString());
        System.out.println(collection1.GetIndexLast(666));

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int choise = 1;
        while (choise > 0 && choise < 13) {
            System.out.println("выберете:\n" +
                    "1. Добавить элемент.\n" +
                    "2. Добавить элемент по индексу.\n" +
                    "3. Удалить элемент по индексу.\n" +
                    "4. Очистить коллекцию.\n" +
                    "5. Получить размер коллекции(хвост не считаем).\n" +
                    "6. Проверить, содержится ли элемент в коллекции.\n" +
                    "7. Вернуть копию массива в коллекции (хвост обрезать).\n" +
                    "8. Получить элемент коллекции по индексу.\n" +
                    "9. Получить индекс первого вхождения элемента.\n" +
                    "10.Получить индекс последнего вхождения элемента.\n" +
                    "11.Переопределить метод equals для сравнения с другим объектом этого же класса.\n" +
                    "12.Переопределить метод toString – он возвращает все элементы коллекции в виде строки.\n");

            choise = scanner.nextInt();
            switch (choise) {
                case 1: {
                    while (choise == 1){

                        collection1.addByValue(random.nextInt(1000));
                        System.out.println("1.добавляем рандомный элемент в collection1"+collection1);

                        System.out.println("хотите повторить? 1 - да");
                        choise = scanner.nextInt();
                    }
                    break;

                }
                case 2: {
                    while (choise == 2){

                        collection1.addByIndex(1111,  1);
                        System.out.println("2. Добавить элемент 1111 по индексу 1 + в collection1"+collection1);

                        System.out.println("хотите повторить? 2 - да");
                        choise = scanner.nextInt();
                    }
                    break;

                }
                case 3: {
                    while (choise == 3){

                        collection1.DelByIndex(1);
                        System.out.println("3 удалить элемент  по индексу 1 + в collection1"+collection1);

                        System.out.println("хотите повторить? 3 - да");
                        choise = scanner.nextInt();
                    }
                    break;

                }
                case 4: {
                    while (choise == 4){

                        collection1.DelAllElements();
                        System.out.println("4. Очистить коллекцию. collection1"+collection1);

                        System.out.println("хотите повторить?))))))))) 4 - да");
                        choise = scanner.nextInt();
                    }
                    break;

                }
                case 5: {
                    while (choise == 5){

                        System.out.println("5. Получить размер коллекции. collection1"+collection1.GetSize());

                        System.out.println("хотите повторить?) 5 - да");
                        choise = scanner.nextInt();
                    }
                    break;

                }
                case 6: {
                    while (choise == 6){

                        System.out.println("6. Проверить, содержится ли элемент 666 в коллекции" +
                                " collection"+collection.toString());
                        System.out.println(collection.GetSearch(666));

                        System.out.println("хотите повторить?) 6 - да");
                        choise = scanner.nextInt();
                    }
                    break;

                }
                case 7: {
                    while (choise == 7){

                        System.out.println("7. Вернуть копию массива в коллекции" +
                                " collection1"+collection1);
                        System.out.println(collection1.GetMatrixCopy());

                        System.out.println("хотите повторить?) 7 - да");
                        choise = scanner.nextInt();
                    }
                    break;

                }
                case 8: {
                    while (choise == 8){

                        System.out.println("8. Получить Получить элемент коллекции по индексу 2 - " +
                                " collection1"+collection1.GetElement(2));

                        System.out.println("хотите повторить?) 8 - да");
                        choise = scanner.nextInt();
                    }
                    break;

                }
                case 9: {
                    while (choise == 9){

                        System.out.println("5. Получить индекс первого вхождения элемента 1111 в" +
                                "  collection1"+collection1);
                        System.out.println(collection1.GetIndexFirst(1111));

                        System.out.println("хотите повторить?) 9 - да");
                        choise = scanner.nextInt();
                    }
                    break;

                }
                case 10: {
                    while (choise == 10){

                        System.out.println("10. Получить индекс последнего вхождения элемента 1111 в" +
                                "  collection1"+collection1);
                        System.out.println(collection1.GetIndexLast(1111));

                        System.out.println("хотите повторить?) 10 - да");
                        choise = scanner.nextInt();
                    }
                    break;

                }
                default: {
                    while (choise == 11){

                        System.out.println("сравнение коллекции1 и коллекции -  " +
                                "и что то еще что осталось");
                        System.out.println( "collection "+collection.toString());
                        System.out.println( "collection1 "+collection1.toString());
                        System.out.println(collection.toString().equals(collection1.toString()));

                        System.out.println("хотите повторить?) 11 - да");
                        choise = scanner.nextInt();
                        // System.out.println(collection);
                        // collection.DelByValue(1);
                        //System.out.println(collection);
                        //collection.GetSize();
                        //System.out.println(collection.GetSize());
                        //System.out.println(collection1);
                        //System.out.println(collection.equals(collection1));
                        //System.out.println(collection.GetSize()+""+collection.toString());

                    }
                    break;

                }
            }
        }
    }
}
