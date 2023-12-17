import java.util.*;

public class Main {



    public static void main(String[] args) {
        StudentArraylist studentArraylist = new StudentArraylist() ;
        studentArraylist.fakeData();
        Scanner Ip = new Scanner(System.in) ;
        int choose  = -1;
        do{
            System.out.print("1.Thêm một sinh viên mới\n2.Xoá một sinh viên khỏi danh sách\n3.Hiển thị danh sách sinh viên theo định dạng" +
                    "\n4.Tìm kiếm sinh viên theo tên\n5.Sẵp xếp sinh viên theo thứ tự:");
            choose = Ip.nextInt() ;
            if(choose == 1) {
                Student student = new Student();
                Ip.nextLine() ;
                student.Input();
                studentArraylist.add(student);
            }
            if(choose == 2){
                studentArraylist.studentArrayOut();
                System.out.printf("ID: ");
                int index = Ip.nextInt() ;
                studentArraylist.delete(index);
            }
            if(choose == 3 ){
                System.out.printf("%-20s %-40s %-20s %-20s %-20s\n" , "ID" , "Name" , "Age" , "Address" , "Gpa");
                studentArraylist.studentArrayOut();
            }
            if(choose ==4 ){
                Ip.nextLine() ;
                System.out.printf("Find by name: ");
                String name = Ip.nextLine().trim();
                studentArraylist.findByName(name);
            }
            if(choose == 5){
                System.out.print("-1.Sắp xếp tăng dần theo tuổi\n-2.Sắp xếp tằng dần theo Gpa\n-3.Sắp xếp theo tuổi tằng dần , tuổi bằng nhau Gpa giảm dần\n-4.SORT-SORT-SORT-SORT :");
                int sortIndex = Ip.nextInt() ;
                if(sortIndex == 1) {
                    studentArraylist.sort(new SortByAge());
                }
                if(sortIndex == 2){
                    studentArraylist.sort(new SortByGpa());
                }
                if(sortIndex == 3){
                    studentArraylist.sort(new SortByAGEAscAndGPADesc());
                }
                if(sortIndex == 4){
                    studentArraylist.sort(new What_is_the_sort());
                }
            }
        }while (choose >= 0 && choose <= 5 ) ;
    }
}