import enities.Auto;
import enities.User;
import service.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        /*//add user for car
        UserService userService = new UserService();
        User user = new User("Masha",26);
        userService.saveUser(user);

        Auto ferrari = new Auto("Ferrari", "red");
        //ferrari.setUser(user);
        user.addAuto(ferrari);

        Auto ford = new Auto("Ford", "black");
        //ford.setUser(user);
        user.addAuto(ford);

        userService.updateUser(user);
        */

        /*//change user
        UserService userService = new UserService();
        User user = new User("Masha",26);
        userService.saveUser(user);

        Auto ferrari = new Auto("Ferrari", "red");
        user.addAuto(ferrari);

        Auto ford = new Auto("Ford", "black");
        user.addAuto(ford);

        user.setName("Sasha");
        userService.updateUser(user);
        */

//добавили и сразу удалили
        UserService userService = new UserService();
        User user = new User("Maikl",26);
        userService.saveUser(user);

        Auto ferrari = new Auto("Ferrari", "red");
        user.addAuto(ferrari);

        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);

        userService.updateUser(user);
        userService.deleteUser(user);

    }
}
