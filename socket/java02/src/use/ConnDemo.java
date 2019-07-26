/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package use;

import ex3.ConnDriver;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author bit
 */
public class ConnDemo {
    public static void main(String[] args) throws SQLException{
        try(Connection con= ex3.ConnDriver.getMyConnection();){
            System.out.println(con);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
