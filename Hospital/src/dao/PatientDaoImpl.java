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
public class PatientDaoImpl implements PatientDao{
    
    public int insertPatientData(String...data){
        
        try{
            Connection con = DbConfig.getConnection();
            
            //5 parameters
            String sql = "insert into patient values(?,?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            int i=1;
            for(String value: data){
                ps.setString(i++,value);
            }
            
            return ps.executeUpdate();
            
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
        return -1;
    }
    
}
