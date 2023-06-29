import java.util.Objects;

public class Cat {


    private String name; // поле, содержащее имя кота
    private int appetite; // аппетит кота (столько он съедает за раз)
    private int satiety; // сытость (голодный или нет)
    private int hunger;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = 4;
        hunger = (appetite / 10) * satiety;
    }

    // getter
    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (satiety == 0) {
            System.out.println("I'm full");
//        } else if (plate.decreaseFood(hunger) == 0 && satiety != 0) {

        }else {
            plate.decreaseFood(hunger);
            System.out.println("MIAY c:");
            satiety = 0;
        }
//        else if (plate.decreaseFood(hunger) == 0) {
//            System.out.println("No food T.T");
    }

    @Override
    public String toString() {
        return name + " [" + appetite + "], " + "satiety?" + satiety;
    }


}
