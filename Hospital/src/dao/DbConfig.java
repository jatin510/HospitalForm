/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;

/**
 *
 * @author Jatin
 */
public class DbConfig {
    
    private static Connection con = null;
    
    static {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "jatin";
            String pwd = "jatin";
            
            con = DriverManager.getConnection(url,user,pwd);
          }
        
        catch(Exception e){
            
            e.printStackTrace();
        }
    
}
    
    public static Connection getConnection(){
        return con;
    }
    /* To test Connection
    
    public static void main(String[] args) {
        System.out.print(con);
    }
    */
}
