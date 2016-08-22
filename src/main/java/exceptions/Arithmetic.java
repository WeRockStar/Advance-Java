package exceptions;


public class Arithmetic {
    public static void main(String[] args) {
        int x = 3;
        int y = 0;
        double z = 0;
        try {
            z = x / y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.printf("x = %d, y = %d, z = %s%n", x, y, z);
    }
}
