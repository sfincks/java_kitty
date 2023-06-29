import java.util.HashSet;

public class OOPMain {

    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik", 100);
        Plate plate = new Plate(150);

        System.out.println(murzik);
        System.out.println(plate);

        murzik.eat(plate);
        System.out.println(murzik);
        murzik.eat(plate);
        // не могу понять почему при сытости равной 0, во время обращения к методу plate.decreaseFood котик съедает ещё одну порцию

        System.out.println(murzik);
        System.out.println(plate);

    }

}
