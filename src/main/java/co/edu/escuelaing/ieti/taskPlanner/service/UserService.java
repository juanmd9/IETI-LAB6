package co.edu.escuelaing.ieti.taskPlanner.service;

import co.edu.escuelaing.ieti.taskPlanner.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getById(String userId);

    User create(User user);

    User update(User user);

    void remove(String userId);
}
