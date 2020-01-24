package com.iampatildipak;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/JAVA/JavaTutorials/DATABASES/TestDBJDBC/testjava.db");
            Statement statement = conn.createStatement();
            //statement.execute("CREATE TABLE IF NOT EXISTS Contacts (name TEXT, phone INTEGER, Email TEXT)");
            //statement.execute("INSERT INTO Contacts (name, phone, email) VALUES ('Dipak',787878778,'dipak@gmail.com')");
            statement.execute("UPDATE Contacts SET phone =90909090 WHERE name='Dipak'");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Contacts");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name") + " " +
                        resultSet.getInt("phone") + " " +
                        resultSet.getString("email"));
            }
            statement.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}