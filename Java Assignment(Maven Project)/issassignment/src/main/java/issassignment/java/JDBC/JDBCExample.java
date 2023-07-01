//This program demonstrate the use of JDBC to connect to Database and query from it

package issassignment.java.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


class UserNotFoundException extends RuntimeException {

	UserNotFoundException(String message) {
		super(message);
	}

}

//This class connects to database and provides method to driver class methods for fetching,inserting and deleting data from database. 
class DbOperations{
	private static Statement statement;
	private static PreparedStatement preparedStatement;
	private final static String driver = "com.mysql.cj.jdbc.Driver";
	private final static String connectionUrl = "jdbc:mysql://localhost:3306/employeesystem";
	private final static String username = "root";
	private final static String password = "";
	static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection c = DriverManager.getConnection(connectionUrl, username, password);
		return c;
	}
	
	static void fetch(Connection c) throws SQLException {
		statement = c.createStatement();
		ResultSet result = statement.executeQuery("select * from employee");
		while (result.next()) {
			System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3));
		}
	}

	static void insert(Connection c, Scanner s) throws SQLException {
		System.out.println("Enter ID: ");
		int id = s.nextInt();

		System.out.println("Enter name: ");
		String name = s.next();

		System.out.println("Enter surname: ");
		String surname = s.next();
		preparedStatement = c.prepareStatement("insert into employee value(?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, surname);

		int res = preparedStatement.executeUpdate();

		if (res > 0) {
			System.out.println("Employee inserted");
		} else {
			System.out.println("Something went wrong!");
		}
	}

	static void delete(Connection conn, Scanner scanner) throws SQLException {

		System.out.println("Enter Id to delete: ");
		int id = scanner.nextInt();

		statement = conn.createStatement();
		ResultSet rs = statement.executeQuery("select * from employee where id = " + id);
		if (rs.next()) {
			preparedStatement = conn.prepareStatement("delete from employee where id = ?");
			preparedStatement.setInt(1, id);

			int res = preparedStatement.executeUpdate();

			if (res > 0) {
				System.out.println("Record delete!");
			} else {
				System.out.println("Something went wrong!");
			}
		} else {
			throw new UserNotFoundException("User not found exception!");
		}

	}

	static void update(Connection conn, Scanner scanner) throws SQLException {
		System.out.println("Enter Id to update: ");
		int id = scanner.nextInt();

		statement = conn.createStatement();
		ResultSet rs = statement.executeQuery("select * from employee where id = " + id);
		if (rs.next()) {	

			System.out.println("Enter name to be update: ");
			String name = scanner.next();
			
			preparedStatement = conn.prepareStatement("update employee set name = ? where id = ?");
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, id);

			int res = preparedStatement.executeUpdate();

			if (res > 0) {
				System.out.println("Record update!");
			} else {
				System.out.println("Something went wrong!");
			}
		} else {
			throw new UserNotFoundException("User not found!");
		}

	}

}

//Driver class
public class JDBCExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection conn = DbOperations.getConnection();

		boolean isExit = false;

		System.out.println("==========Employee management system==========");

		while (!isExit) {
			System.out.println("==================");
			System.out.println("Enter your choice");
			System.out.println("1.Insert\n2.Update\n3.Delete\n4.Fetch\n5.Exit");
			System.out.println("==================");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				DbOperations.insert(conn, scanner);
				break;
			}
			case 2: {
				try {
					DbOperations.update(conn, scanner);
					break;
				} catch (UserNotFoundException e) {
					System.out.println(e);
					break;
				}

			}
			case 3: {
				try {
					DbOperations.delete(conn, scanner);
					break;
				} catch (UserNotFoundException e) {
					System.out.println(e);
					break;
				}
			}
			case 4: {
				DbOperations.fetch(conn);
				break;
			}
			case 5: {
				System.out.println("Thank you!!");
				System.exit(0);
			}
			default:
				System.out.println("Please enter valid choice");
			}
		}
		
		conn.close();

	}


}
