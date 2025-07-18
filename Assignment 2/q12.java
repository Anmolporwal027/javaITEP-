/*
 Find the area of a right angled triangle whose hypotenuse is 13 cm and one of its sides containing the right angle is 12 cm. Find the length of the other side.
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hypotenuse ");
        float hp = sc.nextFloat();
        System.out.println("Enter perpendicularr ");
        float pp = sc.nextFloat();

        float base = (float) Math.sqrt((hp*hp)-(pp*pp));
        System.out.println("Length other side is "+base);
        double area = (float) (1/2f)*base*pp;
        System.out.println("area =  "+area);
    }
}