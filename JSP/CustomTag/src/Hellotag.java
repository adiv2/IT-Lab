import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.util.Date;

public class Hellotag extends TagSupport
{
    public int doStartTag() throws JspTagException
    {
        return EVAL_BODY_INCLUDE;
    }
    public int doEndTag() throws JspTagException
    {
        String d = new Date().toString();
        try
        {
           pageContext.getOut().write("Hello this is simple JSP custpm tag <\br>");
            pageContext.getOut().write("Current date is "+d);
        }
        catch(IOException e){}

        return EVAL_PAGE;
    }

}
