package students;

import java.util.Objects;

public class Support extends User {
    private String city;

    public Support(String name, String phone, String city) {
        super(name, phone);
        this.city = city;
    }

    public Support() {}

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Support support = (Support) o;
        return city.equals(support.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), city);
    }

    public void say() {
        System.out.println("I'm support");
    }

    public void hi() {}
}
