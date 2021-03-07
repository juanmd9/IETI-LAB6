package co.edu.escuelaing.ieti.taskPlanner.service.impl;

import co.edu.escuelaing.ieti.taskPlanner.model.User;
import co.edu.escuelaing.ieti.taskPlanner.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private User user = User.builder()
            .id(Long.parseLong("1"))
            .name("Juan")
            .lastName("Munoz")
            .email("juan@mail.com")
            .password("123")
            .build();
    private User user1 = User.builder()
            .id(Long.parseLong("2"))
            .name("Daniel")
            .lastName("Fernandez")
            .email("daniel@mail.com")
            .password("0987")
            .build();

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        return users;
    }

    @Override
    public User getById(String userId) {
        return user;
    }

    @Override
    public User create(User user) {
        return user;
    }

    @Override
    public User update(User user) {
        return user;
    }

    @Override
    public void remove(String userId) {

    }
}
