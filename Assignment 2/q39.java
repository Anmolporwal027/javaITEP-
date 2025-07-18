/*
    Find the surface of the cylinder if its diameter is 12 centimeters and its height is 9 centimeters.
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter diameter ");
        double dia = sc.nextDouble();
        System.out.println("Enter height  ");
        double h = sc.nextDouble();
        double r = dia/2f;
        double tsa = 2 * Math.PI * r * ( r + h);

        System.out.println("total surface area of the cylinder is "+tsa);
    }
}