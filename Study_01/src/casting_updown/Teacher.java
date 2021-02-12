package casting_updown;

public class Teacher extends Person{
    public Teacher(String name) {
        super(name);
    }
    public void introduce() {
        super.printName();
        System.out.println("And I am teaching students.");
    }
}
