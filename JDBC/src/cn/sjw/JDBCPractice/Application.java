package cn.sjw.JDBCPractice;

import cn.sjw.utils.JDBCUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Application {
    private static Scanner s=null;
    private static Statement sta=null;
    static{
        s=new Scanner(System.in);
        try {
            sta= JDBCUtils.getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        while(true){
            show();
            System.out.print("请输入选项:");
            String x = s.nextLine();
            switch (Integer.valueOf(x)){
                case 1->register();
                case 2->login();
                default -> System.exit(1);
            }
        }
    }
    public static void show(){
        System.out.println("----------------------------------------");
        System.out.println("1.注册");
        System.out.println("2.登录");
        System.out.println("3.退出");
        System.out.println("----------------------------------------");
    }
    public static void register(){
        System.out.print("user:");
        String user = Application.s.nextLine();
        System.out.print("password:");
        String password = Application.s.nextLine();
        String sql="insert into user values(NULL,'"+user+"','"+password+"')";
        try {
            sta.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("注册成功");
    }
    public static void login(){
        System.out.print("user:");
        String user = s.nextLine();
        System.out.print("password:");
        String password =s.nextLine();
        String sql="select * from user where name='" +user+ "' and password='" +password+"'";
        //System.out.println(sql);
        try {
            ResultSet resultSet = sta.executeQuery(sql);
            if (resultSet.next()){
                System.out.println("登录成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
