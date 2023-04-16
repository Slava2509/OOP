package HW1;

public class Main {
    public static void main(String[] args) {
        Parent father = new Parent("Иван", "Иванов", "Men",35, true);
        father.getRelationship();
        Children sun = new Children("Петр", "Иванов", "Men",5, true);
        sun.getRelationship();
        Stranger stranger = new Stranger("Василий", "Васильев", "Men", true);
        stranger.getRelationship();




//        Human children = new Human();

    }
}
