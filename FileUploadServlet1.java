import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.oreilly.servlet.*;

public class FileUploadServlet1 extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
{
try
{
res.setContentType("text/html");
//String s="India is good counrty";
//FileInputStream in=new FileInputStream(s);
ServletInputStream in=req.getInputStream();
ServletOutputStream out=res.getOutputStream();
FileOutputStream fout=new FileOutputStream("D:\\Test.txt");
int i=0;

while((i=in.read())!=-1)
{
fout.write(i);
}
}
catch(Exception e)
{
}
}
}