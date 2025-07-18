/*
    
 */

import java.util.Scanner;

class test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1");
        float s1 = sc.nextFloat();
        System.out.println("Enter side2");
        float s2 = sc.nextFloat();
        
        System.out.println("Enter perimeter");
        float peri = sc.nextFloat();
        float s3 = peri - (s1+s2);
        float s = (s1+s2+s3)/2;
        double area = Math.sqrt(s * (s-s1) * (s-s2) * (s-s3));
        System.out.println("Area of the triangle is "+area);
    }
}