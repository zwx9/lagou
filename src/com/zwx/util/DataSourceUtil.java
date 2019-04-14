package com.zwx.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

public class DataSourceUtil {

    public static DataSource getDataSourceWithC3P0ByConfig() {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("zwx");
        return comboPooledDataSource;
    }



}
