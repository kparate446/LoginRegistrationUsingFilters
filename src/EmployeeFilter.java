

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class EmployeeFilter
 */
@WebFilter("/EmployeeServlet")
public class EmployeeFilter implements Filter {

	public void destroy() {
	
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        // PrintWriter out=response.getWriter();
        // HttpServletRequest req= (HttpServletRequest) request;
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
        System.out.println("1");
        //to give pop up window if user submits blank data
        if (firstName.isBlank() || lastName.isBlank() || username.isBlank() || address.isBlank()) {
            System.out.println("1");
            //httpResponse.sendRedirect("employeeregister.jsp");
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Please Fill Entire Data');");
            out.println("location='employeeregister.jsp';");
            out.println("</script>");
        }
        else 
        	// It is Used the mixture of Contact number
        if (!password.matches("^[a-zA-Z0-9]{3,8}$")) {
            System.out.println("2");
            /* httpResponse.sendRedirect("login3.jsp"); */
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Password should be of max 8 character');");
            out.println("location='employeeregister.jsp';");
            out.println("</script>");
        }else
        // It is used in 10 Digit Contact Number only
         if (!contact.matches("^[0-9]{10}$")) {
            System.out.println("3");
            /* httpResponse.sendRedirect("login3.jsp"); */
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Contact Number should be of 10 digit');");
            out.println("location='employeeregister.jsp';");
            out.println("</script>");
        }
        else {
        	chain.doFilter(request, response);// doFilter --> call the Servlet
        }
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
