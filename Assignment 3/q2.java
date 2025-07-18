/*
2.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity ");
        int quantity = sc.nextInt();
        int cost = quantity * 100;
        
        if(quantity > 1000){
            int discount = cost / 10;
            cost = cost - discount;
            System.out.println("cost after discount is "+cost);
        }
        else{
            
            System.out.println("cost without discount is "+cost);
        }
    }
}