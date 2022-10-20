package cn.sjw.quickStart;

import java.sql.*;
import java.util.ArrayList;

public class QuickStartDemo5 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement sta=null;
        ArrayList<Emp> emps=new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "123456");
            sta=conn.createStatement();
            String sql="select * from emp";
            ResultSet rs = sta.executeQuery(sql);
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

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (sta!=null){
                try {
                    sta.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
