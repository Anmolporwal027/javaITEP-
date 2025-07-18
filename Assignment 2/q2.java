/* 
   The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter
*/
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter area ");
        float area = sc.nextFloat();

        System.out.println("Enter breadth ");
        float bre = sc.nextFloat();

        float len;

        len = area / bre;
        System.out.println("lenght is : "+len);
         
        float peri = 2*(len + bre);
        System.out.println("Perimeter is : "+peri);
    }
}