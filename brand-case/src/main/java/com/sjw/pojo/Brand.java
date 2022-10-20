package com.sjw.pojo;

public class Brand {
    private String id;
    private String brand_name;
    private String company_name;
    private String ordered;
    private String description;
    private String status;


    public Brand() {
    }

    public String getStatusStr(){
        if (status==null)
            return "未知";
        return status.equals('0')?"禁用":"启用";
    }
    public Brand(String id, String brand_name, String company_name, String ordered, String description, String status) {
        this.id = id;
        this.brand_name = brand_name;
        this.company_name = company_name;
        this.ordered = ordered;
        this.description = description;
        this.status = status;
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
     * @return brand_name
     */
    public String getBrand_name() {
        return brand_name;
    }

    /**
     * 设置
     * @param brand_name
     */
    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    /**
     * 获取
     * @return company_name
     */
    public String getCompany_name() {
        return company_name;
    }

    /**
     * 设置
     * @param company_name
     */
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    /**
     * 获取
     * @return ordered
     */
    public String getOrdered() {
        return ordered;
    }

    /**
     * 设置
     * @param ordered
     */
    public void setOrdered(String ordered) {
        this.ordered = ordered;
    }

    /**
     * 获取
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "Brand{id = " + id + ", brand_name = " + brand_name + ", company_name = " + company_name + ", ordered = " + ordered + ", description = " + description + ", status = " + status + "}";
    }
}
