import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/cabecera"})
public class cabecera extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InfoCabecera</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>USO DE INFOCABECERAS</h1>");
            out.println("<h2>Nombre: DAVID HECTOR CANAZA MAYTA</h2>");
            out.println("<h2>Materia: EMERGENTES II</h2>");
            
            Enumeration e = request.getHeaderNames();
            while (e.hasMoreElements()){
                String cabe = (String) e. nextElement();
                String value = request.getHeader(cabe);
                out.println(cabe + "=" + value + "<br>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}


