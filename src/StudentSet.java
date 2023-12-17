import java.util.*;

public class StudentSet extends StudentArray{
    private Set<Student> set  ;
    public StudentSet() {
        set = new TreeSet<>(new SortByGpa()) ;
    }

    public StudentSet(List<Student> studentsList) {
        set = new TreeSet<>(new SortByGpa()) ;
        set.addAll(studentsList) ;
        students.addAll(set) ;
    }
    public void insert(Student student){
        set.add(student) ;
    }
    public void remove(Student student){
        set.remove(student) ;
    }
    public boolean contain(Student student){
        return set.contains(student) ;
    }

    private void getSet(){
        students.clear();
        students.addAll(set)  ;
    }
    @Override
    public List<Student> getStudents() {
        getSet();
        return super.getStudents();
    }

    @Override
    public int getSize() {
        getSet();
        return super.getSize();
    }

    @Override
    public boolean isEmpty() {
        getSet();
        return super.isEmpty();
    }
}

