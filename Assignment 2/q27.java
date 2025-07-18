/*
    Find the cost of tiling a dining room 20 m long and 15 m wide at the rate of $ 5 per square m
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter room length");
        float l = sc.nextFloat();

        System.out.println("Enter room breadth");
        float b = sc.nextFloat();

        float area = l * b;
        float cost = area * 5;
        System.out.println("Total cost of tiling the dining room is "+cost);
       
    }
}