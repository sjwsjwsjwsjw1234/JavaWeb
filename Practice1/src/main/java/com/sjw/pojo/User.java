package com.sjw.pojo;

public class User {
    private String password;
    private String username;


    public User() {
    }

    public User(String password, String username) {
        this.password = password;
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    public String toString() {
        return "User{password = " + password + ", username = " + username + "}";
    }
}
