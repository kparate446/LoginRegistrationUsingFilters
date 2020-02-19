import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginConnection {
	public boolean validate(Login login) throws ClassNotFoundException {
        boolean status = false;
        Class.forName("com.mysql.jdbc.Driver");
        // Driver Connection 
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
        		
            PreparedStatement preparedStatement = connection
            .prepareStatement("select * from employee where username = ? and password = ? ")) {
            preparedStatement.setString(1, login.getUsername());
            preparedStatement.setString(2, login.getPassword());
            
            System.out.println(preparedStatement);
            // Store the Result
            ResultSet rs = preparedStatement.executeQuery();// Fetching the data
            status = rs.next();// next row

        } catch (SQLException e) {
            System.out.println("Exception : "+e);
        }
        // return True/False
        return status;
    }
}
