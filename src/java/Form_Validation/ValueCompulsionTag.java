/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Form_Validation;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author ABHISHEK
 */
public class ValueCompulsionTag extends TagSupport 
{

 private String username;
    private String password;

    

    @Override
    public int doStartTag() throws JspException {
         JspWriter out = pageContext.getOut();
        try {
            
       if(this.username.equalsIgnoreCase(this.password))
    out.println("<c:redirect url=\"testajax.jsp\"></c:redirect>");
else
    out.println("<h2>invalid</h2>"); 
        }catch(Exception e)
        {
            
        }
    return  SKIP_BODY;
    }


}
