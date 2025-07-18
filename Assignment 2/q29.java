/*
        How many square tiles of side 10 cm will be required to tile a floor measuring 800 cm by 900 cm?

 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length of the square tile");
        float side = sc.nextFloat();

        System.out.println("Enter floor length");
        float floorl = sc.nextFloat();

        System.out.println("Enter floor breadth");
        float floorb = sc.nextFloat();

        float farea = floorl * floorb;
        float tarea = side * side;
        float nooftile = farea/tarea;
        System.out.println("no of square tiles required are  "+nooftile);
       
    }
}