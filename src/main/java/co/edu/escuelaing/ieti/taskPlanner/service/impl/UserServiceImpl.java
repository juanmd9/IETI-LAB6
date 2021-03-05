package co.edu.escuelaing.ieti.taskPlanner.service.impl;

import co.edu.escuelaing.ieti.taskPlanner.model.User;
import co.edu.escuelaing.ieti.taskPlanner.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private User user = User.builder()
            .name("Juan")
            .lastName("Munoz")
            .email("juan@mail.com")
            .password("123")
            .build();

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        users.add(user);
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
