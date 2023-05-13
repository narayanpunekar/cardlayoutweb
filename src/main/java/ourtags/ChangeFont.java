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
public class ChangeFont extends TagSupport {
    private static final Logger log = Logger.getLogger(ChangeFont.class.getName());

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            out.print("<H1>");
        } catch (IOException e) {
            log.info("Exception" + e.toString());
            log.warning("Exception" + e.toString());
            e.printStackTrace();
            throw new ExceptionInInitializerError(e.toString());
        }
        return EVAL_BODY_INCLUDE;
    }

    @Override
    public int doEndTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            out.print("</H1>");
        } catch (IOException e) {
            log.info("Exception" + e.toString());
            log.warning("Exception" + e.toString());
            e.printStackTrace();
            throw new ExceptionInInitializerError(e.toString());
        }
        return SKIP_BODY;
    }

}
