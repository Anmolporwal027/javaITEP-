/*
    What is the surface area of a cylinder if the diameter is 15m height is 7m?
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
        double totals = 2 * 3.14 * radi * ( hei + radi);

        System.out.println("Total surface area : "+totals);

    }
}

