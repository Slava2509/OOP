package Homework1;

public class Person extends Human {
    public Person(String name, String surname, String sex, Integer age) {
        super(name, surname, sex, age);
    }
    public Person(String name, String surname, String sex, Integer age, boolean isRelationship) {
        super(name, surname, sex, age);
        this.isRelationship = isRelationship;
    }
    public boolean isRelationship;


    public void setRelationship (boolean relationship) {
        this.isRelationship = relationship;
    }

    public  void getRelationship (){
        if (isRelationship = true)
            System.out.println("Имеется родственная связь");
        else
            System.out.println("Родственной связи нет");
    }

public String display() {
    return "Human{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", sex='" + sex + '\'' +
            ", age=" + age +
            ", relationship=" + isRelationship +
            '}';
}
    public void Person(String name, String surname, String sex, Integer age, boolean isRelationship) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.isRelationship = isRelationship;
    }
}

