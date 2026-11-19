/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 06 [Topic - Functions & Recursion]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Function_Recursion;

import java.util.Scanner;

/////////// calculate the factorial of n //////////////

public class Concept8 {
    public static int factorial(int num){

        if(num == 1){
            return 1;
        }
        return (num * factorial(num-1));
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter a natural number = ");
            int num = sc.nextInt();

            System.out.println("factorial = "+factorial(num));
        }
    }    
}
