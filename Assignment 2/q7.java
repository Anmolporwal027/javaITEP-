/*
    Find the height of a triangle whose base is 50 cm and whose area is 500 cm².
 */

import java.util.Scanner;

class test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        float base = sc.nextFloat();
        System.out.println("Enter area");
        float area = sc.nextFloat();
        
        float height = (area/base)*2;

        System.out.println("Height of the triangle is : "+height);
    }
}