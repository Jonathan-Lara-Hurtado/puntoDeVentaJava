/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author jose
 */
public class Conexion {
    
    Connection conn = null;
    String user = "root";
    String pass = "123456789";
    String bd = "opticaLuz";
  
    Statement stmt = null;
    ResultSet rs = null;
    
  public Conexion(){
  
      try {
          String url = "jdbc:mysql://localhost:3306/"+bd+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
          conn = (Connection) DriverManager.getConnection(url,user,pass);
          
          if(conn != null){
              System.out.println("Exito");
          
          }else{
                        System.out.println("Mal");
          }
          
          
      }catch (SQLException ex) {
      System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
      } 
     
  }
  
  
  public Connection retornaConexion(){
  return this.conn;
  }
    
  
  
  //este solo se llamara la primera ves de inicio
  public void crearRootUser(){
        
      try {
          String query ="insert into usuario(idUsuario,nombre,contraseña) values(1,'admin',12345)";
          stmt = this.conn.createStatement();
          stmt.executeUpdate(query);
      
      } catch (SQLException ex) {
           System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
      }
      
  
  }
  
  
  public boolean ValidacionUsuario(String u, String p){
        
      String query="select * from usuario where nombre="+"'"+u+"'"+" and  contraseña="+p+";";
      
       try {
          stmt = this.conn.createStatement();
          rs = stmt.executeQuery(query);
          
          rs = stmt.getResultSet();
          
          
          
      } catch (SQLException ex) {
           System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
      }
      return true;
  }
  
  
  public void Consulta(String query){
  
      try {
          stmt = this.conn.createStatement();
          rs = stmt.executeQuery(query);
          rs = stmt.getResultSet();
          int num=1;
          while(rs.next()){

//                        System.out.println(rs.);
//              num=rs.getRow();
              System.out.println(rs.getString(1));
              System.out.println(rs.getString(2));
                            System.out.println(rs.getString(3));
          }
          
      } catch (SQLException ex) {
           System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
      }
      
  
  }
  
  
  
}
