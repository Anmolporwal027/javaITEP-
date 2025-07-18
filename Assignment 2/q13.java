/*
    The area of a right triangle is 184 cm² and one of its legs is 16 cm long. Find the length of other leg.
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base ");
        float b = sc.nextFloat();
        
        System.out.println("Enter area ");
        float area = sc.nextFloat();
        float h  = (area/b)*2;
        System.out.println("height of right triangle is : "+h);    }
}