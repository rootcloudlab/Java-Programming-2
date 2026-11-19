/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 06 [Topic - Functions & Recursion]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Function_Recursion;

import java.util.Scanner;

//////////////// calculate the sum of first n natural numbers using recursion ///////////////////////

public class Concept7 {
    public static int sum_of_first_n_no(int num){
        if(num == 1){
            return 1;
        }
        if(num == 0){
            return 0;
        } 

        int sum = num + sum_of_first_n_no(num-1);

        return sum;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter a natural number = ");
            int num = sc.nextInt();

            System.out.println("summation = "+sum_of_first_n_no(num));
        }
    }
}
