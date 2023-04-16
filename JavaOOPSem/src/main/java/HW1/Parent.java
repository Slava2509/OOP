package HW1;

public class Parent extends Human {

    private boolean isRelationship;
    public Parent(String name, String surname, String sex, int age, boolean isRelationship) {
        super(name, surname, sex, age,isRelationship);
    }
    public Parent(String name, String surname, String sex, boolean relationship) {
        super(name, surname, sex, relationship);
    }

    public void setRelationship(boolean b) {
        this.isRelationship = isRelationship;
    }

    public void getRelationship (){
        if (!isRelationship) {
            System.out.println("Является родителем");
        }
        else
            System.out.println("Не является родителем");
    }


}
