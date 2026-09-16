import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        System.out.println();
    }
}
class Books extends StudentDetails{
    HashSet<String> book = new HashSet<>(Set.of("Java","C++","DSA","MY SQL"));
    Scanner sc = new Scanner(System.in);
    String choice;
    void enterChoice(){
        System.out.println("Enter a/A for Checking Available books.");
        System.out.println("Enter b/B for borrowing the books.");
        System.out.println("Enter r/R for returning the book.");
        System.out.println("Enter p/P for adding books.");
        System.out.print("Enter the choice : ");
        choice = sc.next();
        if (choice=="a"||choice=="A"){
            System.out.println("Available books : ");
            availBooks();
        }
        else if(choice=="b"||choice=="B"){
            borrowBooks();
        }
    }
    void availBooks(){
        System.out.println(book);
    }
    void borrowBooks(){
        System.out.println("Books");
    }


}

public class Library_Management_System {
    static void main(String[] args) {
        Books sd = new Books();
        sd.welcome();
//        sd.enterDetails();
        sd.enterChoice();
        sd.availBooks();
    }
}
