/*
    . I need to calculate the cylinder volume with a height of 50 cm and a diameter of 30 cm.
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter diameter ");
        double dia = sc.nextDouble();
        System.out.println("Enter height ");
        double hei = sc.nextDouble();
        
        double r = dia/2f;
        double volume = Math.PI * (r * r) * hei;

        System.out.println("Total surface area : "+volume);

    }
}