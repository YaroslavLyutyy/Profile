import com.ibm.icu.text.RuleBasedNumberFormat;
import students.Group;
import students.Student;
import students.Support;
import students.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TestClass {
    static int aaa;
    public static void main(String[] args) throws IOException {

//        User user2 = new User();

        User[] students = new User[] {new Student(), new Support(), new Student()};


        Group group = new Group();
//        User user = new User("Vasya1", "12354236");
        Student student = new Student("Vasya2", "12354236");
        Student student2 = new Student("Vasya3", "12354236", 0);
        Support supp1 = new Support("Vasya4", "12345", "Odessa");
        Support supp2 = new Support("Vasya5", "12345", "Odessa");
        System.out.println(supp1.equals(supp2));

//        group.add(user);
        group.add(student);
        group.add(student2);
        group.remove(student);

        List<User> list = new ArrayList<>();

//        list.add(user);
        list.add(supp1);
        list.add(student2);

        for (User u: list) {
            u.say();
        }

        int number = 783412389;

        RuleBasedNumberFormat ruleBasedNumberFormat = new RuleBasedNumberFormat( new Locale("RU", "UA"), RuleBasedNumberFormat.SPELLOUT );
        System.out.println(ruleBasedNumberFormat.format(number));


//        Cat myCat = new Cat();
//        myCat.name = "Murzik";
//        myCat.setAge(5);
//        myCat.sex = 'm';
//
//        try {
//            myCat.meow();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Ya vsegda vipolnyus naposledok");
//        }
//
//
//
//        Cat myCat2 = new Cat();
//        myCat2.name = "Murka";
//        myCat2.setAge(3);
//        myCat2.sex = 'f';
//        try {
//            myCat2.meow();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(myCat2.greets());
//
//        Cat myCat3 = myCat;
//        myCat3.setAge(-7);
//        myCat3.name = "Rrrrrr";
//        System.out.println(myCat.getAge());
//
//        System.out.println("Hello Java");
//
//        System.out.println(myCat.summ(12, "", 345));
//        System.out.println(myCat.summ(12, 345));
//        System.out.println(myCat.summ(12, 345, 2354));
//
//
//
//        System.out.println(myCat);

    }

//        int a = 3425;
//
//
//        aaa = 3546;
//
//        float b = 0.234f;
//        double c = 0.2134;
//        long d = 3245;
//        short e = 342;
//        byte f = 45;
//        boolean g = true;
//        char h = 'R' + 1;
//
//        byte someVar = 127;
//
//
//        String myStr = "abcd";
//
//        System.out.println(myStr.indexOf('g'));

//        int[] arr = {123, 1243, 3457, 1234, 5, 345};
//        int[] arr2 = new int[8];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 1000) {
//                System.out.println(arr[i]);
//            }
//        }
//
////        var aaa = 43;
//
//
//    }
//    public void someMethod() {
//        System.out.println(aaa);
//    }
}
