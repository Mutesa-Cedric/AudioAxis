package rca.ac.rw.dao.user;
import java.util.List;

public interface User {
    public void saveUser();
    public void updateUser();
    public void deleteUser();
    public List<rca.ac.rw.orm.User> getUsers();
}
