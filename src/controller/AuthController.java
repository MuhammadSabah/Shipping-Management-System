package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthController {

    private static final String URL = "jdbc:mysql://localhost:3306/shipping";
    private static final String USER = "root";
    private static final String PASS = "";



    public static boolean checkCredential(String username, String password, String query) {
        boolean credentials = false;
        PreparedStatement statement;

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASS);
            statement = connection.prepareStatement(query);

            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()) {
                credentials = true;
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return credentials;
    }

    public void logout() {
    }
}
