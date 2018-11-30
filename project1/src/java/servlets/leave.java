/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anmol Tayal
 */
public class leave extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String fname = req.getParameter("f_name");
        String lname = req.getParameter("l_name");
        String id = req.getParameter("id");
        String app_type = req.getParameter("application type");
        String d_to = req.getParameter("date to");
        String d_from = req.getParameter("date from");
        String subject = req.getParameter("subject");
        //out.println(fname+" "+lname+" "+id+" "+app_type+ "  "+d_to+" "+d_from+" "+subject);  
      RecordCheck rs = new RecordCheck();
      
        try {
            rs.insertleave(fname,lname,id,app_type,d_to,d_from,subject);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    }
    