package cn.sjw.datasource.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo1 {
    public static void main(String[] args) throws Exception {
        InputStream in = DruidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
        Properties pro = new Properties();
        pro.load(in);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
        Connection conn=dataSource.getConnection();
        System.out.println(conn);

    }
}
