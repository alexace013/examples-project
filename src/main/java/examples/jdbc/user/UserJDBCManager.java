package examples.jdbc.user;

import utils.logger.Log4JWrapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;

public class UserJDBCManager {

    private static final String DB_USER = "root";
    private static final String DB_PASS = DB_USER;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/hibernate";

    private Connection connection;
    private boolean isConnect;

    public UserJDBCManager() {
        Locale.setDefault(Locale.ENGLISH);
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            isConnect = true;
        } catch (Exception e) {
            Log4JWrapper.debug("SOMETHING WRONGS WITH UserJDBCManager CLASS.");
            Log4JWrapper.error(e.getMessage());
            isConnect = false;
        }
    }

    public boolean isUserCreate(User user) {
        try {
            PreparedStatement stmt = connection.prepareStatement(String.format("INSERT INTO users (id, id_code, id_passport, first_name, last_name) VALUES (%d, %d, '%s', '%s', '%s');",
                    user.getId(), user.getId_code(), user.getId_passport(), user.getFirst_name(), user.getLast_name()));
            stmt.executeUpdate();
        } catch (SQLException e) {
            Log4JWrapper.debug("PROBLEM WITH isUSerCreate METHOD");
            Log4JWrapper.error(e.getMessage());
            return false;
        }
        return true;
    }

}
