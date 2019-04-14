package com.zwx.tag;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.Writer;

public class loginTag extends BodyTagSupport {

    @Override
    public int doStartTag() throws JspException {
        HttpSession session = pageContext.getSession();
        String email = (String) session.getAttribute("user");
        if (email == null){
            return EVAL_BODY_INCLUDE;//标签体会被执行
        }else{
            return SKIP_BODY;
        }
    }
}
