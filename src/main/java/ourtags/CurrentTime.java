/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourtags;

import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.jsp.JspWriter;
import java.io.IOException;
import java.util.Date;

import java.util.logging.Logger;

/**
 *
 * @author narayan.punekar@yahoo.com
 */
public class CurrentTime extends TagSupport {
    private static final Logger log = Logger.getLogger(CurrentTime.class.getName());

    public int doStartTag() {
        try {
            JspWriter out = pageContext.getOut();
            out.print("Server Current Time " + new Date());
        } catch (IOException e) {
            log.info("Exception" + e.toString());
            log.warning("Exception" + e.toString());
            e.printStackTrace();
            throw new ExceptionInInitializerError(e.toString());
        }
        
        return SKIP_BODY;
    }
    
    
    
}
