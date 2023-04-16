package Homework1;

public class Relationship extends Human {
    public String parent;
    public String children;
    public String sister;
    public String brother;
    public String grandfather;
    public String granfmother;

    public Relationship(String parent, String children, String sister, String brother, String grandfather, String granfmother) {
        this.parent = parent;
        this.children = children;
        this.sister = sister;
        this.brother = brother;
        this.grandfather = grandfather;
        this.granfmother = granfmother;
    }

    @Override
    public String toString() {
        return "Relationship{" +
                "parent='" + parent + '\'' +
                ", children='" + children + '\'' +
                ", sister='" + sister + '\'' +
                ", brother='" + brother + '\'' +
                ", grandfather='" + grandfather + '\'' +
                ", granfmother='" + granfmother + '\'' +
                '}';
    }
}
//