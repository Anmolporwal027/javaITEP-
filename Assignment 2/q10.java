/*
    Find the area of an isosceles right angled triangle of equal sides 15 cm each.
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        double hei = sc.nextDouble();
        System.out.println("Enter base");
        double base = sc.nextDouble();
        

        double area = (1/2f)*base*hei;

         System.out.println("Area = "+ area);
    }
}
