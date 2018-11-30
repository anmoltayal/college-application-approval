/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Anmol Tayal
 */
public class LoginDAO {
    String user;
    String url;
    String password;
    Connection con;
    Statement st;
    LoginDAO() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        this.user="root";
        this.url="jdbc:mysql://localhost:3306/user";
        this.password="";
    
        this.con=DriverManager.getConnection(url, user, password);
        this.st=con.createStatement();
    }
   
    public String checkInfo(String id,String password,String user) throws SQLException
    {
     // String ret=null;
        if (user.equals("Student"))
        {
         String query="Select * from students where id='"+id+"' and password ='"+password+"'";
        ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
            return "Student";
        }
        }
        else if (user.equals("Admin"))
        {
         String query="Select * from admin where id='"+id+"' and password ='"+password+"'";
        ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
            return "Admin";
        }
        }
        else if (user.equals("Teacher"))
        {
         String query="Select * from teacher where id='"+id+"' and password ='"+password+"'";
        ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
            return "Teacher";
        }
        }
        else if (user.equals("hod"))
        {
         String query="Select * from hod where id='"+id+"' and password ='"+password+"'";
        ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
            return "hod";
        }
        }

            return "invalid login details";
        

    }
    
    
}
