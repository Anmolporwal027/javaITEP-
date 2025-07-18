/**
 * WAP to check wheather number is even or odd
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter val ");
        int val = sc.nextInt();
       
       if(val%2 == 0){
        System.out.print("va1ue is even  "+val);

       }else{
            System.out.print("value is odd "+val);
       } 
    }
}