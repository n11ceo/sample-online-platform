package ru.mephi.onlineplatform.repository;

import ru.mephi.onlineplatform.entities.SystemRole;
import ru.mephi.onlineplatform.entities.User;

import java.util.List;

/**
 * @author Stanislav_Semichevskiy
 */
public interface UserDao {

    User save(User user);

    User edit(Long id, User user);

    void delete(Long id);

    List<User> selectByRole(SystemRole systemRole);
}
