package cn.sjw.quickStart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class QuickStartDemo1 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "123456");
        String sql="insert stu values(1,'sjw');";
        Statement statement = connection.createStatement();
        int result = statement.executeUpdate(sql);
        System.out.println(result);
        statement.close();
        connection.close();
    }
}
