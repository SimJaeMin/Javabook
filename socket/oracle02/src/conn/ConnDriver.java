/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bit
 */
public class ConnDriver {
    // static �ʱ�ȭ: main �޼��庸�� ����Ǿ ����
    
    static{
        try{
            // driver�� Ŭ������ jvm�� �ε�!
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public static Connection getMyConnection() throws SQLException{
        String user = "javabook";
        String pwd = "test00";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        return DriverManager.getConnection(url, user, pwd);
    }
    
}