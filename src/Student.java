import java.util.Scanner;

public class Student extends SortByGpa {
    private static  int ID  = 0;
    private int id ;
    private String name ;
    private int age ;
    private String address;
    private double gpa ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public Student(){}
    public Student(String name, int age, String address, double gpa) {
        this.id = ID;
        ID++;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public void Input(){
        Scanner Ip = new Scanner(System.in) ;
        id = ID ; ID++ ;
        System.out.printf("Name: ");
        name = Ip.nextLine().trim();
        System.out.printf("Age: ");
        age = Ip.nextInt()  ;
        Ip.nextLine() ;
        System.out.printf("Address: ");
        address = Ip.nextLine()  ;
        System.out.printf("GPA: ");
        gpa = Ip.nextDouble()  ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
