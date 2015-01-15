/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Form_Validation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author ABHISHEK
 */
public class UserNameValidate extends HttpServlet {

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
            out.println("<title>Servlet UserNameValidate</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UserNameValidate at " + request.getContextPath () + "</h1>");
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
        processRequest(request, response);
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
        String result="";
          response.setContentType("text;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            
            
        try {
            //  processRequest(request, response);
               Connection conn = com.Database.DB.getConnection();
               Statement stmt= conn.createStatement();
               String query="select count(*) from USER_REG where user_name='" + request.getParameter("username") + "'";
                ResultSet rs = stmt.executeQuery (query);
                 while(rs.next())
                 {
                     result=rs.getString(1);
                     
                 }   
                      if(result.equals("1"))
                          out.println("User Name Already Exist");
                      else
                          out.println("Perfect");
                          
                
                conn.close();
    conn = null;
        } catch (SQLException ex) {
            out.println(ex);
        }


            
            
             
        } finally {            
            out.close();
        }
        
        
       
            
            // TODO output your page here
            
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
