/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement
/* 
 *
 * @author yokes
 */
public class Tables {
    public static void main(String[] args) {
        try{
        Connection con = Connecter.getCon();
        Statement st= con.createStatement();
       // st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200),dob varchar(50),phoneNumber varchar(50),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
        st.executeUpdate("insert into appuser(userRole,name,dob,phoneNumber,email,username,password,address) values('Admin','Admin','07-09-2005','9812345698','shanthimedicalsiv@gmial.com','admin','admin','India')");
        JOptionPane.showMessageDialog(null, "TABLE CREATED SUCCESSFULLY");
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e)
        }
    }
    
}
