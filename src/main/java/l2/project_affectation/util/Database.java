package l2.project_affectation.util;

import java.sql.*;
import com.sun.rowset.CachedRowSetImpl;
public class Database {
    private static final String url = "jdbc:postgresql://localhost:5432/mydatabase";
    private static final String user = "base";
    private static final String password = "Falinirina!0205";
    private static Connection conn = null;

    public static Connection dbConnect() throws SQLException, ClassNotFoundException {

        try {
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("Connection successfully");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console" + e);
            e.printStackTrace();
            throw e;
        }
        return null;
    }
    //Close Connection
    public static void dbDisconnect() throws SQLException {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (Exception e){
            throw e;
        }
    }


    //TSY MISY ZAVATRA AZOKO ETO

    public static ResultSet dbExecuteQuery(String queryStmt) throws SQLException, ClassNotFoundException{
        Statement stmt = null;
        ResultSet resultSet = null;
        CachedRowSetImpl crs = null;
        try {
            dbConnect();
            System.out.println("Select statement: "+ queryStmt +"\n");
            //create statement
            stmt = conn.createStatement();
            //CachedRowDSet Implementation
            crs = new CachedRowSetImpl();
            crs.populate(resultSet);
        }catch (SQLException e){
            System.out.println("problem occured at executeQuery : "+e);
            throw e;
        } finally {
            if (resultSet != null){
                resultSet.close();
            }
            if (stmt != null){
                stmt.close();
            }
            dbDisconnect();
        }
        return crs;
    }

}