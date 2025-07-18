/*
    The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area.
 */
import java.util.Scanner;
class test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter perimeter ");
        float peri = sc.nextFloat();

        System.out.println("Enter length ");
        float len = sc.nextFloat();

        float breadth = (peri/2)-len;

        System.out.println("Breadth of the rectangle is "+breadth);

        
        float area = len * breadth;
        System.out.println("Area of rectangle is "+area);
    }
}