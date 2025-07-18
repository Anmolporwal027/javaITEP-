/**
 .Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400. 
 */

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year ");
        int year = sc.nextInt();

        if(year%4 == 0){
            System.out.println("Given year "+year+" is leap year");
        }else if(year%400 == 0){
            System.out.println("Given year "+year+" is leap year");
        }else{
            System.out.println("it is not a leap year ");
        }
        
    }
}