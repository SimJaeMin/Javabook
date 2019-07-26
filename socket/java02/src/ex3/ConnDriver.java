/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bit
 */
public class ConnDriver {
  //메인 메서드보다 먼저 실행된다.
    static{
        try{
          
        //Driver의 클래스를 로딩!
        Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
    public static Connection getMyConnection() throws SQLException {
        String user="javabook";
        String pwd="test00";
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        return DriverManager.getConnection(url, user, pwd);
        
    }
}
