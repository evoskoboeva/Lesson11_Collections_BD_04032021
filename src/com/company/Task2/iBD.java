package com.company.Task2;

public interface iBD {

    void AddUser(int ID, String login, String password, String fullName);
    void DeleteUser(int id);
    void DeleteUser(String login);


    String SearchUser (int id);
    String SearchUser(String login);
    void DeleteAllUser();

}
