package HW1;

public class Stranger extends  Human {

    private boolean isRelationship;
    public Stranger(String name, String surname, String sex, int age, boolean relationship) {
        super(name, surname, sex, age, relationship);
    }

    public Stranger(String name, String surname, String sex, boolean relationship) {
        super(name, surname, sex, relationship);
    }

    public void setRelationship(boolean b) {
        this.isRelationship = isRelationship;
    }
    public void getRelationship (){
        if (!isRelationship) {
            System.out.println("Не является родственником");
        }
        else
            System.out.println("Ошибка");
    }
}
