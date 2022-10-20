package cn.sjw.quickStart;

import cn.sjw.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class QuickStartDemo6 {
    public static void main(String[] args) {
        Statement sta=null;
        ResultSet rs=null;
        Connection conn=null;
        try {
            String sql="select * from emp;";
            ArrayList<Emp> emps=new ArrayList<>();
            conn= JDBCUtils.getConnection();
            sta = conn.createStatement();
            rs = sta.executeQuery(sql);
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
            JDBCUtils.close(conn,sta,rs);
        }

    }
}
