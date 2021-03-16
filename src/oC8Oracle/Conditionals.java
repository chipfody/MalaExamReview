package oC8Oracle;

public class Conditionals {
}
class SpecialOps {
    public static void main(String[] args) {
        String s = "";
        boolean b1 = true;
        boolean b2 = false;
        if ((b2 = false) | (21 % 5) > 2) s += "x";
        if (b1 || (b2 = true))  s+= "y";
        if (b2 == true) s += "z";
        System.out.println(s);
    }
}

class Spock {
    public static void main(String[] args) {
        int mask = 0;
        int count = 0;
        if ( ((5 < 7) || (++count < 10)) | mask ++ < 10) mask += 1;
        System.out.println(mask + " " + count);
        if ( (6 > 8) ^ false) mask += 10;
        System.out.println(mask + " " + count);
        if ( !(mask > 1) && ++count > 1)   mask += 100;
        System.out.println(mask + " " + count);
    }
}

interface Vessel{}

interface Toy{}

class Boat implements Vessel{}

class Speedboat extends Boat implements Toy {}

class Tree2 {
    public static void main(String[] args) {
        String s = "0";
        Boat b = new Boat();
        Boat b2 = new Speedboat();
        Speedboat s2 = new Speedboat();
        if ( (b instanceof Vessel) && (b2 instanceof Toy)) s += "1";
        if ( (s2 instanceof Vessel) && (s2 instanceof Toy)) s += "2";
        if (b instanceof Toy) s += "3";
        System.out.println(s);
    }
}

class Loop {
    public static void main(String[] args) {
        outer:
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("Hello");
                    continue outer;
                }
                System.out.println("Outer");
            }
        System.out.println("Goodbye");
    }
}