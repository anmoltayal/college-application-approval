package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class applicationview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  font-family: Arial;\n");
      out.write("  font-size: 14px;\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write(" \n");
      out.write("}\n");
      out.write("        \n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row {\n");
      out.write("  display: -ms-flexbox; /* IE10 */\n");
      out.write("  display: flex;\n");
      out.write("  -ms-flex-wrap: wrap; /* IE10 */\n");
      out.write("  flex-wrap: wrap;\n");
      out.write("  margin: 0px -16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-25 {\n");
      out.write("  -ms-flex: 25%; /* IE10 */\n");
      out.write("  flex: 25%;\n");
      out.write("}\n");
      out.write(".col-33 {\n");
      out.write("  -ms-flex: 25%; /* IE10 */\n");
      out.write("  flex: 25%;\n");
      out.write("}\n");
      out.write(".col-50 {\n");
      out.write("  -ms-flex: 50%; /* IE10 */\n");
      out.write("  flex: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-75 {\n");
      out.write("  -ms-flex: 75%; /* IE10 */\n");
      out.write("  flex: 75%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-25,\n");
      out.write(".col-33,\n");
      out.write(".col-50 \n");
      out.write(" {\n");
      out.write("  padding: 0 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("  padding: 5px 20px 15px 20px;\n");
      out.write("  border: 1px solid lightgrey;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write("input[type=password] {\n");
      out.write("  width: 100%;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  padding: 8px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write("input[type=date] {\n");
      out.write("  width: 100%;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  padding: 8px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write("input[type=text] {\n");
      out.write("  width: 100%;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  padding: 8px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write("input[type=submit] {\n");
      out.write("  width: 10%;\n");
      out.write("}\n");
      out.write("label {\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".btn {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("  padding: 12px;\n");
      out.write("  margin: 10px 0;\n");
      out.write("  border: none;\n");
      out.write("  width: 100%;\n");
      out.write("  border-radius: 3px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-size: 17px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("  background-color: #45a049;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("  color: #2196F3;\n");
      out.write("}\n");
      out.write("\n");
      out.write("hr {\n");
      out.write("  border: 1px solid lightgrey;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span.price {\n");
      out.write("  float: right;\n");
      out.write("  color: grey;\n");
      out.write("}\n");
      out.write("#reason,#decreason{\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100px;\n");
      out.write("    padding: 5px 10px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    border: 2px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    background-color: white;\n");
      out.write("    resize: none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
  
        String id=(String)request.getParameter("username");
        Connection conn = null;
        Statement stmt = null;
       try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");
        stmt = con.createStatement();
        String sql = "SELECT * from leaveform where id='"+id+"'" ;
       ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
      
      
        
      out.write("   \n");
      out.write("<div class=\"container\">\n");
      out.write("    <form action=\"leave\" method=\"get\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"fname\">First Name</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"fname\" name=\"f_name\" placeholder=\"Your first name\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"lname\">Last Name</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"lname\" name=\"l_name\" placeholder=\"Your last name\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"id\">Uid</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"id\" name=\"id\" placeholder=\"Your Uid\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"type\">Application type</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <select id=\"type\" name=\"application type\">\n");
      out.write("          <option value=\"duty leave\">Duty Leave </option>\n");
      out.write("          <option value=\"pass\">Gate Pass </option>\n");
      out.write("          <option value=\"medical leave\">Apply For Medical Leave</option>\n");
      out.write("          <option value=\"medical leave\">Apply For Hostel Leave</option>\n");
      out.write("        </select>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"date\">Date To</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("          <input type=\"date\" id=\"date\" name=\"date to\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("       <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"date\">Date From</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("          <input type=\"date\" id=\"date\" name=\"date from\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"subject\">Subject</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <textarea id=\"subject\" name=\"subject\" placeholder=\"Write something..\" style=\"height:200px\"></textarea>\n");
      out.write("         \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div >\n");
      out.write("     <center> <input type=\"submit\" value=\"Submit\"></center>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");

    }
}
catch(Exception e)
{
    out.print(e);
}

      out.write("\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("    $(\"#approved\").click(function(){\n");
      out.write("        $(\"#dereason\").hide();\n");
      out.write("    });\n");
      out.write("    $(\"#Decline\").click(function(){\n");
      out.write("        $(\"#dereason\").show();\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
