
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeConnection connection;

	public void init() {
		connection = new EmployeeConnection();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");// getting the data in
		String lastName = request.getParameter("lastName");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");

		Employee employee = new Employee();
		employee.setFirstName(firstName);// Send the data in pojo class
		employee.setLastName(lastName);
		employee.setUsername(username);
		employee.setPassword(password);
		employee.setContact(contact);
		employee.setAddress(address);

		try {
			connection.registerEmployee(employee);// call the EmployeeConnection.java
		} catch (Exception e) {
			System.out.println("Exception : " + e);
		}
		response.sendRedirect("employeedetail.jsp");
	}
}