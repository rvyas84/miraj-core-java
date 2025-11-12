public class Fibonacci {
    public void calFibo(int num) {
        int num1 = 0;
        int num2 = 1;

        for(int i = 1; i <= num; i++) {
            System.out.print(num1 + " ");
            int result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
        System.out.println();
    }

    public long calFiboRecursive(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        return calFiboRecursive(num - 1) + calFiboRecursive(num - 2);
    }

    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        fibo.calFibo(10);

        for (int i = 0; i < 11; i++) {
            System.out.print(fibo.calFiboRecursive(i) + " ");
        }
    }
}
