import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeConnection {
	public static int registerEmployee(Employee employee) {
		int status = 0;
		Connection con;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/college";
			con = DriverManager.getConnection(url, "root", "root");
			System.out.println("connected succesfully");

			PreparedStatement ps = con.prepareStatement(
					"insert into customer(first_Name,last_Name,username,password,address,contact) values(?,?,?,?,?,?)");
			 System.out.println(ps);
			ps.setString(1, employee.getFirstName());
			ps.setString(2, employee.getLastName());
			ps.setString(3, employee.getUsername());
			ps.setString(4, employee.getPassword());
			ps.setString(5, employee.getAddress());
			ps.setString(6, employee.getContact());
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
}
