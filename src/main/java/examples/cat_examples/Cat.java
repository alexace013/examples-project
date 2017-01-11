package examples.cat_examples;

public class Cat {

    private String name;
    private int weight;
    private String color;
    private int growth;
    private int length;
    private int power;

    public Cat() {
        name = "DEFAULT";
        weight = 10;
        color = "brown";
        growth = 10;
        length = 10;
        power = setPower();
    }

    public Cat(String name, int weight, String color,
               int growth, int length) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.growth = growth;
        this.length = length;
        this.power = setPower();
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", growth=" + growth +
                ", length=" + length +
                ", power=" + power +
                '}';
    }

    private int setPower() {
        return (this.weight + this.growth + this.length) / 3;
    }

}
