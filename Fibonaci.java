public class Fibonaci {
    static int fibonaci(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        return fibonaci(n - 1) + fibonaci(n - 2);
    }

    public static void main(String[] args) {
        System.out.print("Fibonaci: ");
        for (int i = 1; i <= 8; i++) {
            System.out.print(fibonaci(i) + " ");
        }
    }
    
}
