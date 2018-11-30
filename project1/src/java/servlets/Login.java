/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anmol Tayal
 */
public class Login extends HttpServlet 
{
   public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
    {
        String name=request.getParameter("username");
        String password = request.getParameter("pass");
        String user = request.getParameter("user");
        request.setAttribute("name",name);
        
        RequestDispatcher rd = null;
        PrintWriter out=response.getWriter();
        try {
            LoginDAO l = new LoginDAO();
            String result = l.checkInfo(name, password,user);
            out.print(result);
           if (result.equals("Admin"))
            { 
                rd=request.getRequestDispatcher("adminhome.html");  
                rd.forward(request,response);
            }
            else if(result.equals("Student"))
            {
                rd=request.getRequestDispatcher("s_home.html");  
                rd.forward(request,response);  
            }
            else if(result.equals("Teacher"))
            {
                rd=request.getRequestDispatcher("t_home.jsp");  
                rd.forward(request,response);  
            }
            else if(result.equals("hod"))
            {
                rd=request.getRequestDispatcher("h_home.html");  
                rd.forward(request,response);  
            }
            else{
                rd=request.getRequestDispatcher("index.html");  
                rd.forward(request,response);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
