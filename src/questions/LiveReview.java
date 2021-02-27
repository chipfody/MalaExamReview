package questions;

import java.util.ArrayList;
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

//ME-Q33
class ColorPack {
    static int shadeCount = 12;
    int getShadeCount() {
        return shadeCount;
    }
}
class Artist {
    public static void main(String args[]) {
        ColorPack pack1 = new ColorPack();
        System.out.println(pack1.getShadeCount());
    }
}

//ME-Q34
class Laptop {
    String memory = "1 GB";
}
class Workshop {
    public static void main(String args[]) {
        Laptop life = new Laptop();
        repair(life);
        System.out.println(life.memory);
    }
    public static void repair(Laptop laptop) {
        laptop.memory = "2 GB";
    }
}

//ME-Q35
class Application {
    public static void main(String... args) {
        double price = 10;
        String model;

        if (price > 10)
            model = "Smartphone";
        else if (price <= 10)
            model = "landline";
        else model = "noline";
        System.out.println(model);
    }
}

//ME-Q38
class Book {
    String ISBN;
    Book(String val) {
        ISBN = val;
    }
}
class TestEquals {
    public static void main(String... args) {
        StringBuilder sb1 = new StringBuilder(5*10);
        sb1.append("New");
        sb1.insert(3, 'P');
        System.out.println(sb1);
        Book b1 = new Book("1234-4657");
        Book b2 = new Book("1234-4657");
        Book b3 = b1;
        System.out.print(b1.equals(b2) +":" );
        System.out.print((b1 == b2) + " : ");
        System.out.print(b3.equals(b1));
    }
}

//ME-Q41
class EJGArrayL {
    public static void main(String args[]) {
        ArrayList<String> seasons = new ArrayList<>();
        System.out.println(seasons.size());
        seasons.add("Seasons:");
        seasons.add(1, "Spring");
        seasons.add(2, "Summer");
        seasons.add(3, "Autumn");
        seasons.add(4, "Winter");
        seasons.remove(2);
        for (String s : seasons)
            System.out.print(s + ", ");
    }
}

//ME-Q43
class Whale {
    public static void main(String args[]) {
        boolean hungry = false;

        while (hungry=true) { //the condition actually re-assigns hungry to true so the loop will execute infinitely
            ++Fish.count;
        }
        System.out.println(Fish.count);
    }
}
class Fish {
    static byte count;
}

//ME-Q44
class Phones {
    public static void main(String args[]) {
        String phones[]= {"BlackBerry", "Android", "iPhone"};
        for (String phone : phones)
            System.out.println(phone);
    }
}

//ME-Q45
    class Conversion {
    Byte b1 = (byte) 100; // 1
    Integer i1 = (int) 200; // 2
    Long l1 = (long) 300; // 3
    //Float f1 = (float) b1 + (int) l1; // 4  can not cast int to a Long
    //String s1 = 300; // 5  can not assign and int to a String
    //if(s1 ==(b1 + i1)) // 6 can not compare a String to wrapper class
    //s1 =(String)500; // 7  can not assign an int to a string by casting -- need to use .valueOf()
        //else // 8
    //f1 =(int)100; // 9  can not convert an int to a Float
       // System.out.println(s1 +":"+f1); // 10
}


