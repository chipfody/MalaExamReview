package oC8Oracle;

public class Moo  extends Zoo{

    public String coolMethod(int x) {
        return "Moo Baby";
    }
    public boolean givesMilk() {
        return true;
    }
    public static void main(String[] args) {
        Zoo moo = new Zoo();
        Zoo moo1 = new Moo();
        Moo moo2 = new Moo();

        System.out.println(("A zoo says, " + moo.coolMethod()));
        System.out.println(("A zoo says, " + moo1.coolMethod()));
        System.out.println(("A zoo says, " + moo2.coolMethod()));
        System.out.println(("A zoo says, " + moo2.coolMethod(4)));
//        System.out.println(("A zoo says, " + moo1.coolMethod(4)));

        System.out.println(moo.givesMilk());
        System.out.println(moo1.givesMilk());
        System.out.println(moo2.givesMilk());
        System.out.println((((Moo) moo1).givesMilk()));



    }
}

interface Gadget {
    void doStuff();

}

abstract class Electronic {
    void getPower() {
        System.out.println("Plug In ");
    }
}

class Tablet extends Electronic implements Gadget {
    public void doStuff() {
        System.out.println("Show book ");
    }

    public static void main(String[] args) {
        new Tablet().getPower();
        new Tablet().doStuff();
    }
}

class Animal {
    Animal (String name) {
        System.out.println("The Animal's name is " + name);
    }
}

class Horse extends Animal {
    Horse() {
        super("Rusty");
        System.out.println("The Horse named");
    }

    public static void main(String[] args) {
        Horse horse = new Horse();

    }
}

