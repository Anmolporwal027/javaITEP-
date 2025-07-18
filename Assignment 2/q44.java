/*
    Find the 28th term of an Arithmetic Progression -21 -18 -15 -12 . . . . . 
 */

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter term to get value of arithmatic progression -21 -18 -15 -12 . . . . . ");
        int n = sc.nextInt();
        
        int ap = -21 + ( n - 1)* 3;
        System.out.println(+n+"th term is "+ap);

    }
}