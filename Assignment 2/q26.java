/*
    How many bricks will be required to lay a path 120 m long and 2.4 m breadth if a brick is 24 cm long and 15 cm wide?
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float  PathA, BrickA;
        System.out.println("Enter path length");
        float Pathl = sc.nextFloat();

        System.out.println("Enter path breadth");
        float Pathb = sc.nextFloat();

        System.out.println("Enter brick length");
        float Brickl = sc.nextFloat();

        System.out.println("Enter brick breadth");
        float Brickb = sc.nextFloat();

        Pathl= Pathl*100;
        Pathb= Pathb*100;
        PathA = Pathl*Pathb;       
        BrickA = Brickl * Brickb;

        float totalbrick = PathA/BrickA;
        System.out.println(" total bricks require is "+totalbrick);
    }
}