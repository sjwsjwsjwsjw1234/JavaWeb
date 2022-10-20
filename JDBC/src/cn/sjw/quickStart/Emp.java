package cn.sjw.quickStart;

import java.util.Date;

public class Emp {
    private int id;
    private String eName;
    private int jobId;
    private int mgr;
    private Date joinDate;
    private double salary;
    private double bonus;
    private int deptId;

    public Emp() {
    }

    public Emp(int id, String eName, int jobId, int mgr, Date joinDate, double salary, double bonus, int deptId) {
        this.id = id;
        this.eName = eName;
        this.jobId = jobId;
        this.mgr = mgr;
        this.joinDate = joinDate;
        this.salary = salary;
        this.bonus = bonus;
        this.deptId = deptId;
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
     * @return eName
     */
    public String getEName() {
        return eName;
    }

    /**
     * 设置
     * @param eName
     */
    public void setEName(String eName) {
        this.eName = eName;
    }

    /**
     * 获取
     * @return jobId
     */
    public int getJobId() {
        return jobId;
    }

    /**
     * 设置
     * @param jobId
     */
    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    /**
     * 获取
     * @return mgr
     */
    public int getMgr() {
        return mgr;
    }

    /**
     * 设置
     * @param mgr
     */
    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    /**
     * 获取
     * @return joinDate
     */
    public Date getJoinDate() {
        return joinDate;
    }

    /**
     * 设置
     * @param joinDate
     */
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    /**
     * 获取
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * 获取
     * @return bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * 设置
     * @param bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * 获取
     * @return deptId
     */
    public int getDeptId() {
        return deptId;
    }

    /**
     * 设置
     * @param deptId
     */
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String toString() {
        return "Emp{id = " + id + ", eName = " + eName + ", jobId = " + jobId + ", mgr = " + mgr + ", joinDate = " + joinDate + ", salary = " + salary + ", bonus = " + bonus + ", deptId = " + deptId + "}";
    }
}
