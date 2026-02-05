import java.sql.*;

public class ResultSetExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM contacts";
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery(query);

            // Iterate and display results
            System.out.println("Original data:");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " +
                                   resultSet.getString("first_name") + " " +
                                   resultSet.getString("last_name") + " " +
                                   resultSet.getString("contact_number"));
            }

            // Move backward
            if (resultSet.previous()) {
                System.out.println("\nPrevious Row: " + resultSet.getString("first_name"));
            }

            // Update a record
            resultSet.absolute(2); // go to the 2nd row
            resultSet.updateString("contact_number", "9876543210");
            resultSet.updateRow();
            System.out.println("\nUpdated 2nd row.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}