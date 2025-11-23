package manager;

import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserManager {
    private final List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public Optional<User> findUserById(String id) {
        return users.stream().filter(u -> u.getId().equals(id)).findFirst();
    }

    public List<User> listUsers() {
        return new ArrayList<>(users);
    }
}
