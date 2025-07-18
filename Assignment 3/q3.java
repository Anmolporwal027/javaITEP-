/*
    3.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.
 */

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year of service ");
        int year = sc.nextInt();
        System.out.println("Enter your salary");
        int salary = sc.nextInt();
        
        
        if(year > 5){

            float bonus = salary*(5.0f/100);
            System.out.println("total bonus "+bonus);
        }
        else{
            
            System.out.println("there is no bonus ");
        }
    }
}