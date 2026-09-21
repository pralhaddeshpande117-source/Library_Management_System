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
        System.out.println("Enter 1 for Checking Available books.");
        System.out.println("Enter 2 for Borrowing the books.");
        System.out.println("Enter 3 for Returning the book.");
        System.out.println("Enter 4 for Adding New books.");
        System.out.println("Enter 5 for Exit.");
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
        System.out.println("Enter the name of the book for borrowing : ");
        nameOfBook=sc.next();
//        if (book.contains(nameOfBook)){
//            System.out.println("<<<Book Found>>>");
//            book.remove(nameOfBook);
//        }

        for(String b : book){
            if(b.equalsIgnoreCase(nameOfBook)){
                System.out.println("<<<Book Found>>>");
                book.remove(nameOfBook);
                System.out.println("<<<Book is issued>>>");
                System.out.print("Available Books : ");
                System.out.println(book);
            }
            return ;
        }
        System.out.println("Book Not Found");


    }
    void returnBook(){
        for(int i=0;i<noOfBooks;i++){
            System.out.print("Enter the name of the book : ");
            nameOfBook=sc.next();
            book.add(nameOfBook);
        }
        System.out.println("<<<Book Returned Successfully>>>");
        checkAvailBooks();
    }



}

public class Library_Management_System {
    static void main(String[] args) {
        int choice=1;
        Scanner sc = new Scanner(System.in);
        Books sd = new Books();
        sd.welcome();
        sd.enterDetails();
        sd.enterChoice();
        System.out.println();
        while(choice<=5) {
        System.out.print("Enter the choice : ");
        choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sd.checkAvailBooks();
                    break;
                case 2:
                    sd.borrowBook();
                    break;
                case 3:
                    sd.returnBook();
                    break;
                case 4:
                    sd.addBooks();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Choice.");
            }
            System.out.println();
            choice++;

        }

    }
}
