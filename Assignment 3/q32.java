/**
 W.A.P to check whether given number is even or odd Without using % operator. 
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no ");
        int num = sc.nextInt();

        if((num & 1) == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

       
    }
}