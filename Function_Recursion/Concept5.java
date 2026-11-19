/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 06 [Topic - Functions & Recursion]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Function_Recursion;

import java.util.Scanner;

//////////////// Recursion ///////////////////////

public class Concept5{
    public static void greet(int n){
        if(n == 0){
            return;
        }
        System.out.println("Good Night "+ n);
        greet(n-1);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter number = ");
            int num = sc.nextInt();

            greet(num);
        }
    }
}