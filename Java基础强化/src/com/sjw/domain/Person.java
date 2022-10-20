package com.sjw.domain;

public class Person {
    private String name;
    private int id;
    private int old;
    public int a;
    public int b;
    public String c;

    public Person() {
    }

    public Person(String name, int id, int old) {
        this.name = name;
        this.id = id;
        this.old = old;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return old
     */
    public int getOld() {
        return old;
    }

    /**
     * 设置
     * @param old
     */
    public void setOld(int old) {
        this.old = old;
    }

    public String toString() {
        return "Person{name = " + name + ", id = " + id + ", old = " + old + "}";
    }
    public void eat(){
        System.out.println("eat");
    }
    public void eat(String food){
        System.out.println(("eat " + food));
    }

}
