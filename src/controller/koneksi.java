/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author RIBUT WIBOWO RAHAYU
 */
public class koneksi {
    private static Connection konfig;
    private static Connection configDB()throws SQLException{
    try{
        String url="jdbc:mysql://localhost:3306/polkam";
        String user="root";
        String pass="";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        konfig=DriverManager.getConnection(url,user,pass);
    }catch(SQLException e){
    System.out.println("Koneksi ke Database Gagal..."+e.getMessage());
    JOptionPane.showMessageDialog(null,"Koneksi ke Database Gagal...");
    }
    return konfig;
    }
}
