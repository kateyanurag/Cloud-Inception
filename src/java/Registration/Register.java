/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ABHISHEK
 */
@WebServlet(name = "Register", urlPatterns = {"/Register"})
public class Register extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Register</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Register at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
             */
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            //TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Register</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("restricted area");
            out.println("</body>");
            out.println("</html>");
             
        } finally {            
            out.close();
    }
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            //  processRequest(request, response);
              String FirstName=request.getParameter("firstname");
              String LastName=request.getParameter("lastname");
              String EmailId=request.getParameter("emailid"); 
              String UserName=request.getParameter("username");
              String Password=request.getParameter("password");
              String Country=request.getParameter("country"); 
             long Contactno=Integer.parseInt(request.getParameter("contactno")); 
              String Company=request.getParameter("company");   
              int NoOfEmployees=Integer.parseInt(request.getParameter("noofemployees"));   
              String UserType=request.getParameter("usertype");   
              int NoOfInstances=0;
              
              HttpSession sessionobj=request.getSession(true);
              sessionobj.setAttribute("username",request.getParameter("username"));
              sessionobj.setAttribute("loginstatus","login");
              String LoginStatus=sessionobj.getAttribute("loginstatus").toString();
              
              
              Connection conn = com.Database.DB.getConnection();
              Statement stmt= conn.createStatement();
              String query="insert into USER_REG values('" + FirstName + "','"  + LastName + "','"  + EmailId + "','"  + UserName + "','" + Password + "','"  + Country + "'," + Contactno + ",'" + Company + "'," +  + NoOfEmployees + ",'" + UserType + "'," + NoOfInstances + ",'" + LoginStatus + "')"; 
              stmt.executeUpdate(query);
              new File("E:/J2EE_IAAS_CI/Cloud_Inception/build/web/Users/" + UserName).mkdir();
              response.sendRedirect("Cloud.jsp");
        }catch(Exception e)
        {
            out.println(e.getMessage());
        }
        
        
        
        
        
        
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
