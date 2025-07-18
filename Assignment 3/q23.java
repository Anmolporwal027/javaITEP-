/**
 WAP to check wheater number is positive or negative
 */

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter val ");
        int val = sc.nextInt();
       
       if(val < 0){
        System.out.print("va1ue is negative "+val);

       }else if(val > 0){
            System.out.print("value is positive "+val);
       } 
       else {
            System.out.print("equal to zero "+val);
       }
    }
}