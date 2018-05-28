package org.gump.study.databaseidprovider;

import org.apache.ibatis.mapping.DatabaseIdProvider;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author yuyongjun
 * @date 2018/5/28 11:07
 */

public class MyDatabaseIdProvider implements DatabaseIdProvider {

    private Properties properties = null;

    @Override
    public void setProperties(Properties p) {
        properties = p;
    }

    @Override
    public String getDatabaseId(DataSource dataSource) throws SQLException{
        String name = dataSource.getConnection().getMetaData().getDatabaseProductName();
        String dbId = (String) this.properties.get(name);
        return dbId;
    }
}
