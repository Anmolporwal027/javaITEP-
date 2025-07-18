/*
    1. Take values of length and breadth of a rectangle from user and check if it is square or not.
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        int len = sc.nextInt();
        System.out.println("Enter breadth ");
        int bre = sc.nextInt();

        
        if(len == bre){
            System.out.println("it is a square");
        }
        else{
            System.out.println("it is not a square");
        }
    }
}