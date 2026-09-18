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
    int noOfBooks;
    String nameOfBook;
    void enterChoice(){
        System.out.println("Enter a/A for Checking Available books.");
        System.out.println("Enter b/B for borrowing the books.");
        System.out.println("Enter r/R for returning the book.");
        System.out.println("Enter p/P for adding books.");
        System.out.print("Enter the choice : ");
//        choice = sc.next();

    }
    void checkAvailBooks(){
        System.out.print("Available Books : ");
        System.out.println(book);
    }
    void addBooks(){
        System.out.print("How many books want to add : ");
        noOfBooks=sc.nextInt();
        for(int i=0;i<noOfBooks;i++){
            System.out.print("Enter the name of the book : ");
            nameOfBook=sc.next();
            book.add(nameOfBook);
        }
        System.out.println("<<<Books added Successfully>>>");
        checkAvailBooks();
    }
    void borrowBook(){
        System.out.println("Enter the name of the book : ");
        nameOfBook=sc.next();
//        if (book.contains(nameOfBook)){
//            System.out.println("<<<Book Found>>>");
//            book.remove(nameOfBook);
//        }
        
        for(String b : book){
            if(b.equalsIgnoreCase(nameOfBook)){
                System.out.println("<<<Book Found>>>");
                book.remove(nameOfBook);
            }
            return ;
        }
        System.out.println("Book Not Found");


    }



}

public class Library_Management_System {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Books sd = new Books();
        sd.welcome();
//        sd.enterDetails();
        sd.checkAvailBooks();
//        sd.addBooks();
        sd.borrowBook();

    }
}
