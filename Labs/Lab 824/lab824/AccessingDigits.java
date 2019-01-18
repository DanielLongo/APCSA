// A+ Computer Science  -  www.apluscompsci.com

//this example demonstrates how to to use a
//while loop to access all of the digits of a number

public class AccessingDigits
{
   public static void main(String args[])
   {
        int number = 987654321;
        int total = 0; 
        int onesValue = 0;
        System.out.println(12 % 10);
       while (number > 0) {
           onesValue = (number % 10);
           System.out.println(onesValue);
           total = total + onesValue;
           number = number/10;
           System.out.println("total: " + total + " " + " number " + number);
         }
    }
}
