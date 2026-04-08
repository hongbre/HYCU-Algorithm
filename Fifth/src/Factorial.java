public class Factorial {
    public int factorialFunction(int n) {
        // 0!과 1!은 동일하게 1이다.
        if (n <= 1) {
            System.out.println(n);
            return 1;
        } else {
            System.out.print(n + " * ");
            return n * this.factorialFunction(n - 1);
        }
    }
}
