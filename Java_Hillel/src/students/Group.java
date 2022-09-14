package students;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private User[] users;
    private List<User> userList;

    public Group() {
        this.users = new User[0];
        this.userList = new ArrayList<>();
    }

    public void add(User user) {
        User[] newArr = new User[this.users.length + 1];
        for (int i = 0; i < this.users.length; i++) {
            newArr[i] = this.users[i];
        }
        newArr[newArr.length - 1] = user;
        this.users = newArr;
    }

    public void addToList(User user) {
        userList.add(user);
    }

    public void remove(User user) {
        User[] newArr;
        boolean found = false;
        for (int i = 0; i < this.users.length; i++) {
            if (this.users[i].equals(user)) {
                found = true;
                this.users[i] = null;
            }
        }
        if (found) {
            newArr = new User[this.users.length - 1];
            int j = 0;
            for (int i = 0; i < this.users.length; i++) {
                if (this.users[i] != null) {
                    newArr[j] = this.users[i];
                    j++;
                }
            }
            this.users = newArr;
        }

    }

    public void removeFromList(User user) {
        userList.remove(user);
    }

    public User[] getUsers() {
        return this.users;
    }
}
