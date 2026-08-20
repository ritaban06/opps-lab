class PrimeNumber_1_100 {

    boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    void displayPrimes() {
        System.out.println("Prime numbers between 1 and 100:");

        for (int i = 1; i <= 100; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        PrimeNumber_1_100 obj = new PrimeNumber_1_100();

        obj.displayPrimes();
    }
}