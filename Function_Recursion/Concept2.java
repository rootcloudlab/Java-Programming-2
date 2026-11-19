/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 06 [Topic - Functions & Recursion]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Function_Recursion;

import java.util.Scanner;

///////////////////// use it with some int values (using 2 approach) //////////////////////////
public class Concept2 {
    // approach no : 1
    public static int sum(int a , int b){
        int sum = (a+b);
        return sum;
    }
    // approach no : 2
    public static void multi(int a , int b){
        int multi = (a*b);
        System.out.println("The multiplication of two numbers are = "+multi);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter 1st number = ");
            int num1 = sc.nextInt();
            System.out.print("enter 2nd number = ");
            int num2 = sc.nextInt();

            System.out.println("The summation of two numbers are = "+sum(num1,num2));
            multi(num1,num2);
        }
    }
}
