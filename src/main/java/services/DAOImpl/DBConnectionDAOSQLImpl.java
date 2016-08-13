package services.DAOImpl;

import services.DAO.DBConnectionDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionDAOSQLImpl implements DBConnectionDAO{

    private  final String DRIVER_CLASS = "org.apache.derby.jdbc.EmbeddedDriver";
    private  static String CONECT_URL = "jdbc:derby:src\\main\\java\\resources\\personDB;create=false;user=admin;password=admin";
    private  final String USER = "admin";
    private  final String PASSW = "admin";
    private  Connection baseConnection;

    public DBConnectionDAOSQLImpl() {
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(DRIVER_CLASS);

        baseConnection = DriverManager.getConnection(CONECT_URL  , USER , PASSW);

        return baseConnection;

    }
}
