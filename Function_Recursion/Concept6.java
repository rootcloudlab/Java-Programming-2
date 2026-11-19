/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 06 [Topic - Functions & Recursion]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Function_Recursion;

import java.util.Scanner;

//////////////// print hello world n no of times //////////////////////

public class Concept6 {
    public static void print_hw(int n){
        if(n == 0){
            return;
        }
        System.out.println("Hello World");
        print_hw(n-1);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter number = ");
            int n = sc.nextInt();

            print_hw(n);
        }
    }
}
