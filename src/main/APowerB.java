public class APowerB {
    public double calcAPowerB (double A, int B) {
        double result = 1.0;

        if(A < 0.0) {
            return Double.NaN;
        }

        if (B == 0) {
            return result;
        }

        if (B < 0) {
            A = 1/A;
            B = -B;
        }

        for(int i = 0; i < B; i++) {
            result = result * A;
        }

        return result;
    }
    public static void main(String[] args) {
        APowerB power = new APowerB();
        System.out.println(power.calcAPowerB(2, 3));
    }
}
