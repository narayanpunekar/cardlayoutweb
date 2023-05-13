/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourtags;

import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import java.io.IOException;

import java.util.logging.Logger;

/**
 *
 * @author narayan.punekar@yahoo.com
 */
public class GreetByName extends TagSupport {
    private static final Logger log = Logger.getLogger(GreetByName.class.getName());

    private String firstName;
    
    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            out.print("Hello" + firstName);
        } catch (IOException e) {
            log.info("Exception" + e.toString());
            log.warning("Exception" + e.toString());
            e.printStackTrace();
            throw new ExceptionInInitializerError(e.toString());
        }
        return SKIP_BODY;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
}
