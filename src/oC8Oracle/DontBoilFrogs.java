package oC8Oracle;

interface FrogBoilable {
    static int getCtoF(int temp) {
        return (temp * 9 / 5) + 32;
    }
    default String hop() {
        return "Hopping";
    }
}

public class DontBoilFrogs implements FrogBoilable {
    public static void main(String[] args) {
        new DontBoilFrogs().go();
    }


    void go() {
        System.out.println(hop());
//        System.out.println(getCtoF(100));
        System.out.println(FrogBoilable.getCtoF(100));
        DontBoilFrogs dbf = new DontBoilFrogs();
//        System.out.println(dbf.getCtoF(100));
        FrogBoilable fb = new DontBoilFrogs();
//        System.out.println(fb.getCtoF(100));
    }
}

class Top {

    public Top(String s) {
        System.out.print("B");
    }
}

    class Bottom extends Top {
        public Bottom(String s) {
            super(s);
            System.out.print("D");
        }

        public static void main(String[] args) {
            new Bottom("C");
            System.out.println("");
        }
    }

class Clidder{
    private final void flipper(){
        System.out.println("Clidder");
    }
}

class Clidet extends Clidder {
    public final void flipper() {
        System.out.println("Clidet");
    }

    public static void main(String[] args) {
        new Clidet().flipper();
    }
}

class Bird {
    { System.out.print("b1 "); }
    public Bird() { System.out.print("b2 "); }
}
class Raptor extends Bird{
    static {System.out.print("r1 "); }
    public Raptor() { System.out.print("r2 "); }
    {System.out.print("r3 "); }
     static {System.out.print("r4 "); }
}

class Hawk extends Raptor {
    public static void main(String[] args) {
        System.out.print("pre ");
        new Hawk();
        System.out.print("hawk ");
    }
}


class Dog {
    public void bark() {
        System.out.print("woof ");
    }
}

class Hound extends Dog{
    public void sniff() {
        System.out.print("sniff ");
            }
            public void bark() {
                System.out.println("Howl ");
            }
}
class DogShow {
    public static void main(String[] args) {
         new DogShow().go(); }
        void go () {
            new Hound().bark();
            ((Dog) new Hound()).bark();
            new Hound().sniff();
            new Dog().bark();
        }
}

class Tree{}

class Redwood extends Tree {
    public static void main(String[] args) {
        new Redwood().go();
    }
    void go() {
        go2(new Tree(), new Redwood());
        go2(new Tree(), new Redwood());
    }
    void go2(Tree t1, Redwood r1) {
        Redwood r2 = (Redwood) t1;
        Tree t2 = (Tree) r1;
    }
}

class Tenor extends Singer {
    public static String sing() {return "fa";}

    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s = new Tenor();
        System.out.println(t.sing() + " " + s.sing());
    }
}
class Singer {public static String sing() { return "la";}}



interface I1 {
    default int doStuff() {return 1;}
}

interface I2 {
    default int doStuff() { return 2; }
}

class MultiInt implements I1, I2 {
    public static void main(String[] args) {
        new MultiInt().go();
    }
        void go () {
            System.out.println(doStuff());
        }
        public int doStuff () {
            return 3;
        }
    }

    interface MyInterface {
    static int doStuff() {
        return 42;
        }
    }

    class IfaceTest implements MyInterface {
        public static void main(String[] args) {
            new IfaceTest().go();
        }
        void go() {
            System.out.println("class:" + MyInterface.doStuff());
        }

        public int doStuff() {
            return 43;
        }
    }

