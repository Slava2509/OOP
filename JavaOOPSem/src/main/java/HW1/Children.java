package HW1;

public class Children extends Human{
    public Children(String name, String surname, String sex, int age, boolean relationship) {
        super(name, surname, sex, age, relationship);
    }

    public Children(String name, String surname, String sex, boolean relationship) {
        super(name, surname, sex, relationship);
    }

    public void setRelationship(boolean b) {
        this.isRelationship = isRelationship;
    }

    private boolean isRelationship;

    public void getRelationship (){
        if (!isRelationship) {
            System.out.println("Является ребенком");
        }
        else
            System.out.println("Не является ребенком");
    }


}
