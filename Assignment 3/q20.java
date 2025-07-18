/**
 WAP to exchange value of two variable without using third variable and arithmetic operator
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter var1 ");
        int v1 = sc.nextInt();
        System.out.println("Enter var2 ");
        int v2 = sc.nextInt();
        v1 = v1 ^ v2;
        v2 = v1 ^ v2;
        v1 = v1 ^ v2;

        System.out.print("var1 =  "+v1);
        System.out.print("var2 =  "+v2);
    }
}