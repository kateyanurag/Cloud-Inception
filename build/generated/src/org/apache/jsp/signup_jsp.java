package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


String first_name="";

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>A very Simple jQuery Popup</title>\n");
      out.write("<script type=\"text/javascript\" src=\"javascripts/jquery-1.6.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"javascripts/signup.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"javascripts/registration.js\"></script>\n");
      out.write("<link href=\"stylesheets/signup.css\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"stylesheets/registration.css\" rel=\"stylesheet\"/>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function(){\n");
      out.write("    $(\"#close\").click(function(){\n");
      out.write("       \n");
      out.write("          $(\"#form_table\").fadeOut(500);\n");
      out.write("          \n");
      out.write("     $(\"#bod\").css({background : 'white'});\n");
      out.write("    \n");
      out.write("    $(\"#form_table1\").fadeIn(3000);\n");
      out.write("    positionPopup1();\n");
      out.write("    $(\"#bod\").css({background : 'darkgray'});\n");
      out.write("   \n");
      out.write("});\n");
      out.write("});\n");
      out.write("function positionPopup1(){\n");
      out.write("  if(!$(\"#form_table1\").is(':visible')){\n");
      out.write("    return;\n");
      out.write("  }\n");
      out.write("  $(\"#form_table1\").css({\n");
      out.write("      left: ($(window).width() - $('#form_table1').width()) / 2,\n");
      out.write("      top: ($(window).width() - $('#form_table').width()) / 40,\n");
      out.write("      position:'absolute'\n");
      out.write("  });\n");
      out.write("    \n");
      out.write("            \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("    #form_table input + span, #form_table textarea + span, form_table select + span{\n");
      out.write("\tdisplay: none;\n");
      out.write("\tbackground:url('images/message.png') no-repeat center left;\n");
      out.write("        \n");
      out.write("     \n");
      out.write("\tline-height: 32px;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tcolor: #000;\n");
      out.write("\tpadding:0px 20px;\n");
      out.write("\tposition: absolute;\n");
      out.write("\twidth: 180px;\n");
      out.write("\tz-index:99;\n");
      out.write("\t}\n");
      out.write(" \n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"bod\">\n");
      out.write("\n");
      out.write("    ");

    try
                       {
      new File("E:/J2EE_IAAS_CI/Cloud_Inception/build/web/Users/helloanna").mkdir();
           }
    catch(Exception e)
                       {
        
      out.write("\n");
      out.write("        kljkj\n");
      out.write("        ");

    }
    
      out.write("\n");
      out.write("  \n");
      out.write("<a href=\"#\" id=\"pop\" >Click Here to SignUp </a>\n");
      out.write("<br />\n");
      out.write("<!form id=\"overlay_form\" style=\"display:none\">\n");
      out.write("<form method=\"Post\" action=\"Register\">\n");
      out.write("  <table border=\"0\" id=\"form_table\" style=\"display:none\">\n");
      out.write("      \n");
      out.write("  <tr>\n");
      out.write("    <th width=\"25%\">First Name &#8250;</th>\n");
      out.write("    <td>\n");
      out.write("          <input type=\"text\" name=\"firstname\" id=\"first_name\" >\n");
      out.write("        <span id=\"fn\"></span>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th width=\"25%\">Last Name &#8250;</th>\n");
      out.write("    <td>\n");
      out.write("          <input type=\"text\" name=\"lastname\" id=\"last_name\">\n");
      out.write("        <span id=\"ln\"></span>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th>Email &#8250;</th>\n");
      out.write("    <td>\n");
      out.write("    <input type=\"text\" name=\"emailid\" id=\"email_id\">\n");
      out.write("    <span id=\"eid\"></span>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th>Username &#8250;</th>\n");
      out.write("    <td>\n");
      out.write("    <input type=\"text\" name=\"username\" id=\"user_name\"  >\n");
      out.write("    <span id=\"un\"> </span>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th>Password &#8250;</th>\n");
      out.write("    <td>\n");
      out.write("    <input type=\"password\" name=\"password\" id=\"password\">\n");
      out.write("    <span id=\"pass\"></span>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th>Country &#8250;</th>\n");
      out.write("    <td>\n");
      out.write("    <input type=\"text\" name=\"country\" id=\"country\">\n");
      out.write("    <span id=\"cn\"></span>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th>Contact No. &#8250;</th>\n");
      out.write("    <td>\n");
      out.write("    <input type=\"text\" name=\"contactno\" id=\"contact_no\">\n");
      out.write("    <span id=\"cno\"></span>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th>Company Name &#8250;</th>\n");
      out.write("    <td>\n");
      out.write("    <input type=\"text\" name=\"company\" id=\"company\">\n");
      out.write("    <span id=\"con\"></span>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("      <th>No of Employees &#8250;</th>\n");
      out.write("    <td>\n");
      out.write("    <input type=\"text\" name=\"noofemployees\" id=\"no_of_employees\">\n");
      out.write("    <span id=\"noe\"></span>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th>User type &#8250;</th>\n");
      out.write("    <td>\n");
      out.write("        <select name=\"usertype\" id=\"user_type\"  >\n");
      out.write("         <option value=\"\"></option>\n");
      out.write("        <option value=\"Administrator\">Cloud Administrator</option>\n");
      out.write("        <option value=\"Cloud Client\">Cloud Client</option >\n");
      out.write("        \n");
      out.write("    </select>\n");
      out.write("    <span id=\"ut\">Select the User Type</span>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th> </th>\n");
      out.write("    <td>\n");
      out.write("    <input type=\"submit\" name=\"submit\" value=\"Submit Form\" id=\"close1\">\n");
      out.write("\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
