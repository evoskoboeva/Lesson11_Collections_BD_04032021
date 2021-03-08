package com.company.Task2;

import java.util.Arrays;

public class BD implements iBD {
    User[] users;

    @Override
    public String toString() {
        return Arrays.toString(users);
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public BD(int ID) {
        this.users = new User[ID];
    }

    @Override
    public void AddUser(int ID, String login, String password, String fullName) {
        int searchNull = 0;

        if (users.length == 0) {
            users = Arrays.copyOf(users, users.length + 1);
            users[0] = new User(ID, login, password, fullName);
        }

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && ID == (users[i].ID)) {
                System.out.println("ID already exist");
                searchNull = -1;
                break;
            }
            if (users[i] != null && login.equals(users[i].login)) {
                System.out.println("login already exist");
                searchNull = -1;
                break;
            }

            if (users[i] == null) {
                users[i] = new User(ID, login, password, fullName);
                searchNull++;
                break;
            }
        }
        if (searchNull == 0) {
            users = Arrays.copyOf(users, users.length + 1);
            users[users.length - 1] = new User(ID, login, password, fullName);

        }
    }


    @Override
    public String SearchUser(int id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && id == (users[i].ID)) {
                return String.valueOf(users[i]);
            }
        }
        return "no user found";
    }
    @Override
    public String SearchUser(String login) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && login.equals(users[i].login)) {
                return String.valueOf(users[i]);
            }
        }
        return "no user found";
    }

    @Override
    public void DeleteAllUser() {
        for (int i = 0; i < users.length; i++) {
            users[i] = null;
        }
    }
    @Override
    public void DeleteUser(int id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && id == (users[i].ID)) {
                users[i] = null;
            }
        }
    }

    @Override
    public void DeleteUser(String login) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && login.equals(users[i].login)) {
                users[i] = null;
            }
        }
    }
}