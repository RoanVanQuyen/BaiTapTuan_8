import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentArraylist extends StudentArray{
    public StudentArraylist(){}
    public StudentArraylist(List<Student> students) {
        super(students);
    }

    public void add(Student student){
        System.out.println("Them thanh cong 1 sinh vien---------------------------------------------------------");
        students.add(student) ;
    }
    public void delete(int index){
        if(index >= 0 && index < students.size()) {
            System.out.println("Xoa thanh cong vi tri " + index + "---------------------------------------------------------");
            students.remove(index);
        }
        else{
            System.out.println("Don't ok ---------------------------------------------------------");
        }
    }
    public void sort(Comparator comparator){
        Collections.sort(students , comparator);
        System.out.println("Sắp xếp thành công---------------------------------------------------------");
    }
    public void fakeData(){
        students.add(new Student("Quyen" , 19 , "Lao Cai" , 3.6)) ;
        students.add(new Student("Quyen" , 20 , "Nam Dinh" , 3.4)) ;
        students.add(new Student("Chuc" , 42 , "Lao Cai" , 3.0)) ;
        students.add(new Student("Hue" , 40 , "Lao Cai" , 3.5)) ;
        students.add(new Student("Linh" , 19 , "Lao Cai" , 3.8)) ;
    }
}
