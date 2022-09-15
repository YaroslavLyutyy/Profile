package students;

public class Student extends User {
    private int strikes;

    public Student(String name, String phone) {
        super(name, phone);
    }

    public Student() {}

    public Student(String name, String phone, int strikes) {
        super(name, phone);
        this.strikes = strikes;
    }

    public int getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    public void say() {
        System.out.println("I'm student");
    }

    public void hi() {}
}
