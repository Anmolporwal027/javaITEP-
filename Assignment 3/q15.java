/**
 15. Write a java program to accept the cost price of a bike
    and display the road tax to be paid according to the 
    following criteria.
    Cost Price(In Rs)		Tax
     > 100000			 15%
     >50000 and <=100000	 10%
     <=50000			 5%	
 */

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of the bike ");
        int cost = sc.nextInt();
        float tax;
        float totalwithtax;
        if(cost > 100000){
            totalwithtax = cost*1.15f;
            tax = totalwithtax-cost;
            System.out.println("tax for bike more than 100000  : "+tax);
        }
        else if(cost > 50000 && cost <= 100000){
            totalwithtax = cost*1.10f;
            tax = totalwithtax-cost;
            System.out.println("tax for bike more than  50000 : "+tax);
        }
        else if(cost <= 50000){
            totalwithtax = cost*1.05f;
            tax = totalwithtax-cost;
            System.out.println("tax for bike less than 50000 : "+tax);
        }
    }
}