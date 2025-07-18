/*
    The cylinder has a volume of 1287. The base has a radius 10. What is the area of the surface of the cylinder?
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter volume ");
        double vol = sc.nextDouble();
        System.out.println("Enter radius ");
        double r = sc.nextDouble();

        double h = vol/(Math.PI*r*r);
        double tsa = 2 * Math.PI * r * (h + r);

        System.out.println("Totl surface area "+tsa);

    }
}