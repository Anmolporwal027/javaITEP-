/**
 WAP to calculate area of rectangle
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        float l = sc.nextFloat();
        System.out.println("Enter breadth ");
        float b = sc.nextFloat();
        float area = l * b ;
        System.out.print("area "+area);
    }
}