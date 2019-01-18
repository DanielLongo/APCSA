
/**
 * Write a description of class CalcDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalcDriver
{
    // instance variables - replace the example below with your own
    public static void main() {
        Calculator calc = new Calculator();
        System.out.println("Math operations of 10 and 4");
        System.out.println("Sum: " + calc.addNumbers(10, 4));
        System.out.println("Difference " + calc.subtractNumbers(10, 4));
        System.out.println("Quotient " + calc.divideNumbers(10, 4));
        System.out.println("Product " + calc.multiplyNumbers(10, 4));
        System.out.println("Mod " + calc.modDivideNumbers(10 ,4));
        
        

    }
}
