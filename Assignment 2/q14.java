/*
    The length of one of the diagonals of a field in the form of a quadrilateral is 46 m. The perpendicular distance of the other two vertices from the diagonal are 13 m and 10 m, find the area of the field
 */
import java.util.Scanner;

class test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter diagonal ");
        float diag = sc.nextFloat();
        
        System.out.println("Enter s1 ");
        float s1 = sc.nextFloat();
        
        System.out.println("Enter s2 ");
        float s2 = sc.nextFloat();

        float a1 , a2;

        a1 = (1/2f)*diag*s1;
        a2 = (1/2f)*diag*s2;
        System.out.println("Area of the field is : "+(a1+a2));
    }
}