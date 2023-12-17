import java.util.ArrayList;
import java.util.List;

public class StudentArray {
    protected List<Student> students  = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public StudentArray(){}
    public StudentArray(List<Student> students) {
        this.students = students;
    }
    public int getSize(){
        return students.size();
    }
    public boolean isEmpty(){
        return students.isEmpty();
    }
    public void studentArrayOut(){
        for(Student x: students){
            System.out.printf("%-20s %-40s %-20d %-20s %-20f\n" , x.getId() ,x.getName() ,x.getAge() , x.getAddress() , x.getGpa());
        }
    }
    public void findByName(String name){
        System.out.println("Find by name: " + name);
        for(Student x: students){
            if(x.getName().compareToIgnoreCase(name) == 0){
                System.out.printf("%-20s  %-40s %-20d %-20s %-20f\n" , x.getId() ,x.getName() ,x.getAge() , x.getAddress() , x.getGpa());
            }
        }
    }
}
