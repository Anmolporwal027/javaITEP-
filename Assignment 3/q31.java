/**
 W.A.P to check the sign of given number.
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to check sign");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Num sign is + ");
        }else if(num < 0){
            System.out.println("Num sign is - ");
        }
        else{
            System.out.println("NUm is zero");
        }
    }
}