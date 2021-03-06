package exceptions;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arithmetic {
    public static void main(String[] args) {
        int x = 3;
        int y = 0;
        double z = 0;
        try {
            z = x / y;
        } catch (ArithmeticException e) {
            System.err.println(e);
        }
        System.out.printf("x = %d, y = %d, z = %s%n", x, y, z);

        try {
            Arithmetic.class.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            System.err.println(e);
        } finally {
            System.out.println("This gets called in any case");
        }
        System.out.printf("x = %d, y = %d, z = %s%n", x, y, z);

        Path path = Paths.get("src", "main", "java", "exceptions");
        try (BufferedReader br = Files.newBufferedReader(path.resolve("Arithmetic.java"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            throw new DemoException("This is exception demo");
        } catch (DemoException e) {
            System.err.println(e);
        }
    }
}
