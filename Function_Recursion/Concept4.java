/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 06 [Topic - Functions & Recursion]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Function_Recursion;

import java.util.Scanner;

////////////////////// summation & factorial using function //////////////////////////

public class Concept4 {
    public static int first_n_natural_number_summation(int num){
        int sum = 0;
        for(int i = 1 ; i <= num ; i++){
            sum += i;
        }
        return sum;
    }
    public static int first_n_natural_number_factorial(int num){
        int fact = 1;
        for(int i = 1 ; i <= num ; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter number = ");
            int num = sc.nextInt();

            System.out.println("the summation of first "+ num +" natural number is = "+first_n_natural_number_summation(num));
            System.out.println("the factorial of first " + num +" natural number is = "+first_n_natural_number_factorial(num));

        }
    }
}
