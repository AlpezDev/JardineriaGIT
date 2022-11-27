package jardineriagit;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    Connection con;//Se declarn los elementos para iniciar la base de datos
    public static final String URL = "jdbc:mysql://localhost:3306/jardineria",
                               USERNAME = "root",
                               PASSWORD = "";

    public Conexion() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }

    public Connection getConection() {
        return con;
    }
}
