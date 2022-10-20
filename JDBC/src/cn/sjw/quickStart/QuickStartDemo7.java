package cn.sjw.quickStart;

import cn.sjw.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QuickStartDemo7 {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement sta=null;
        ResultSet resultSet=null;
        try {
            conn= JDBCUtils.getConnection();
            String sql="select * from user where ?='sjw'";
            sta=conn.prepareStatement(sql);
            sta.setString(1,"name");
            resultSet = sta.executeQuery();
            System.out.println(resultSet.next());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(conn,sta,resultSet);
        }

    }
}
