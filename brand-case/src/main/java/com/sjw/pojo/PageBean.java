package com.sjw.pojo;

import java.util.List;

public class PageBean<T> {
    private int length;
    private List<T> row;

    public PageBean() {
    }

    public PageBean(int length, List<T> row) {
        this.length = length;
        this.row = row;
    }

    /**
     * 获取
     * @return length
     */
    public int getLength() {
        return length;
    }

    /**
     * 设置
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * 获取
     * @return row
     */
    public List<T> getRow() {
        return row;
    }

    /**
     * 设置
     * @param row
     */
    public void setRow(List<T> row) {
        this.row = row;
    }

    public String toString() {
        return "PageBean{length = " + length + ", row = " + row + "}";
    }
}
