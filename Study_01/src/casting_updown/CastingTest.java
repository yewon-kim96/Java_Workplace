package casting_updown;

import java.util.Random;
public class CastingTest {
    public static void main(String[] args) {
        Random random = new Random();
        Person person;
        
        if (random.nextBoolean() == true) {
            person = new Teacher("Sullivan");
        } else {
            person = new Student("Helen");
        }
        if (person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            teacher.introduce();
        } else {
            Student student = (Student) person;
            student.introduce();
        }
    
    }
}