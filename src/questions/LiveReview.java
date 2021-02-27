package questions;

import java.util.function.Predicate;

public class LiveReview {
}

//ME-Q11
interface Moveable {
    int move(int distance);
}
class Person {
    static int MIN_DISTANCE = 5;
    int age;
    float height;
    boolean result;
    String name;
}
class EJava {
    public static void main(String arguments[]) {
        Person person = new Person();
        Moveable moveable = (x) -> Person.MIN_DISTANCE + x;
        System.out.println(person.name + person.height + person.result
                + person.age + moveable.move(20));
    }
}

//ME-Q12
class Printer {
    int inkLevel;
}
class LaserPrinter extends Printer {
    int pagesPerMin;
    public static void main(String args[]) {
        Printer myPrinter = new LaserPrinter();
        System.out.println(((LaserPrinter)myPrinter).pagesPerMin);
    }
}

//ME-Q13 - corrected from book
interface Keys {
    String keypad(String region, int keys);
}
class Handset {
    private static String  model;
    private static double price;

    public static void main(String... args) {

        Keys varKeys = (region, keys) ->
        {if (keys >= 32)
            return region; else return "default";};
        System.out.println(model + price + varKeys.keypad("AB", 32));
    }
}

//ME-Q17
class EJava2 {
    static String name;
    public EJava2() {
        System.out.println(name);
    }
    void calc() {
// LINE 2
        if (8 > 2) {
            System.out.println(name);
        }
    }
    public static void main(String... args) {
// LINE 3
        System.out.println(name);
    }
}

//ME-Q22
    class meQ22 {

    public static void main(String[] args) {
        int ctr = 10;
        char[] arrC1 = new char[]{'P', 'a', 'u', 'l'};
        char[] arrC2 = {'H', 'a', 'r', 'r', 'y'};

        for (char c1 : arrC1) {
            for (char c2 : arrC2) {
                if (c2 == 'a') continue;
                ++ctr;
            }
        }
        System.out.println(ctr);
    }
}

//ME-Q26
class MyCalendar {
    public static void main(String arguments[]) {
        Season season1 = new Season();
        season1.name = "Spring";
        Season season2 = new Season();
        season2.name = "Autumn";

//        Predicate<String> aSeason = (s) -> s == "Summer" ?
//                season1.name : season2.name;   --- original code in problem

        Predicate<String> aSeason = (s) -> s == "Summer"; //revised code to run
        season1 = season2;
        System.out.println(season1.name);
        System.out.println(season2.name);
        System.out.println(aSeason.test(new String("Summer")));
    }
}
class Season {
    String name;
}

//ME-Q27
class Shoe {}
class Boot extends Shoe {}
class ShoeFactory {

    ShoeFactory(Boot val) {
        System.out.println("boot");
    }

    ShoeFactory(Shoe val) {
        System.out.println("shoe");
    }

    public static void main(String[] args) {
        Boot boot = new Boot();
        Shoe shoe = new Shoe();
    }
}

//ME-Q29
class EJavaCourse {
    String courseName = "Java";
}
class University {
    public static void main(String args[]) {
        EJavaCourse courses[] = { new EJavaCourse(), new EJavaCourse() };
        courses[0].courseName = "OCA";
        for (EJavaCourse c : courses) System.out.println(c.courseName);
        for (int i = 0; i < courses.length; i++) courses[i] = new EJavaCourse();
            //System.out.println(c.courseName);}
        for (EJavaCourse c : courses) System.out.println(c.courseName);
    }
}


