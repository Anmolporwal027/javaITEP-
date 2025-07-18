/**
 * 8. Find the base of a triangle whose altitude is 20 cm and area is 0.8 m².
 */

import java.util.Scanner;

class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        float height = sc.nextFloat();
        System.out.println("Enter area");
        float area = sc.nextFloat();
       
        height = height/100;
        double base = (area/height)*2;
        System.out.println("Base of the triangle is "+base);
    }
}