package HW1;

public abstract class Human {
    private String name;
    private String surname;
    private String sex;
    private int age;
    private boolean relationship;

    public Human(String name, String surname, String sex, int age, boolean relationship) {
        setValues(name, surname, sex, age, relationship);
        System.out.println((getValues()));
    }
    public Human(String name, String surname, String sex, boolean relationship) {
        setValues(name, surname, sex, age, relationship);
        System.out.println((getValues()));
    }

    public void setValues(String name, String surname, String sex, int age, boolean relationship) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.relationship = relationship;
    }

//    public void getRelationship (){
//        if (relationship = false) {
//            System.out.println("Не является родственником");
//        }
//
//    }

    public String getValues() {
        String info = "Human name: " + name + ". Surname " + surname + ". age " + age + ". sex "
                + sex + ". Relationship " + relationship;
        return info;
    }

}
