package casting_updown;

public class Student extends Person { //자식 클래스 타입
    public Student(String name){
        super(name);
    }
    public void introduce() {
        super.printName();
        System.out.println("And I'm studying.");
        
    }
    
}