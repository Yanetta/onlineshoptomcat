package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import factory.UserDaoFactory;
import model.User;
import service.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    private static final UserDao userDao = UserDaoFactory.getUserDao();

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public Optional<User> findUserByEmail(String email) {
        return userDao.findUserByEmail(email);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
}
