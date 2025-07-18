/*
Find the area of an equilateral triangle, the length of whose sides is 12 cm.
*/
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side");
        float side = sc.nextFloat();
        double area = (Math.sqrt(3)/4)*(side*side);
       System.out.println("area of traingle is "+area); 
    }
}