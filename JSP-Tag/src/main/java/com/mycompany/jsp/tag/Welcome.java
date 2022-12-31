/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jsp.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author kpidi
 */
public class Welcome extends TagSupport {

    public String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public int doStartTag() throws JspException {

        try {
            JspWriter out = pageContext.getOut();
            out.print("<h2>CUSTOM World " + msg + "</h2>");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }

}
