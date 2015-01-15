package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import com.Database.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/tlds/tags.tld");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<!-- TemplateBeginEditable name=\"doctitle\" -->\n");
      out.write("<title>Untitled Document</title>\n");
      out.write("<!-- TemplateEndEditable -->\n");
      out.write("<!-- TemplateBeginEditable name=\"head\" -->\n");
      out.write("<!-- TemplateEndEditable -->\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("body {\n");
      out.write("\tfont: 100%/1.4 Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("\tbackground: #42413C;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tcolor: #000;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* ~~ Element/tag selectors ~~ */\n");
      out.write("ul, ol, dl { /* Due to variations between browsers, it's best practices to zero padding and margin on lists. For consistency, you can either specify the amounts you want here, or on the list items (LI, DT, DD) they contain. Remember that what you do here will cascade to the .nav list unless you write a more specific selector. */\n");
      out.write("\tpadding: 0;\n");
      out.write("\tmargin: 0;\n");
      out.write("}\n");
      out.write("h1, h2, h3, h4, h5, h6, p {\n");
      out.write("\tmargin-top: 0;\t /* removing the top margin gets around an issue where margins can escape from their containing div. The remaining bottom margin will hold it away from any elements that follow. */\n");
      out.write("\tpadding-right: 15px;\n");
      out.write("\tpadding-left: 15px; /* adding the padding to the sides of the elements within the divs, instead of the divs themselves, gets rid of any box model math. A nested div with side padding can also be used as an alternate method. */\n");
      out.write("}\n");
      out.write("a img { /* this selector removes the default blue border displayed in some browsers around an image when it is surrounded by a link */\n");
      out.write("\tborder: none;\n");
      out.write("}\n");
      out.write("/* ~~ Styling for your site's links must remain in this order - including the group of selectors that create the hover effect. ~~ */\n");
      out.write("a:link {\n");
      out.write("\tcolor: #42413C;\n");
      out.write("\ttext-decoration: underline; /* unless you style your links to look extremely unique, it's best to provide underlines for quick visual identification */\n");
      out.write("}\n");
      out.write("a:visited {\n");
      out.write("\tcolor: #6E6C64;\n");
      out.write("\ttext-decoration: underline;\n");
      out.write("}\n");
      out.write("a:hover, a:active, a:focus { /* this group of selectors will give a keyboard navigator the same hover experience as the person using a mouse. */\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* ~~ this fixed width container surrounds the other divs ~~ */\n");
      out.write(".container {\n");
      out.write("\twidth: 960px;\n");
      out.write("\tbackground: #FFF;\n");
      out.write("\tmargin: 0 auto; /* the auto value on the sides, coupled with the width, centers the layout */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* ~~ the header is not given a width. It will extend the full width of your layout. It contains an image placeholder that should be replaced with your own linked logo ~~ */\n");
      out.write(".header {\n");
      out.write("\tbackground: #ADB96E;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* ~~ This is the layout information. ~~ \n");
      out.write("\n");
      out.write("1) Padding is only placed on the top and/or bottom of the div. The elements within this div have padding on their sides. This saves you from any \"box model math\". Keep in mind, if you add any side padding or border to the div itself, it will be added to the width you define to create the *total* width. You may also choose to remove the padding on the element in the div and place a second div within it with no width and the padding necessary for your design.\n");
      out.write("\n");
      out.write("*/\n");
      out.write("\n");
      out.write(".content {\n");
      out.write("\n");
      out.write("\tpadding: 10px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* ~~ The footer ~~ */\n");
      out.write(".footer {\n");
      out.write("\tpadding: 10px 0;\n");
      out.write("\tbackground: #CCC49F;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* ~~ miscellaneous float/clear classes ~~ */\n");
      out.write(".fltrt {  /* this class can be used to float an element right in your page. The floated element must precede the element it should be next to on the page. */\n");
      out.write("\tfloat: right;\n");
      out.write("\tmargin-left: 8px;\n");
      out.write("}\n");
      out.write(".fltlft { /* this class can be used to float an element left in your page. The floated element must precede the element it should be next to on the page. */\n");
      out.write("\tfloat: left;\n");
      out.write("\tmargin-right: 8px;\n");
      out.write("}\n");
      out.write(".clearfloat { /* this class can be placed on a <br /> or empty div as the final element following the last floated div (within the #container) if the #footer is removed or taken out of the #container */\n");
      out.write("\tclear:both;\n");
      out.write("\theight:0;\n");
      out.write("\tfont-size: 1px;\n");
      out.write("\tline-height: 0px;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style></head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"header\"> \n");
      out.write("      <a href=\"signup.jsp\"><font color=\"blue\">Create a new Account</font></a>\n");
      out.write("      <!-- end .header --></div>\n");
      out.write("  <div class=\"content\">\n");
      out.write("      <div id=\"Enterance\"\n");
      out.write("      \n");
      out.write("           <a href=\"#\"><font color=\"blue\">Forget Password???</font></a><br/>\n");
      out.write("         ");

    String name = request.getParameter("name");
    if(name == null)
        name = "";
    String password = request.getParameter("password");
    if(password == null)
        password = "";
  

      out.write("\n");
      out.write("      </div>\n");
      out.write("          <form  method=\"POST\" target=\"index.jsp\">\n");
      out.write("          Username&nbsp;<input type=\"text\" name=\"name\"/><br/><br/>\n");
      out.write("          Password&nbsp;&nbsp;<input type=\"password\" name=\"password\"/><br/><br/>\n");
      out.write("      \n");
      out.write("          \n");
      out.write("          <input type=\"submit\" value=\"Login\"  />          \n");
      out.write("      </form>\n");
      out.write("     <h1>Instructions</h1>\n");
      out.write("    <p>Be aware that the CSS for these layouts is heavily commented. If you do most of your work in Design view, have a peek at the code to get tips on working with the CSS for the fixed layouts. You can remove these comments before you launch your site. To learn more about the techniques used in these CSS Layouts, read this article at Adobe's Developer Center - <a href=\"http://www.adobe.com/go/adc_css_layouts\">http://www.adobe.com/go/adc_css_layouts</a>.</p>\n");
      out.write("    <h2>Layout</h2>\n");
      out.write("    <p>Since this is a one-column layout, the .content is not floated. </p>\n");
      out.write("    <h3>Logo Replacement</h3>\n");
      out.write("    <p>An image placeholder was used in this layout in the .header where you'll likely want to place  a logo. It is recommended that you remove the placeholder and replace it with your own linked logo. </p>\n");
      out.write("    <p> Be aware that if you use the Property inspector to navigate to your logo image using the SRC field (instead of removing and replacing the placeholder), you should remove the inline background and display properties. These inline styles are only used to make the logo placeholder show up in browsers for demonstration purposes. </p>\n");
      out.write("    <p>To remove the inline styles, make sure your CSS Styles panel is set to Current. Select the image, and in the Properties pane of the CSS Styles panel, right click and delete the display and background properties. (Of course, you can always go directly into the code and delete the inline styles from the image or placeholder there.)</p>\n");
      out.write("    <!-- end .content --></div>\n");
      out.write("  <div class=\"footer\">\n");
      out.write("    <p>Footer</p>\n");
      out.write("    <!-- end .footer --></div>\n");
      out.write("  <!-- end .container --></div>\n");
      out.write("</body>\n");
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
