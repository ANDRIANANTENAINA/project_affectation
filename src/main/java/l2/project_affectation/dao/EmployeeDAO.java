package l2.project_affectation.dao;

import l2.project_affectation.util.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;;

public class EmployeeDAO {
    //all
    public static void all() throws SQLException, ClassNotFoundException{
            String selectStmt = "SELECT * FROM employe";
            try{
                // get result from dbExecuteQuery method
                ResultSet rsEmpl = Database.dbExecuteQuery(selectStmt);
            }catch (SQLException e){
                System.out.println("SQL select operation has been Failed "+ e);
                throw e;
            }
    }

    public static void add() throws SQLException, ClassNotFoundException{
        String selectStmt = "INSERT INTO employe (num_empl, civilite, nom_empl, prenoms_empl, email, poste, lieu) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try{
            Connection connection = Database.dbConnect();
            PreparedStatement statement = connection.prepareStatement(selectStmt);
            statement.setString(1, "E002"); // Replace with the actual value for num_empl
            statement.setString(2, "Mr"); // Replace with the actual value for civilite
            statement.setString(3, "Doe"); // Replace with the actual value for nom_empl
            statement.setString(4, "John"); // Replace with the actual value for prenoms_empl
            statement.setString(5, "john.doe@example.com"); // Replace with the actual value for email
            statement.setString(6, "Manager"); // Replace with the actual value for poste
            statement.setString(7, "New York"); // Replace with the actual value for lieu

            //excute

            int rowsAffected = statement.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted!");

            // Closing the resources
            statement.close();
            connection.close();
            System.out.println("Disconnected from the database!");


        }catch (SQLException e){
            System.out.println("SQL select operation has been Failed "+ e);
            throw e;
        }
    }
}
