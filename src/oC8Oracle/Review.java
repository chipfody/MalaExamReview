package oC8Oracle;

public class Review {
}
class Zoo {
    protected String coolMethod(){
        return "Wow Baby";
    }
    public boolean givesMilk() {
        return false;
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        System.out.println(zoo.coolMethod());
    }
}

class ReferenceTest{
    public static void main(String[] args) {
        int a = 1;
        ReferenceTest rt = new ReferenceTest();
        System.out.println("Before modify a = " + a);
        rt.modifyPrimitive(a);
        System.out.println("After modify a = " + a);
        a = rt.modifyPrimitive(a);
        System.out.println("After re-assigning a = " + a);
    }
    int modifyPrimitive(int x) {
        x = x + 1;
        System.out.println("Integer in method = " + x);
        return x;
    }

    ReferenceTest modifyObject (ReferenceTest rt) {
        return rt;
    }
}

