package examples.hibernate.user.dao;

import examples.hibernate.user.User;

import java.util.List;

public interface UserDao {

    void create(User user);

    User read(Integer id);

    void update(User user);

    void delete(User user);

    List<User> findAll();

}
