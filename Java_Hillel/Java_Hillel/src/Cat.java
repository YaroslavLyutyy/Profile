import java.io.IOException;

public class Cat {
    public String name;
    private int age; // Инкапсуляция
    public char sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
//            throw new IllegalArgumentException();
//            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void meow() throws IOException {
        System.out.println(name + " says Meow!");
        throw new IOException("Strange error!");
    }

    public String greets() {
        return name + " " + age;
    }

    public int summ(int a, int b) {
        return a + b;
    }
    public int summ(int a, int b, int c) {
        return a + b + c;
    }
    public int summ(int a, String b, int c) {
        return a + c;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

}
