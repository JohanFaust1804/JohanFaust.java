/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinejohan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class connection {
 
Connection con;

    private static  String Driver = "com.mysql.cj.jdbc.Driver";
    private static  String user = "root";
    private static  String pass = "root";
    private static  String url = "jdbc:mysql://localhost:3306/cineJohan";
    
    static {
        try{
            Class.forName(Driver);
        } catch (ClassNotFoundException e){
          JOptionPane.showMessageDialog(null,"Error de conexion"); 
        }
    }
    public void conectar(){
        con = null;
        try{
            Class.forName(Driver); 
            con = (Connection) DriverManager.getConnection(url, user, pass);
            if(con != null){
                JOptionPane.showMessageDialog(null, "Conexión Establecida");
            }
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error de Conexión: "+e);
        }
    }
}  

