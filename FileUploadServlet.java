import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.oreilly.servlet.*;  //jar:-  cos.jar

public class FileUploadServlet extends GenericServlet
{
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
String path=getServletContext().getRealPath("/file");
MultipartRequest mpr=new MultipartRequest(req, path,500*1024*1024);
String s1=mpr.getOriginalFileName("file");
out.println("<html><body>");
out.println("file uploaded successfully");
out.println("</body></html>");
}
}