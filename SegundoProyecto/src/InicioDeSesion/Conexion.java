
package InicioDeSesion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    
    String bd="registro";
    String url="jdbc:mysql://localhost:3307/"+bd;
    String user="root";
    String pass=System.getProperty(bd);
    String driver="com.mysql.jdbc.Driver";
    Connection cx;
    

    public Conexion() {
    }
    
    public Connection conectar() {
    
        try
        {
            Class.forName(driver);
            cx=DriverManager.getConnection(url, user, pass);
            
        } catch (ClassNotFoundException |SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error " +ex.getMessage());
            
        }
        return cx;
    }
    
    public void desconectar(){
        try
        {
            cx.close();
        } catch (SQLException ex)
        {
          JOptionPane.showMessageDialog(null, "Error " +ex.getMessage());  
        }
    }

    
 
}

