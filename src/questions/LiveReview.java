package questions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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

//ME-Q47
    class Q47 {
    public static void main(String[] args) {

        int a = 10;
        for (; a <= 20; ++a) {
            System.out.println("a = " + a);
            if (a % 3 == 0) {
                a++;
            }
            else if (a % 2 == 0) {
                a = a * 2;

            }
            System.out.println(a);
        }
        System.out.println("a at the end = " + a);
    }
}

class Practice {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; ++i) {

            for (int j = 0; j < 3; j++)

                System.out.println("i = " + i + " : j = " + j);
        }
    }
}

//ME-Q50
class Op {
    public static void main(String... args) {
        int a = 0;
        int b = 100;
        Predicate<Integer> compare = (var) -> var++ == 10;
        if (!(b++ > 100) && compare.test(a)) {
            System.out.println(a + b);
        } else System.out.println("no output");
    }
}

//ME-Q52
class Phone {
    void call() {
        System.out.println("Call-Phone");
    }
}
class SmartPhone extends Phone{
    void call() {
        System.out.println("Call-SmartPhone");
    }
}
class TestPhones {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone smartPhone = new SmartPhone();
        phone.call();
        smartPhone.call();
    }
}

//ME-Q53
class Phone3 {
    String keyboard = "in-built";
    void picture()
    { System.out.println("phone method");
    }
}
class Tablet extends Phone3 {
    boolean playMovie = false;
    void picture() {
        System.out.println("tablet method");
    }
}
class College2 {
    public static void main(String args[]) {
        Phone3 phone = new Tablet();
        Tablet tablet = new Tablet();
        Phone3 phone1 = new Phone3();
//        Tablet tablet1 = new Phone3();
        System.out.println(phone.keyboard + ":" + ((Tablet)phone).playMovie);
        System.out.println(tablet.keyboard + ":" + tablet.playMovie);
//        System.out.println(phone1.keyboard + ":" + ((Tablet)phone1).playMovie);
        phone.picture();
        tablet.picture();
        phone1.picture();
    }
}

//ME-Q54
class Wall {
    public static void main(String args[]) {
        double area = 10.98;
        String color;
        if (area < 5)
            color = "red";
//        if (area >= 5)
          else   color = "blue";
        System.out.println(color);
    }
}

//ME-Q55
class Diary {
    int pageCount = 100;
    int getPageCount() {
        return pageCount;
    }
    void setPageCount(int val) {
        pageCount = val;
    }
}

class ClassRoom {
    public static void main(String args[]) {
        System.out.println(new Diary().getPageCount());
        new Diary().setPageCount(200);
        Diary diary = new Diary();
        diary.setPageCount(200);
        System.out.println(new Diary().getPageCount());
        System.out.println(diary.getPageCount());
    }
}

//ME-Q56
class Shopping {
    public static void main(String args[]) {
        boolean bankrupt = true;
        do {
            System.out.println("enjoying shopping");
            bankrupt = false;
    } while (!bankrupt);
    }
}

//ME-Q58
class Laptop2 {
    String memory = "1GB";
}
class Workshop2 {
    public static void main(String args[]) {
        Laptop2 life = new Laptop2();
        repair(life);
        System.out.println(life.memory);
    }
    public static void repair(Laptop2 laptop) {
        laptop = new Laptop2();
        laptop.memory = "2GB";
    }
}

//ME-Q59
interface Roamable{}
class Phone4 {}
class Tablet2 extends Phone4 implements Roamable {
//    Roamable var = new Phone4();  -- would need to cast Phone to Roamable
//    Roamable var = (Roamable)Phone4();  -- would compile if you inserted "new"
    Roamable var = (Roamable)new Phone4(); //compiles, but will create a ClassCastException at runtime
}

//ME-Q60
class Paper {
    Paper() {
        this(10);
        System.out.println("Paper:0");
    }
    Paper(int a) { System.out.println("Paper:1"); }
}
class PostIt extends Paper {}
class TestPostIt {
    public static void main(String[] args) {
        PostIt paper = new PostIt();
    }
}

//ME-Q62
interface Jumpable {
    int height = 1;
    default void worldRecord() {
        System.out.print(height);
    }
}
interface Moveable2 {
    int height = 2;
    static void worldRecord() {
        System.out.print(height);
    }
}
class Chair implements Jumpable, Moveable2 {
    int height = 3;

    Chair() {
        worldRecord();
    }

    public static void main(String args[]) {
        Jumpable j = new Chair();
        Moveable2 m = new Chair();
        Chair c = new Chair();
        Moveable2.worldRecord();
    }
}

    //ME-Q64
    class Person10 {
        Person10 (){}
        Person10(String value) {}
    }
class Employee extends Person10 {}
class Test {
    public static void main(String args[]) {
        Employee e = new Employee();
    }
}

//ME-Q68
class EMyMethods {
    static String name = "m1";
    void riverRafting() {
        String nameq = "m2";
        if (8 > 2) {
            String name = "m3";
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        EMyMethods m1 = new EMyMethods();
        m1.riverRafting();
    }
}

//ME-Q70
class SwJava {
    public static void main(String args[]) {
        String[] shapes = {"Circle", "Square", "Triangle"};
        for (int i = 0; i < shapes.length; i++)
        switch (shapes[i]) {
            case "Square": System.out.println("Circle"); break;
            case "Triangle": System.out.println("Square"); break;
            case "Circle": System.out.println("Triangle"); break;
        }
    }
}

//ME-Q73
class Course {
    static int enrollments;
}
class TestEJavaCourse {
    public static void main(String args[]) {
        Course c1 = new Course();
        Course c2 = new Course();
        Course c3 = new Course();
        c1.enrollments = 100;
        c2.enrollments = 200;
        c3.enrollments = 300;
        System.out.println(c1.enrollments + c2.enrollments);
    }
}

//ME-Q74
class Q74 {
    public static void main(String[] args) {
        String ejgStr[] = new String[][]{{null},new String[]{"a","b","c"},{new
                String()}}[0] ;
        String ejgStr1[] = null;
        String ejgStr2[] = {null};
        System.out.println(ejgStr[0]);
        System.out.println(ejgStr2[0]);
        System.out.println(ejgStr1[0]);
    }
}

//ME-Q75
class Person11 {}
class Emp extends Person {}
class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new String("1234")); //LINE1
        list.add(new Person()); //LINE2
        list.add(new Emp()); //LINE3
        list.add(new String[]{"abcd", "xyz"}); //LINE4
        list.add(LocalDate.now().plusDays(1)); //LINE5
    }
}

class FeedingSchedule {
public static void main(String[] args) {
       int x = 5, j = 0;
       OUTER: for(int i=0; i<3; )

            INNER: do {
                System.out.println("x = " + x + " j = " + j + " i = " + i);
            i++; x++;
            if(x > 10) break INNER;
            x += 4;
            j++;
            } while(j <= 2);
        System.out.println(x);
        } }

class Deer {
    public Deer() {
        System.out.print("Deer");
    }

    public Deer(int age) {
        System.out.print("DeerAge");
    }

    private boolean hasHorns() {
        return false;
    }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println("," + deer.hasHorns());
    }
}

class Reindeer extends Deer {
    public Reindeer(int age) {
        System.out.print("Reindeer");
    }

    public boolean hasHorns() {
        return true;
    }
}

class Egret {
 private String color;
public Egret() {
        this("white");
        }
public Egret(String color) {
        this.color = color;
        }
public static void main(String[] args) {
        Egret e = new Egret();
        System.out.println("Color:" + e.color);
        }
}