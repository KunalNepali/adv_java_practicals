import java.sql.*;

public class UpdateAndDeleteData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Update example
            String updateQuery = "UPDATE contacts SET last_name = ? WHERE first_name = ?";
            PreparedStatement updateStmt = connection.prepareStatement(updateQuery);
            updateStmt.setString(1, "Smith");
            updateStmt.setString(2, "John");

            int rowsUpdated = updateStmt.executeUpdate();
            System.out.println("Rows updated: " + rowsUpdated);

            // Delete example
            String deleteQuery = "DELETE FROM contacts WHERE first_name = ?";
            PreparedStatement deleteStmt = connection.prepareStatement(deleteQuery);
            deleteStmt.setString(1, "John");

            int rowsDeleted = deleteStmt.executeUpdate();
            System.out.println("Rows deleted: " + rowsDeleted);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}