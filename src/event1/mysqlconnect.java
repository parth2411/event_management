/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event1;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author owner
 */
public class mysqlconnect {
    public static Connection connect()
    {
        try
        {
           Class.forName("java.sql.Driver");
           Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","7061727468");
           return con;
        }
        catch(Exception abc)
                {
                    JOptionPane.showMessageDialog(null, abc);
                }
     return null;   
    }
    
}
