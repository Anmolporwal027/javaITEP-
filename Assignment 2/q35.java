/*
    Find the surface area of the cylindrical solid whose radius is 7.7 cm and height is 12 cm.
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height ");
        double h = sc.nextDouble();
        System.out.println("Enter radius ");
        double r = sc.nextDouble();

        double sarea = 2*3.14*r*(r+h);
        System.out.println("surface area of the cylinder is "+sarea );
    }
}