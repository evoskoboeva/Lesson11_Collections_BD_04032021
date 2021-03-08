package com.company.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "asd", "123", "Asd");

        BD bd = new BD(3);
        bd.users[1] = user1;
        System.out.println(bd.toString());


        Scanner scanner = new Scanner(System.in);
        int choise = 1;
        while (choise > 0 && choise < 5) {
            System.out.println("выберете: 1. Добавление пользователя\n" +
                    "2. Удаление пользователя\n" +
                    "3. Найти пользователя по логину (вернуть как объект класса User)\n" +
                    "4. Очистить БД \n");
            choise = scanner.nextInt();
            switch (choise) {
                case 1: {
                    while (choise == 1) {
                        System.out.println("1. Добавление пользователя и вывод на экран БД");
                        //метод add сначала ищет по всему массиву свободное поле, если его нет
                        // то добавляется новое после последнего
                        //при добавлении - проверяется id и login на уникальность

                        bd.AddUser(0, "zxc", "12", "ZXC");
                        bd.AddUser(2, "zxb", "12", "ZXC");
                        bd.AddUser(0, "zxc", "12", "ZXC");
                        System.out.println(bd.toString());

                        System.out.println("хотите повторить и посмотреть как не добавятся пользователи с атким же ID или " +
                                "login? 1 - да");
                        choise = scanner.nextInt();
                    }
                    break;

                }
                case 2: {
                    while (choise == 2) {
                        System.out.println("2. Удаление пользователяи вывод на экран БД \n" +
                                "- по ID например 2" +
                                "- по login - например zxc");
                        bd.DeleteUser(2);
                        bd.DeleteUser("zxc");
                        System.out.println(bd.toString());
                        System.out.println("хотите повторить и посмотреть как не удалятся пользователи с атким же ID или " +
                                "login? 2 - да");
                        choise = scanner.nextInt();
                        if (choise != 2) break;

                    }
                }
                case 3: {
                    while (choise == 3) {
                        System.out.println("2. Поиск пользователей по ID и login вывод на экран БД \n" +
                                "- по ID например 1" +
                                "- по login - например zxc");
                        System.out.println(bd.SearchUser(1));
                        System.out.println(bd.SearchUser("zxc"));
                       // System.out.println(bd.toString());
                        System.out.println("хотите повторить и посмотреть поиск? 2 - да");
                        choise = scanner.nextInt();
                        if (choise != 3) break;

                    }
                }
                case 4: {
                    while (choise == 4) {
                        System.out.println("2. Удаление всех пользователей и вывод на экран БД \n");
                        bd.DeleteAllUser();
                        System.out.println(bd.toString());
                        System.out.println("хотите повторить и посмотреть как не удалятся пользователи с атким же ID или " +
                                "login? 2 - да");
                        choise = scanner.nextInt();
                        if (choise != 4) break;

                    }
                }
            }

        }
    }
    }
