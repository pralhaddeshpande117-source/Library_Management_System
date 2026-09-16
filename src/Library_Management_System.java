import java.util.HashSet;
import java.util.Scanner;
class Welcome{
    void welcome(){
        System.out.println("Welcome to the Advanvced Library management system developed by Pralhad Deshpande");
        System.out.println("Education is your Right");
    }
}
class StudentDetails extends Welcome{
    String name;
    int rollNo;
    String depart;
    void enterDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        name=sc.nextLine();
        System.out.print("Enter Your Roll No. : ");
        rollNo=sc.nextInt();
        System.out.print("Enter Your Department : ");
        depart=sc.next();
    }
}
class Books extends StudentDetails{
    HashSet<String> book = new HashSet<>();

}

public class Library_Management_System {
    static void main(String[] args) {
        StudentDetails sd = new StudentDetails(Set.of("Java","C++","DSA","MY SQL"));
        sd.welcome();
        sd.enterDetails();
    }
}
