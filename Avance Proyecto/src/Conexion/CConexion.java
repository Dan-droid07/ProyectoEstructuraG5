/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author dsiles
 */
public class CConexion {
    

    Connection conectar = null;
     String bd = "starwars";
    String ip = "localhost";
    String puerto = "3306";
   // String user ="root";
    //String password="";  
    String cadena="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
          try {
              Class.forName("com.mysql.cj.jdbc.Driver");
           // String cadena = "jdbc:mysqlserver://localhost:"+puerto+";"+"databaseName="+bd ; //;encrypt=true;trustServerCertificate=true"
                    //+":"+ puerto+":"+"databasename="+bd
            conectar=DriverManager.getConnection(cadena);
            JOptionPane.showMessageDialog(null, "Se conecto correctamente con la base de datos " + bd);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos, error: " + e.toString());
        }
          return conectar;
    }
    public void close(){
        try {
            conectar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al cerrar la conexion con la base de datos" + e.getMessage() );
        }
    
    }
    
}
