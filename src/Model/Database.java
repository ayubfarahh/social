package Model;
import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Database {
    private Statement statement;
  public Database() {
      try {
          Connection connection = DriverManager.getConnection(
                  "jdbc:mysql://127.0.0.1:3306/social",
                  "student",
                  "student"
          );
          statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
      } catch (SQLException e) {
          e.printStackTrace();
      }
    public Statement getStatement() {
          return statement;
      }
  }
}
