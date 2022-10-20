package com.sjw.pojo;

public class User {
    private String id;
    private String username;
    private String PASSWORD;
    private String gender;
    private String addr;

    public User() {
    }

    public User(String id, String username, String PASSWORD, String gender, String addr) {
        this.id = id;
        this.username = username;
        this.PASSWORD = PASSWORD;
        this.gender = gender;
        this.addr = addr;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
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

    /**
     * 获取
     * @return PASSWORD
     */
    public String getPASSWORD() {
        return PASSWORD;
    }

    /**
     * 设置
     * @param PASSWORD
     */
    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置
     * @param addr
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String toString() {
        return "User{id = " + id + ", username = " + username + ", PASSWORD = " + PASSWORD + ", gender = " + gender + ", addr = " + addr + "}";
    }
}
