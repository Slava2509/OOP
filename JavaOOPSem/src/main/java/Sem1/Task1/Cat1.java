package Sem1.Task1;

public class Cat1 extends Cat {
    public Cat1(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
    }

    public Cat1(String type, String name, int age, double weight) {
        super(type, name, age, weight);
    }

    @Override
    public void say () {
        System.out.println("Гав, гав");
    }

    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void getColor(String color) {
    }
}
