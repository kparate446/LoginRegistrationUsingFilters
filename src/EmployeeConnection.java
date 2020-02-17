import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeConnection {
	/*
	 * public int registerEmployee(Employee employee) throws ClassNotFoundException
	 * { String Query = "INSERT INTO customer" +
	 * " (first_name, last_name, username, password, address, contact) VALUES "
	 * +"(?,?,?,?,?,?,?);"; int result = 0; Class.forName("com.mysql.jdbc.Driver");
	 * 
	 * try (Connection connection =
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root",
	 * "root");
	 * 
	 * // Step 2:Create a statement using connection object PreparedStatement
	 * preparedStatement = connection.prepareStatement(Query)) { //
	 * preparedStatement.setInt(1, 1); preparedStatement.setString(2,
	 * employee.getFirstName()); preparedStatement.setString(3,
	 * employee.getLastName()); preparedStatement.setString(4,
	 * employee.getUsername()); preparedStatement.setString(5,
	 * employee.getPassword()); preparedStatement.setString(6,
	 * employee.getAddress()); preparedStatement.setString(7,
	 * employee.getContact());
	 * 
	 * System.out.println(preparedStatement); result =
	 * preparedStatement.executeUpdate();
	 * 
	 * } catch (Exception e) { System.out.println("Exception : "+e); } return
	 * result; }
	 */
	
	
	public static int registerEmployee(Employee employee) {
		
		int status=0;
		Connection con;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/college";
			con=DriverManager.getConnection(url,"root","root");
			System.out.println("connected succesfully");

			PreparedStatement ps=con.prepareStatement("insert into customer(first_Name,last_Name,username,password,address,contact) values(?,?,?,?,?,?)");
	
			ps.setString(1,employee.getFirstName());
			ps.setString(2,employee.getLastName());
			ps.setString(3,employee.getUsername());
			ps.setString(4,employee.getPassword());
			ps.setString(5,employee.getAddress());
			ps.setString(6,employee.getContact());
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		    {
			System.out.println(e);
			}
		return status;
	}
}
