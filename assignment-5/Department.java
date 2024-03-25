import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class DepartmentDatabase {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/departments";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        Department department = new Department(1, "IT");

        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String query = "INSERT INTO department (id, name) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, department.getId());
            preparedStatement.setString(2, department.getName());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new department was inserted successfully.");
            } else {
                System.out.println("Failed to insert department.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
