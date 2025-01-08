package Controller;

import Model.Database;
import Model.User;
import View.Notification;

import java.sql.SQLException;

public class CreateUser {
    public CreateUser(User u, Database database){
        String insert = "INSERT INTO `users` (`firstName`,`lastName`,`email`," + "`password`)" +
                " VALUES ('"+u.getFirstName()+"','"+u.getLastName()+"','"+u.getEmail()+"','"+u.getPassword()+"');";
        try {
            database.getStatement().execute(insert);
        } catch (SQLException e) {
            new Notification(e.getMessage(), null);
        }
    }

    public boolean isEmailUsed
}
