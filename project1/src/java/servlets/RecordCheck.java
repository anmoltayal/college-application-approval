/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anmol Tayal
 */
public class RecordCheck {
    
   
     public void insert(int id,String first,String last,String pass) throws ClassNotFoundException, SQLException, IOException
    {
         
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");  
        PreparedStatement ps = con.prepareStatement("insert into students values(?,?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, first);
        ps.setString(3, last);
        ps.setString(4,pass);
        int rs=ps.executeUpdate();
        
        
    }   
     public void insertleave(String first,String last,String id,String app,String date1,String date2,String subject) throws ClassNotFoundException, SQLException, IOException
    {
         
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");  
        PreparedStatement ps = con.prepareStatement("insert into leaveform values(?,?,?,?,?,?,?)");
        ps.setString(1, first);
        ps.setString(2, last);
        ps.setString(3, id);
        ps.setString(4, app);
        ps.setString(5,date1);
        ps.setString(6, date2);
        ps.setString(7,subject);
        
        int rs;
        rs = ps.executeUpdate();
    }    
     /*public static void main(String [] args) throws ClassNotFoundException, SQLException, IOException
     {
         RecordCheck l=new RecordCheck();
         l.insertleave("Anmol", "Tayal", "1611980501","Gate Pass", "2018-11-22", "2018-11-23", "Decline","subject");
         System.out.println("fname");
         System.out.println("lname");
         System.out.println("id");
         System.out.println("app_type");
         System.out.println("d_to");
         System.out.println("d_from");
         System.out.println("status");
         System.out.println("subject");
     }*/

    void insertleave(String fname, String lname, String id, String app_type, String d_to, String d_from,String status, String subject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void insertfeedback(String first,String last,String id,String suggest,String subject) throws ClassNotFoundException, SQLException, IOException
    {
         
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");  
        PreparedStatement ps = con.prepareStatement("insert into leaveform values(?,?,?,?,?)");
        ps.setString(1, first);
        ps.setString(2, last);
        ps.setString(3, id);
        ps.setString(4, suggest);
        ps.setString(5, subject);
        int rs;
        rs = ps.executeUpdate();
    }

   /* public void insertfeedback(String first, String last, String id, String suggest, String subject) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
     
     public String forpass(String id,String sque,String ans) throws ClassNotFoundException, SQLException, IOException
    { 
         
        Class.forName("com.mysql.jdbc.Driver");   
        System.out.print(id+" "+sque+" "+ans);
        Statement stmt = null;
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root",""); 
        stmt = con.createStatement();
        if(sque.equals("question1")){
          ResultSet rs = stmt.executeQuery("select * from students where id='"+id +"'");
          while(rs.next()){

            String answer = rs.getString("answer1");
         if(answer.equals(ans)){
            return "done";
         
         }
        }
        }
        else if(sque.equals("question2")){
          ResultSet rs = stmt.executeQuery("select * from students where id='"+id +"'");
          while(rs.next()){

         String answer = rs.getString("answer2");
          if (answer.equals(ans))
         {
            return "done";
         }
         
        }
        }
        else if(sque.equals("question3")){
          ResultSet rs = stmt.executeQuery("select * from students where id='"+id +"'");
         
          while(rs.next()){

         String answer = rs.getString("answer3");
          if (answer.equals(ans))
         {
            return "done";
         }
        }
        }
        
      return "error";
    }
     public void updatePass(String id,String newpass,String confpass) throws ClassNotFoundException, SQLException
     {
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");  
        PreparedStatement ps = con.prepareStatement("insert into students values(?,?,?)");
        ps.setString(1, id);
        ps.setString(2, newpass);
        ps.setString(3, confpass);
        int rs;
        rs = ps.executeUpdate();  
     }
        
    public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException{
      RecordCheck n=new RecordCheck();
      
    }
}
