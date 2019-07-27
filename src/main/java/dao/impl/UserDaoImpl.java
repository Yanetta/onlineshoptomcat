package dao.impl;

import dao.UserDao;
import model.User;
import org.apache.log4j.Logger;
//import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
   private static final Logger logger = Logger.getLogger(UserDaoImpl.class);
    List <User> userList = new ArrayList<User>();
    public void addUser(User user) {
        userList.add(user);
      logger.info("User" + user + "added in db");
    }

    public List<User> getAll() {
        return userList;
    }
}
