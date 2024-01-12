import java.util.*;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = input.next();
        System.out.println("Hello, " + name);
        System.out.println("The Quadratic formula is -b +- sqrt(b^2 - 4ac)");
    }
}