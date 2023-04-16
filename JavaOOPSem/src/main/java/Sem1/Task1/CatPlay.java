package Sem1.Task1;

public class CatPlay {
    public static void main(String[] args) {
        Cat tiger = new Cat("Тигр", "Артем",15, 300.6, true, true, false  );
        tiger.say();
//
//        tiger.type = "Тигр";
//        tiger.name = "Артём";
//        tiger.age = 15;
//        tiger.weight = 300.6;
//        tiger.isSwim = true;
//        tiger.isWalk = true;
//        tiger.isFly = false;
        System.out.println(tiger.display());
        tiger.rename("Антон");
        System.out.println("Type: " + tiger.type + ". Name: " + tiger.name);
        System.out.println(tiger.display());

        Cat1 leo = new Cat1("Леопард", "Лео", 10, 200.6);
//        tiger.type = "Леопард";
//        tiger.name = "Лео";
//        tiger.age = 10;
//        tiger.weight = 200.6;
        leo.say ();
        leo.setColor("yellow");
//
        System.out.println(tiger.display());
        tiger.rename("Раф");
        System.out.println("Type: " + tiger.type + ". Name: " + tiger.name);
        System.out.println(tiger.display());
        System.out.println(leo.getColor());
    }
//        Animal tiger = new Animal();
//        tiger.type = "тигр";
//        tiger.name = "Артём";
//        tiger.age = 15;
//        tiger.weight = 300.6;
//        tiger.isSwim = true;
//        tiger.isWalk = true;
//        tiger.isFly = false;
//        tiger.display();
//        tiger.rename("Антон");
//        System.out.println( tiger.display());
//    }


}
