package dao.impl;

import dao.UserDao;
import model.User;
import org.apache.log4j.Logger;
//import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {
    private static final Logger logger = Logger.getLogger(UserDaoImpl.class);
    private static List<User> userList = new ArrayList<User>();
    static {
        userList.add(new User("admin@gmail.com", "admin","admin"));
    }

    public void addUser(User user) {
        userList.add(user);
        logger.info("User" + user + "added in db");
    }

    public List<User> getAll() {
        return userList;
    }

    @Override
    public Optional<User> findUserByEmail(String email) {
        return userList.stream().filter(user -> user.getEmail().equals(email)).findFirst();
    }

    @Override
    public void deleteUser(Long id) {
        Optional<User> optUserForDeletion = userList.stream().filter(user -> user.getId().equals(id)).findFirst();
        if (optUserForDeletion.isPresent()) {
            userList.remove(optUserForDeletion.get());
            logger.info("User with Id " + id + "deleted from db");

        } else {
            logger.info("User with Id " + id + "does not exist in db");

        }
    }
}
