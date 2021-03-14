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