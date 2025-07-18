/*
    Find the Volume of Cylinder whose diameter and height are 2.25cm
 */

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter diameter ");
        double dia = sc.nextDouble();
        System.out.println("Enter height ");
        double hei = sc.nextDouble();
        
        double radi = dia/2f;
        double v = 3.14 * (radi * radi) * hei;

        System.out.println("Total volume : "+v);

    }
}