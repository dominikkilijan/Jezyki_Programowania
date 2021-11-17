package com.company;

public class Users {

    String user;
    String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




    public String getUser() {
        return user;
    }

    public void setUser(String username) {
        user = username;

    }

    public Users(String login, String pass) {
        setUser(login);
        setPassword(pass);

        }
}



