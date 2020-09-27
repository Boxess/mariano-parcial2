package com.mariano.bd;
import java.sql.*;
public class Conn {
    
    private Connection conn;
    private Statement stat;
    private String sql;

    public Conn() {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");            
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "cuentas", "cuentas123");            
        }catch(SQLException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    public int NuevoCliente(){

            return 0;
    }

    


}
