package oC8Oracle;

public class Moo  extends Zoo{

    public String coolMethod(int x) {
        return "Moo Baby";
    }
    public static void main(String[] args) {
        Zoo moo = new Zoo();
        Zoo moo1 = new Moo();
        Moo moo2 = new Moo();
        System.out.println(("A zoo says, " + moo.coolMethod()));
        System.out.println(("A zoo says, " + moo1.coolMethod()));
        System.out.println(("A zoo says, " + moo2.coolMethod()));
//        System.out.println(("A zoo says, " + moo1.coolMethod(4)));
        System.out.println(("A zoo says, " + moo2.coolMethod(4)));
    }
}
