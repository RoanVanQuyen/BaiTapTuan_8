import java.util.Comparator;

public class What_is_the_sort implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() % 2 ==0 && o2.getAge() % 2 != 0) {
            return  -1 ;
        }
        else{
            if(o1.getAge() % 2 !=0 && o2.getAge() % 2 == 0) {
                return 1 ;
            }
            else{
                if(o1.getAge() % 2  == 0 && o2.getAge() % 2 ==0){
                    return o1.getAge() - o2.getAge()  > 0 ? 1 : (o1.getAge() - o2.getAge()  ==  0 ? Double.compare(o1.getGpa(), o2.getGpa()) : -1) ;
                }
                return o2.getAge() - o1.getAge()  > 0 ? 1 : (o1.getAge() - o2.getAge()  ==  0 ? Double.compare(o1.getGpa(), o2.getGpa()) : -1) ;
            }
        }
    }
}
