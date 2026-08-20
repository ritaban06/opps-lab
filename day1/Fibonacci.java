import java.util.Scanner;

class Fibonacci {
    int n;

    void displaySeries() {
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fibonacci obj = new Fibonacci();

        System.out.print("Enter number of terms: ");
        obj.n = sc.nextInt();

        obj.displaySeries();

        sc.close();
    }
}