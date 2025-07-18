/**
 Java program to check whether the triangle is valid or not if angles are given. Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180. 
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle 1 ");
        int a1 = sc.nextInt();
        System.out.println("Enter angle 2 ");
        int a2 = sc.nextInt();
        System.out.println("Enter angle 3 ");
        int a3 = sc.nextInt();
        int sum = a1+a2+a3;
        if(sum == 180){
            System.out.println("Given triangle is valid : ");
        }
        else{
            System.out.println("Given triangle is not valid : ");
        }
       
    }
}