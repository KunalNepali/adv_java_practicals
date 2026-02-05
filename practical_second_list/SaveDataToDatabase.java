import java.sql.*;

public class SaveDataToDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "INSERT INTO contacts (first_name, last_name, contact_number) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);

            // Sample data
            String firstName = "John";
            String lastName = "Doe";
            String contactNumber = "1234567890";

            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, contactNumber);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data saved successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}