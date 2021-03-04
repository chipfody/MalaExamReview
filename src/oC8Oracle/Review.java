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

