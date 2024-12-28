public class Edabit {
    public static void main(String[] args) {
        System.out.println(solutions(1, 0, -1));
        System.out.println(solutions(1, 0, 0));
        System.out.println(solutions(1, 0, 1));
    }
    public static int solutions(int a, int b, int c) {
        int D = b * b - 4 * a * c;


        if (D > 0) {
            return 2;
        } else if (D == 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
