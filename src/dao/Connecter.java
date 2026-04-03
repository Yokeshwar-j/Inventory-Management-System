/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author yokes
 */
public class Connecter {
    public static Connection getCon(){
        try{
            class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Medical?useSSL=false","root","yokesh2005$");
            return con;
        }
        catch(Exception e){
                System.out.println(e);
                return null;
                }
    }
}
