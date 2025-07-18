/*
    Find the sum of 28 terms of an Arithmetic Progression -21 -18 -15 -12 . . . . .
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter term till you want to get sum of arithmatic progression -21 -18 -15 -12 . . . . . ");
        int n = sc.nextInt();
        
        int sum = (n * (2 * (-21) + (n - 1) * 3)) / 2;
        System.out.println(+n+"th term sum is "+sum);

    }
}