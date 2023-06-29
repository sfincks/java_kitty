import java.util.HashSet;

public class OOPMain {

    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik", 100);
        Plate plate = new Plate(100);

        System.out.println(murzik);
        System.out.println(plate);

        murzik.eat(plate);
        murzik.eat(plate);


        System.out.println(murzik);
        System.out.println(plate);

    }

}
