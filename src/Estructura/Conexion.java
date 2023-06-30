package Estructura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    //Coneccion
    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://localhost:3306/sistema_encomienda?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "root", "");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
}