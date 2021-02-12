package casting_updown;

public class Person { //부모 클래스 타입
    public String name;
    public Person(String name) {
        this.name = name;
    }
    public void printName() {
        System.out.println("My name is "+ name + ".");
    }

}
