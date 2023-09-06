/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conex;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author gbas
 */
public class conection {
     Connection cn;
    
    public java.sql.Connection conect(){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         cn =(java.sql.Connection)DriverManager.getConnection("jdbc:mysql://localhost/servicioTecnicodb","root","");
         System.out.println("Conexion Establecida");
        
     }catch(HeadlessException | ClassNotFoundException | SQLException e){
     System.out.println("ERROR" + e);
      JOptionPane.showMessageDialog(null,"ERROR AL INTENTAR CONECTARSE CON LA BASE DE DATOS , INTENTELO DE NUEVO");
         }
    return cn;
    }
}
