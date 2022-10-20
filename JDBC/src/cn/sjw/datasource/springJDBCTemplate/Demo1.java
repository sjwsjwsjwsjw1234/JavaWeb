package cn.sjw.datasource.springJDBCTemplate;

import cn.sjw.utils.DruidUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        DataSource ds= DruidUtils.getDataSource();
        JdbcTemplate tmp=new JdbcTemplate(ds);
        List<Map<String, Object>> maps = tmp.queryForList("select * from emp");
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }

    }
}
