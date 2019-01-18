
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    // instance variables - replace the example below with your



    public double addNumbers(int n1, int n2) {
        return n1 + n2;
    }
    
    public double subtractNumbers(int n1, int n2) {
        return n1 - n2;
    }
    
    public double divideNumbers(int n1, int n2) {
        if (n2 == 0) return 0;
        return n1 / n2;
    }
    
    public double multiplyNumbers(int n1, int n2) {
        return n1 * n2;
    }
    
    public double modDivideNumbers(int n1, int n2) {
        return n1 % n2;
    }
}
