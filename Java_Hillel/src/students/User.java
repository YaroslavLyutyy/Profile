package students;

import java.util.Objects;

public abstract class User implements UserI {
    private int id;
    private String name;
    private String phone;


    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public User() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name) && phone.equals(user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }

    public abstract void say();

    public abstract void hi();

    @Override
    public void a() {

    }

    @Override
    public int b() {
        return 0;
    }
}
