public class Factorial {

    public long calcFactRecursive(int num) {
        if(num == 0) {
            return 1;
        }
        return num * calcFact(num - 1);
    }

    public long calcFact(int num) {
        long result = 1;
        if(num == 0) {
            return 1;
        }
        for(int i = 1; i <= num ; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.calcFactRecursive(6));
        System.out.println(fact.calcFact(5));
    }
}
