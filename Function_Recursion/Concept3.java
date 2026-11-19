/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 06 [Topic - Functions & Recursion]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Function_Recursion;

//////////// use it with some multiple double & int values //////////

public class Concept3{
    public static double squre(int num){
        return Math.pow(num,2);
    }
    public static double root(int num){
        return Math.sqrt(num);
    }
    public static double cube(int num){
        return Math.pow(num,3);
    }
    public static double cube_root(int num){
        return Math.cbrt(num);
    }


    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 64;
        int num3 = 5;
        int num4 = 27;

        System.out.println("squre value of "+ num1 +" is = "+squre(num1));
        System.out.println("root value of "+ num2 +" is = "+root(num2));
        System.out.println("cube value of "+ num3 +" is = "+cube(num3));
        System.out.println("cube root value of "+ num4 +" is = "+cube_root(num4));
    }
}