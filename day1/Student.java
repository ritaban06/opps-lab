import java.util.Scanner;

class Student {
    // Instance data members
    String name;
    int roll_no;
    String phone_no;

    // Method to display student information
    void display() {
        System.out.println("\n--- Student Information ---");
        System.out.println("Name     : " + name);
        System.out.println("Roll No  : " + roll_no);
        System.out.println("Phone No : " + phone_no);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create object
        Student s1 = new Student();

        System.out.print("Enter student name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter roll no: ");
        s1.roll_no = sc.nextInt();

        System.out.print("Enter phone no: ");
        s1.phone_no = sc.next();

        s1.display();

    }
}