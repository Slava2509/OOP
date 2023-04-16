package Homework1;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        Person person1 = new Person("Вячеслав", "Иванов", "мужской", 35, true);
        System.out.println(person1.display());
//        person1.setRelationship(true);
//        person1.getRelationship();
        Person  person2 = new Person("Екатерина", "Иванова", "женский", 35, true);
        System.out.println(person2.display());
        person2.setRelationship(true);
        person2.getRelationship();
        Person person3 = new Person("Артем", "Иванов", "мужской", 5, true);
        System.out.println(person3.display());
        person3.setRelationship(true);
        person3.getRelationship();
        Person person4 = new Person("Анастасия", "Иванова", "женский", 9, true);
        System.out.println(person4.display());
        person4.setRelationship(true);
        person4.getRelationship();
        Person person5 = new Person("Алексей", "Иванов", "мужской", 65, true);
        System.out.println(person5.display());
        person5.setRelationship(true);
        person5.getRelationship();
        Person person6 = new Person("Вячеслав", "Неиванов", "мужской", 35, false);
        System.out.println(person6.display());
        person6.setRelationship(false);
        person6.getRelationship();

    }
}
