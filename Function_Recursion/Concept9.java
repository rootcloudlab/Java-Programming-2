/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 06 [Topic - Functions & Recursion]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Function_Recursion;

import java.util.Scanner;

/////////// print the nth term of the fibonacci numbers //////////////

public class Concept9 {
    public static int fibo(int term){
        if(term == 1){
            return 1;
        }
        if(term == 0){
            return 0;
        }
        int fibonacci = fibo(term-1) + fibo(term-2);
        return fibonacci;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter the term no  = ");
            int term = sc.nextInt();

            for(int i = 0 ; i <= term ; i++){
                System.out.println(i + " the nth no fibonacci number is = "+fibo(i));
            }
        }
    }
}
