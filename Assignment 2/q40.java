/*
    Calculate the volume of the cylinder: r = 5 cm, h = 9 cm
 */

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius ");
        double r = sc.nextDouble();
        System.out.println("Enter height ");
        double hei = sc.nextDouble();
        
 
        double volume = Math.PI *(r * r)* hei;

        System.out.println("volume of the cylinder : "+volume);

    }
}