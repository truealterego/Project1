package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

       userService.createUsersTable();

        userService.saveUser("Мэй", "Райдэн", (byte) 28);
        userService.saveUser("Элизия", "Херршер Эго", (byte) 20);
        userService.saveUser("Киана", "Каслана", (byte) 17);
        userService.saveUser("Хуа", "Фу", (byte) 50);

        userService.getAllUsers();

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
