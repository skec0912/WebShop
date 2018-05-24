package webshop.models;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class SqlHelper {

    static SQLServerDataSource ds = getDataSource();

    public static SQLServerDataSource getDataSource() {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setDatabaseName("WebShop");
        ds.setServerName("localhost");
        ds.setUser("andrej");
        ds.setPassword("Pa$$w0rd");
        ds.setPortNumber(1433);
        return ds;
    }
    
}
