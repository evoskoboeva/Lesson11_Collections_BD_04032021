package com.company.Task2;

import java.util.Objects;

public class User  {

    public int[] users;
    Integer ID;
    String login;
    String password;
    String fullName;

    @Override
    public String toString() {
        return
                "ID=" + ID +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +System.lineSeparator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getID() == user.getID() && getLogin().equals(user.getLogin()) && getPassword().equals(user.getPassword()) && Objects.equals(getFullName(), user.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID(), getLogin(), getPassword(), getFullName());
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public User( int ID, String login, String password, String fullName) {
        this.ID = ID;
        this.login = login;
        this.password = password;
        this.fullName = fullName;
    }
}
