package smartshop.dao;

import java.util.List;
import smartshop.model.entity.UserEntity;

public interface UserDao {
    void addUser(UserEntity user);
    UserEntity getUser(int id);
    List<UserEntity> getUsers();
    void deleteUser(int id);
}
