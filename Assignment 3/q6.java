/**
Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1

 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("number ");
        int n = sc.nextInt();

        System.out.println("Abs value of "+n+" is "+Math.abs(n));
        
    }
}