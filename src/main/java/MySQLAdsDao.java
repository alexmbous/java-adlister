
import com.codeup.adlister.models.Ad;
import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.sql.SQLException;


public class MySQLAdsDao implements Ads{
    private Connection connection = null;


    public MySQLAdsDao(Config config){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    public MySQLAdsDao(){}

    @Override
    public List<Ad> all() {
        Statement stmt = null;

        return null;
    }

    @Override
    public Long insert(Ad ad) {
        try{
            Statement stmt = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
        return null;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}





