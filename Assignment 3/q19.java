/**
 WAP to exchange value to two variable with third variable and without third variable
 */

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter var1 ");
        float v1 = sc.nextFloat();
        System.out.println("Enter var2 ");
        float v2 = sc.nextFloat();
        v1 = v1 + v2;
        v2 = v1 - v2;
        v1 = v1 - v2;

        System.out.print("var1 =  "+v1);
        System.out.print("var2 =  "+v2);
    }
}