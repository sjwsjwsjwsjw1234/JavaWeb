package cn.sjw.datasource.druid;

import cn.sjw.quickStart.Emp;
import cn.sjw.utils.DruidUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DruidDemo2 {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement =null;
        ResultSet rs = null;
        try {
            connection = DruidUtils.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery("select * from emp");
            ArrayList<Emp> emps=new ArrayList<>();
            while (rs.next()){
                Emp emp = new Emp();
                emp.setId(rs.getInt(1));
                emp.setEName(rs.getString(2));
                emp.setJobId(rs.getInt(3));
                emp.setMgr(rs.getInt(4));
                emp.setJoinDate(rs.getDate(5));
                emp.setSalary(rs.getDouble(6));
                emp.setBonus(rs.getDouble(7));
                emp.setDeptId(rs.getInt(8));
                emps.add(emp);
            }
            for (Emp emp : emps) {
                System.out.println(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DruidUtils.close(rs,statement,connection);
        }

    }
}
