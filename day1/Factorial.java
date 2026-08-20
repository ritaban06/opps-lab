import java.util.Scanner;

class Factorial {
    int n;

    void calculateFactorial() {
        long fact = 1;

        for (int i = 1; i <= n; i++)
            fact = fact * i;

        System.out.println("Factorial of " + n + " = " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Factorial obj = new Factorial();

        System.out.print("Enter a number: ");
        obj.n = sc.nextInt();

        obj.calculateFactorial();

    }
}