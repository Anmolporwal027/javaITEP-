/**
     The base and height of a triangle are in the ratio 8 : 5 and its area is 320 m². Find the height and base of the triangle.
 */

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        float hei = sc.nextFloat();
        System.out.println("Enter base");
        float base = sc.nextFloat();
        System.out.println("Enterarea");
        float area = sc.nextFloat();
        

        float x = (float)(Math.sqrt((2*area)/40));
        float B = 5*x;
        float H = 8*x;
        System.out.println("height = "+H);
        System.out.println("Base = "+B);
    }
}