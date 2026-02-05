import java.sql.*;

public class TransactionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            connection.setAutoCommit(false); // Disable auto-commit

            String insertQuery1 = "INSERT INTO accounts (name, balance) VALUES ('Alice', 5000)";
            String insertQuery2 = "INSERT INTO accounts (name, balance) VALUES ('Bob', 3000)";

            Statement statement = connection.createStatement();

            try {
                statement.executeUpdate(insertQuery1);
                statement.executeUpdate(insertQuery2);

                connection.commit(); // Commit transaction
                System.out.println("Transaction committed successfully!");
            } catch (SQLException e) {
                connection.rollback(); // Rollback transaction in case of error
                System.out.println("Transaction rolled back due to error.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}