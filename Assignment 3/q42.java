/**
 28. Write a C program to input electricity unit charges and calculate total electricity bill according to the given condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill. 
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total unit ");
        double unit = sc.nextInt();
        double amt = 0;
       
        if(unit <= 50){
            amt = 0.50*unit;
            System.out.println(amt);
        }
        else if(unit <= 150){
            amt = 0.50*unit + 0.75*(unit-50);
            System.out.println(amt);
        }
        else if(unit <= 250){
            amt = 0.50*unit + 0.75*100+1.20*(unit - 150);
            System.out.println(amt);
        }
       double supercharge = amt*0.20;
       double total = supercharge+ amt;
       System.out.println("total bill "+total);
    }
}