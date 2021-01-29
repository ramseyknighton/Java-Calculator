import java.sql.SQLOutput;

//This class inherits from Calculator
public class MagicCalculator extends Calculator{

    //Create a Square Root Method
    public static int squareRoot(int num1) {
        return (int) Math.sqrt(num1);
    }

    //Create a Sin Method
    public static int sin(int num1) {
        return (int) Math.sin(num1);
    }

    //Create a Cosine Method
    public static int cosine(int num1) {
        return (int) Math.cos(num1);
    }

    //Create a Tangent Method
    public static int tangent(int num1) {
        return (int) Math.tan(num1);
    }

    //Create a Factorial Method
    public int factorial(int num1) {
        long fact = 1;
        for (int i = 2); i <= n; i++) {
            fact = fact * i;
        }
        return (int) fact;
    }


}
