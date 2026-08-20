import java.util.Scanner;

class LargestThree {
    int a, b, c;

    void findLargest() {
        int largest;

        if (a > b && a > c)
            largest = a;
          else if (b > c)
            largest = b;
          else
            largest = c;

        System.out.println("Largest number: " + largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LargestThree obj = new LargestThree();

        System.out.print("Enter first number: ");
        obj.a = sc.nextInt();

        System.out.print("Enter second number: ");
        obj.b = sc.nextInt();

        System.out.print("Enter third number: ");
        obj.c = sc.nextInt();

        obj.findLargest();

        sc.close();
    }
}