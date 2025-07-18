/*
    Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m. 
 */

import java.util.Scanner;

class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of tile");
        float len = sc.nextFloat();
        System.out.println("Enter breadth of tile");
        float bre = sc.nextFloat();
       
        System.out.println("Enter rate per hundered squeare meter");
        float rate = sc.nextFloat();
        
        float area = len * bre;
        float cost = area * rate;

        System.out.println("Cost of tiling in "+area+" is "+cost/100);
    }
}