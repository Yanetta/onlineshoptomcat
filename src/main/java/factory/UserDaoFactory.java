package factory;

import dao.UserDao;
import dao.impl.UserDaoImpl;

public class UserDaoFactory {
    private UserDaoFactory() {
    }

    private static UserDao instance;
    public static synchronized UserDao getUserDao(){
        if (instance == null){
            instance = new UserDaoImpl();
        }
        return instance;
    }
}
