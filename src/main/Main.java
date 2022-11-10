package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main (String [] args) throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:sqlite:flights.db");
        ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM flights");
        while(rs.next()){
            System.out.println(rs.getInt("DEP_TIME") + "," +
                                rs.getInt("DEP_DELAY") + "," +
                                rs.getInt("ARR_TIME") + "," +
                                rs.getInt("AIR_TIME") + "," +
                                rs.getInt("DISTANCE"));
        }
                
    }
}
