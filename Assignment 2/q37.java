/*
    The surface of the cylinder is 149 cm². The cylinder height is 6 cm. What is the diameter of this cylinder?
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter surface area ");
        double dia = sc.nextDouble();
        System.out.println("Enter height ");
        double hei = sc.nextDouble();
        System.out.println("Enter a ");
        int a = sc.nextInt();
        int b = 12;
        int c = -149;
        

        double r = (Math.sqrt(b*b-4*a*c/Math.PI)/4)-(3);
        System.out.println("diameter of the cylinder : "+(r*r));

    }
}