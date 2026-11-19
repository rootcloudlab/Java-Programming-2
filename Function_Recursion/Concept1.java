/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 06 [Topic - Functions & Recursion]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Function_Recursion;

///////// prototype ////////////

import java.util.Scanner;

public class Concept1 {
    public static void print_name(String str){
        System.out.println("Your Full Name Is = "+str);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Your Name = ");
            String name = sc.nextLine();

            print_name(name);
        }
    }
}