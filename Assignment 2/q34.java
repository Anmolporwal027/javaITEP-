/*
34. A wooded area is in the shape of a a trapezoid whose bases measure 128 m and 92 m and its height is 40 m. A 4 m wide walkway is constructed which runs perpendicular to the two bases. Calculate the area of the wooded area after the addition of the walkway.
 */
import java.util.Scanner;
class test {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter trapzoid base 1");
        double tB1 = sc.nextDouble();
        System.out.println("Enter trapzoid base 1");
        double tB2 = sc.nextDouble();
        System.out.println("Enter trapzoid height ");
        double tH = sc.nextDouble();

        System.out.println("Enter walkaway width ");
        double walkwaywidth = sc.nextDouble();
        
        
        double woodenarea = 1/2f*(tB1+tB2)*tH; 
        double walkwayarea = 4 * 40;
        
         System.out.println("after addition of walkaway area is "+(walkwayarea+woodenarea));
     }
}