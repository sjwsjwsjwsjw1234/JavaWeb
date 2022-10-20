package cn.sjw.quickStart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class QuickStartDemo4 {
    public static void main(String[] args) {
        Connection conn=null;
        Statement sta=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql="delete from stu where id=1;";
            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "123456");
            sta=conn.createStatement();
            int count = sta.executeUpdate(sql);
            System.out.println(count);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally{
            if ((sta!=null)) {
                try {
                    sta.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if ((conn!=null)) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
