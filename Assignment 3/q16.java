/**
 WAP to calculate area of circle 
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        float radius = sc.nextFloat();

        float area = 3.14f * radius * radius ;
        System.out.print("area "+area);
    }
}