import java.util.Comparator;

public class SortByAGEAscAndGPADesc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge() > 0 ? 1 : (o1.getAge() - o2.getAge() == 0 ? Double.compare(o2.getGpa() , o1.getGpa()) : -1)  ;
    }
}
