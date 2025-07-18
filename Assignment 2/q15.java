/*
    Shelly has a rectangular garden of length 22 m and breath 15 m. Her friend Rachel has a square garden of side 21 m. Whose garden is bigger and by how much?
 */
import java.util.Scanner;

class test{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter shelly length ");
        float slen = sc.nextFloat();
        
        System.out.println("Enter shelly breadth ");
        float sbree = sc.nextFloat();
        
        System.out.println("Enter rachel square garden side ");
        float r = sc.nextFloat();
     
        float rarea = r*r;
        float sarea = slen * sbree;

        System.out.println("Area of shelly is = "+ sarea);
        System.out.println("Area of rachel is = "+ rarea);
        System.out.println("difference is = "+(rarea - sarea));


    }
}